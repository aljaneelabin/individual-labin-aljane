package com.joysistvi.day17.methods;

import java.util.Scanner;


public class LaodRegistratioSimulator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        dialUssdCode ();
    }

    public static void dialUssdCode () {
        System.out.print("\nEnter USSD Code: ");
        String ussdCode = scanner.nextLine();

        while (!ussdCode.equals("*143#")) {

            if (ussdCode.equals("0")) {
                exitMethod();
            }
            System.out.print("\nInvalid Code! Try again. ");
            System.out.print("\nEnter USSD Code: ");
            ussdCode = scanner.nextLine(); // for re-enter
        }
        mainMenu();
    }

    public static void mainMenu () {
       while (true) {
           System.out.println("--------------------------");
           System.out.println("    Load Registration    ");
           System.out.println("--------------------------");
           System.out.println("[1] Go+");
           System.out.println("[2] Go");
           System.out.println("[3] GoExtra");
           System.out.println("[4] Unli 5G");
           System.out.println("[5] ALLNET");
           System.out.println("[0] Exit");
           int mainMenu = enterChoice ("Enter your load: ");

           switch (mainMenu) {
               case 1 -> goPlus();
               case 2 -> go();
               case 3 -> goExtra();
               case 4 -> unli5G();
               case 5 -> allNet();
               case 0 -> exitMethod();
               default -> System.out.println("Invalid Input. Please try again.");
           }
       }
    }

    public static void goPlus () {
        System.out.println("\nYou choose Go+ Promos");
        System.out.println("[1] Go+99");
        System.out.println("[2] Go+129");
        System.out.println("[3] Go+149");
        System.out.println("[0] Back to Main Menu");
        int goPlusMenu = enterChoice("Choose your promo: ");

        switch (goPlusMenu) {
            case 1 -> loadDetails ("Go+99","8GB for all sites" , 8, 3);
            case 2 -> loadDetails ("Go+129", "12GB for all sites", 12, 7);
            case 3 -> loadDetails ("Go+149", "16GB for all sites", 16, 15);
            case 0 -> {return;}
            default -> System.out.println("Invalid Input. Please try again.");
        }
    }

    public static void go () {
        System.out.println("\nYou choose Go Promos");
        System.out.println("[1] Go55");
        System.out.println("[2] Go99");
        System.out.println("[3] Go129");
        System.out.println("[0] Back to Main Menu");
        int goMenu = enterChoice("Choose your promo: ");

        switch (goMenu) {
            case 1 -> loadDetails ("Go55","5GB for all sites", 1, 3);
            case 2 -> loadDetails ("Go99", "9GB for all sites", 3, 7);
            case 3 -> loadDetails ("Go129", "12GB for all sites", 5, 15);
            case 0 -> {return;}
            default -> System.out.println("Invalid Input. Please try again.");
        }
    }

    public static void goExtra () {
        System.out.println("\nYou choose Go Extra Promos");
        System.out.println("[1] GoEXTRA99");
        System.out.println("[2] GoEXTRA129");
        System.out.println("[3] GoEXTRA149");
        System.out.println("[0] Back to Main Menu");
        int goMenu = enterChoice("Choose your promo: ");

        switch (goMenu) {
            case 1 -> loadDetails ("GoEXTRA99","7GB for all sites", 4, 3);
            case 2 -> loadDetails ("GoEXTRA129", "12GB for all sites", 8, 7);
            case 3 -> loadDetails ("GoEXTRA149", "16GB for all sites", 12, 15);
            case 0 -> {return;}
            default -> System.out.println("Invalid Input. Please try again.");
        }
    }

    public static void unli5G () {
        System.out.println("\nYou choose Unli 5G Promos");
        System.out.println("[1] UNLI 5G 99");
        System.out.println("[2] UNLI 5G 149");
        System.out.println("[3] UNLI 5G 199");
        System.out.println("[0] Back to Main Menu");
        int goMenu = enterChoice("Choose your promo: ");

        switch (goMenu) {
            case 1 -> loadDetails ("UNLI 5G 99","Unli 5G Data", 1, 3);
            case 2 -> loadDetails ("UNLI 5G 149", "Unli 5G Data", 2, 7);
            case 3 -> loadDetails ("UNLI 5G 199", "Unli 5G Data", 3, 15);
            case 0 -> {return;}
            default -> System.out.println("Invalid Input. Please try again.");
        }
    }

    public static void allNet () {
        System.out.println("\nYou choose All Net Promos");
        System.out.println("[1] ALLNET99");
        System.out.println("[2] ALLNET149");
        System.out.println("[3] ALLNET199");
        System.out.println("[0] Back to Main Menu");
        int goMenu = enterChoice("Choose your promo: ");

        switch (goMenu) {
            case 1 -> loadDetails ("ALLNET 99","Unli call & text to all network", 1, 3);
            case 2 -> loadDetails ("ALLNET 149", "Unli call & text to all network", 2, 7);
            case 3 -> loadDetails ("ALLNET 199", "Unli call & text to all network", 3, 15);
            case 0 -> {return;}
            default -> System.out.println("Invalid Input. Please try again.");
        }
    }

    public static void loadDetails (String loadDetails, String description, int free, int days) {
        System.out.println("\nYou select the " + loadDetails);
        System.out.println(description + " plus free " + free +  "GB for " + days + " days");
        System.out.println("[1] Subscribe");
        System.out.println("[2] Exit");
        int enterChoice = enterChoice("Choose an option: ");

        switch (enterChoice) {
            case 1 -> subscribe(loadDetails, description, free, days);

            case 2 -> {
                System.out.println("\nAre you sure you want to exit?");
                System.out.println("[1] Yes");
                System.out.println("[2] No, go back to main menu.");
                int exitChoice = enterChoice("Choose an option: ");

                switch (exitChoice) {
                    case 1 -> exitMethod();
                    case 2 -> mainMenu();
                    default -> System.out.println("Invalid Input. Please try again.");
                }
            }
            default -> System.out.println("Invalid Input. Please try again.");
        }
    }

    public static void subscribe (String loadDetails, String description, int free, int days){
        System.out.println("\nYou are now subscribed to " + loadDetails + "! ");
        System.out.println("Now you can enjoy " + description + " for all sites. " + "\nPlus free " + free +  "GB for " + days + " days.");
        System.out.println("Thank you for subscribing! ❤️ ");
        System.exit(0);
    }

    public static void exitMethod () {
        System.out.println("\nExiting...");
        System.exit(0);
    }

    public static int enterChoice (String promt) {
        while (true) {
            System.out.print(promt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("\nINVALID INPUT. ENTER A NUMBER ONLY");
            }
        }
    }
}

