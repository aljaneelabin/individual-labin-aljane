package com.joysistvi.day8.ifstatement.part2.Activity;

import java.util.Scanner;

public class Trial2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dial = "*143#";
        String code;
        while (true) {
            System.out.println("\nDial *143# to access Globe Services ");
            System.out.print("\nEnter USSD Code (0 to Exit): ");
            code = input.nextLine();
            if (code.equals (dial)) {
                break;
            } if (code.equals ("0")) {
                System.out.println("\nExiting...");
                input.close();
                return;
            } else {
                System.out.println("\nInvalid Code! Please try again.");
            }
        }
        while (true) {
            System.out.println("===Load Registration===");
            System.out.println("[1] Go+");
            System.out.println("[2] Go");
            System.out.println("[3] GoExtra");
            System.out.println("[4] Unli 5G");
            System.out.println("[5] ALLNET");
            System.out.println("[0] Exit");
            System.out.print("Choose your Load: ");
            if (!input.hasNextInt()) {
                System.out.println("Invalid choice!");
                input.nextLine();
                continue;
            }
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 0) {
                System.out.println("\nExiting...");
                break;
            }
            switch (choice) {
                case 1 -> {
                    while (true) {
                        System.out.println("\nYou choose Go+ Promos");
                        System.out.println("[1] Go+99");
                        System.out.println("[2] Go+129");
                        System.out.println("[3] Go+149");
                        System.out.println("[0] Back to Main Menu");
                        System.out.print("Please select promo: ");
                        if (!input.hasNextInt()) {
                            System.out.println("\nInvalid choice!");
                            input.nextLine();
                            continue;
                        }
                        int promo = input.nextInt();
                        input.nextLine();
                        if (promo == 0) {
                            System.out.println("\nBack to Main Menu...");
                            break;
                        }
                        String promoName;
                        String description;
                        switch (promo) {
                            case 1 -> {
                                promoName = "Go+99";
                                description = "Get 8 GB for all sites + 8 GB";
                            }
                            case 2 -> {
                                promoName = "Go+129";
                                description = "Get 12 GB for all sites + 12GB";
                            }
                            case 3 -> {
                                promoName = "Go+149";
                                description = "Get 16 GB for all sites + 16GB";
                            }
                            default -> {
                                System.out.println("\nInvalid promo choice!");
                                continue;
                            }
                        }
                        boolean returnToMainMenu = false;
                        while (true) {
                            System.out.println("\nYou select the " + promoName);
                            System.out.println(description);
                            System.out.println("[1] Subscribe");
                            System.out.println("[0] Exit");
                            System.out.print("Choose an option: ");

                            int action = input.nextInt();
                            input.nextLine();

                            if (action == 1) {
                                System.out.println("\nYou are now subscribed to " + promoName + "!");
                                System.out.println(description);
                                System.out.println("Thank you for subscribing! ❤️ ");
                                input.close();
                                return;
                            } else if (action == 0) {
                                System.out.println("]nReturning to Promos...");
                                break;
                            } else {
                                System.out.println("\nInvalid choice! Try again.");
                                break;
                            }
                        }

                    }
                }
                case 2 -> {
                    while (true) {
                        System.out.println("\nYou choose Go Promos");
                        System.out.println("[1] Go55");
                        System.out.println("[2] Go+Go99");
                        System.out.println("[3] Go120");
                        System.out.println("[0] Back to Main Menu");
                        System.out.print("Please select promo: ");
                        if (!input.hasNextInt()) {
                            System.out.println("\nInvalid choice!");
                            input.nextLine();
                            continue;
                        }
                        int promo = input.nextInt();
                        input.nextLine();
                        if (promo == 0) {
                            System.out.println("\nBack to Main Menu...");
                            break;
                        }
                        String promoName;
                        String description;
                        switch (promo) {
                            case 1 -> {
                                promoName = "Go 55";
                                description = "Get  5GB for all sites + 1GB Free";
                            }
                            case 2 -> {
                                promoName = "Go 99";
                                description = "Get 9 GB for all sites + 3GB Free";
                            }
                            case 3 -> {
                                promoName = "Go 120";
                                description = "Get 12 GB for all sites + 5GB Free";
                            }
                            default -> {
                                System.out.println("\nInvalid promo choice!");
                                continue;
                            }
                        }
                        boolean returnToMainMenu = false;
                        while (true) {
                            System.out.println("\nYou select the " + promoName);
                            System.out.println(description);
                            System.out.println("[1] Subscribe");
                            System.out.println("[0] Exit");
                            System.out.print("Choose an option: ");

                            int action = input.nextInt();
                            input.nextLine();

                            if (action == 1) {
                                System.out.println("\nYou are now subscribed to " + promoName + "!");
                                System.out.println(description);
                                System.out.println("Thank you for subscribing! ❤️ ");
                                input.close();
                                return;
                            } else if (action == 0) {
                                System.out.println("\nReturning to Promos...");
                                break;
                            } else {
                                System.out.println("\nInvalid choice! Try again.");
                                break;
                            }

                        }


                    }

                }
                case 3 -> {
                    while (true) {
                        System.out.println("\nYou choose GoExtra Promos");
                        System.out.println("[1] GoEXTRA99");
                        System.out.println("[2] GoEXTRA129");
                        System.out.println("[3] GoEXTRA149");
                        System.out.println("[0] Back to Main Menu");
                        System.out.print("Please select promo: ");
                        if (!input.hasNextInt()) {
                            System.out.println("\nInvalid choice!");
                            input.nextLine();
                            continue;
                        }
                        int promo = input.nextInt();
                        input.nextLine();
                        if (promo == 0) {
                            System.out.println("\nBack to Main Menu...");
                            break;
                        }
                        String promoName;
                        String description;
                        switch (promo) {
                            case 1 -> {
                                promoName = "GoEXTRA99";
                                description = "Get  7GB for all sites + 4GB Free";
                            }
                            case 2 -> {
                                promoName = "GoEXTRA129";
                                description = "Get 12 GB for all sites + 8GB Free";
                            }
                            case 3 -> {
                                promoName = "GoEXTRA149";
                                description = "Get 16 GB for all sites + 12GB Free";
                            }
                            default -> {
                                System.out.println("\nInvalid promo choice!");
                                continue;
                            }
                        }
                        boolean returnToMainMenu = false;
                        while (true) {
                            System.out.println("\nYou select the " + promoName);
                            System.out.println(description);
                            System.out.println("[1] Subscribe");
                            System.out.println("[0] Exit");
                            System.out.print("Choose an option: ");

                            int action = input.nextInt();
                            input.nextLine();

                            if (action == 1) {
                                System.out.println("\nYou are now subscribed to " + promoName + "!");
                                System.out.println(description);
                                System.out.println("Thank you for subscribing! ❤️ ");
                                input.close();
                                return;
                            } else if (action == 0) {
                                System.out.println("\nReturning to Promos...");
                                break;
                            } else {
                                System.out.println("\nInvalid choice! Try again.");
                                break;
                            }
                        }
                    }
                }
                case 4 -> {
                    while (true) {
                        System.out.println("\nYou choose UNLI 5G Promos");
                        System.out.println("[1] UNLI 5G 99");
                        System.out.println("[2] UNLI 5G 149");
                        System.out.println("[3] UNLI 5G 199");
                        System.out.println("[0] Back to Main Menu");
                        System.out.print("Please select promo: ");
                        if (!input.hasNextInt()) {
                            System.out.println("\nInvalid choice!");
                            input.nextLine();
                            continue;
                        }
                        int promo = input.nextInt();
                        input.nextLine();
                        if (promo == 0) {
                            System.out.println("\nBack to Main Menu...");
                            break;
                        }
                        String promoName;
                        String description;
                        switch (promo) {
                            case 1 -> {
                                promoName = "UNLI 5G 99";
                                description = "Get Unli Data 5G + 2GB Free for 3 days";
                            }
                            case 2 -> {
                                promoName = "UNLI 5G 149";
                                description = "Get Unli Data 5G + 4GB Free for 7 days";
                            }
                            case 3 -> {
                                promoName = "UNLI 5G 199";
                                description = "Get Unli Data 5G + 6GB Free for 15 days";
                            }
                            default -> {
                                System.out.println("\nInvalid promo choice!");
                                continue;
                            }
                        }
                        boolean returnToMainMenu = false;
                        while (true) {
                            System.out.println("\nYou select the " + promoName);
                            System.out.println(description);
                            System.out.println("[1] Subscribe");
                            System.out.println("[0] Exit");
                            System.out.print("Choose an option: ");

                            int action = input.nextInt();
                            input.nextLine();

                            if (action == 1) {
                                System.out.println("\nYou are now subscribed to " + promoName + "!");
                                System.out.println(description);
                                System.out.println("Thank you for subscribing! ❤️ ");
                                input.close();
                                return;
                            } else if (action == 0) {
                                System.out.println("\nReturning to Promos...");
                                break;
                            } else {
                                System.out.println("\nInvalid choice! Try again.");
                                break;
                            }
                        }
                    }
                }
                case 5 -> {
                    while (true) {
                        System.out.println("\nYou choose ALL NET Promos");
                        System.out.println("[1] ALLNET99");
                        System.out.println("[2] ALLNET149");
                        System.out.println("[3] ALLNET199");
                        System.out.println("[0] Back to Main Menu");
                        System.out.print("Please select promo: ");
                        if (!input.hasNextInt()) {
                            System.out.println("\nInvalid choice!");
                            input.nextLine();
                            continue;
                        }
                        int promo = input.nextInt();
                        input.nextLine();
                        if (promo == 0) {
                            System.out.println("\nBack to Main Menu...");
                            break;
                        }
                        String promoName;
                        String description;
                        switch (promo) {
                            case 1 -> {
                                promoName = "ALLNET99";
                                description = "Get 2GB Data + Unli Allnet text for 3 days";
                            }
                            case 2 -> {
                                promoName = "ALLNET149";
                                description = "Get 4GB Data + Unli Allnet text for 7 days";
                            }
                            case 3 -> {
                                promoName = "ALLNET199";
                                description = "Get 8GB Data + Unli Allnet text for 15 days";
                            }
                            default -> {
                                System.out.println("\nInvalid promo choice!");
                                continue;
                            }
                        }
                        boolean returnToMainMenu = false;
                        while (true) {
                            System.out.println("\nYou select the " + promoName);
                            System.out.println(description);
                            System.out.println("[1] Subscribe");
                            System.out.println("[0] Exit");
                            System.out.print("Choose an option: ");

                            int action = input.nextInt();
                            input.nextLine();

                            if (action == 1) {
                                System.out.println("\nYou are now subscribed to " + promoName + "!");
                                System.out.println(description);
                                System.out.println("Thank you for subscribing! ❤️ ");
                                input.close();
                                return;
                            } else if (action == 0) {
                                System.out.println("\nReturning to Promos...");
                                break;
                            } else {
                                System.out.println("\nInvalid choice! Try again.");
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}




/* case 2 -> System.out.println("You choose Go Promos.Please select promo:");
            case 3 -> System.out.println("You choose GoExtra Promos.Please select promo:");
            case 4 -> System.out.println("You choose Unli 5G Promos.Please select promo:");
            case 5 -> System.out.println("You choose ALLNET Promos.Please select promo:");
            default -> System.out.println("Try again later. Exiting...");

 */