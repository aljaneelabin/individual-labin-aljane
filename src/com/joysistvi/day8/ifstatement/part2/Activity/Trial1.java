package com.joysistvi.day8.ifstatement.part2.Activity;

import java.util.Scanner;

public class Trial1 {
    public static void main(String[] args) {

        String dial = "*143#";
        String mainMenu = "";
        String subMenu = "";
        String select = "";
        String promoName = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Dial *143# to access Globe Services ");
        System.out.print("\nEnter USSD Code:");

        String code = input.nextLine();

        if (code.equals(dial)) {
            System.out.println("\nUSSD Code Running...");
            System.out.println("\nLoad Registration");
            if (dial == dial) {
                mainMenu = "Load Registration";
                System.out.println("[1] Go+");
                System.out.println("[2] Go");
                System.out.println("[3] GoExtra");
                System.out.println("[4] Unli 5G");
                System.out.println("[5] ALLNET");
                System.out.print("Choose your Load:");
                int choice = input.nextInt();

                if (choice == 1) {
                    subMenu = "Go+ Promos";
                    System.out.println("\n** Go+ Promos **");
                    System.out.println("[1] Go+99");
                    System.out.println("[2] Go+129");
                    System.out.println("[3] Go+149");
                    System.out.print("Choose your promo:");
                    int promoChoice = input.nextInt();

                    if (promoChoice == 1) {
                        System.out.println("\n ** Go+99 **");
                        System.out.println("Get 8 GB for all sites + 8GB");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter your choice:");
                        int action = input.nextInt();
                        if (action == 1) {
                            System.out.println("\nYou are now subscribed to Go+99. Thank you!");
                        } else if (action == 2) {
                            System.out.println("\nExit..");
                        } else {
                            System.out.println("Invalid Choice");
                        }

                    } else if (promoChoice == 2) {
                        System.out.println("\n ** Go+129 **");
                        System.out.println("Get 12 GB for all sites + 12GB");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter your choice:");
                        int action = input.nextInt();
                        if (action == 1) {
                            System.out.println("\nYou are now subscribed to Go+129. Thank you!");
                        } else if (action == 2) {
                            System.out.println("\nExit..");
                        } else {
                            System.out.println("Invalid Choice");
                        }
                    } else if (promoChoice == 3) {
                        System.out.println("\n ** Go+149 **");
                        System.out.println("Get 16 GB for all sites + 16GB");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter your choice:");
                        int action = input.nextInt();
                        if (action == 1) {
                            System.out.println("\nYou are now subscribed to Go+149. Thank you!");
                        } else if (action == 2) {
                            System.out.println("\nExit..");
                        } else {
                            System.out.println("Invalid Choice");
                        }
                    } else {
                        System.out.println("\nInvalid Promo! Try again.");
                    }

                }
                if (choice == 2) {
                    subMenu = "Go Promos";
                    System.out.println("\n** Go Promos **");
                    System.out.println("[1] Go55");
                    System.out.println("[2] Go99");
                    System.out.println("[3] Go120");
                    System.out.print("Choose your promo:");
                    int promoChoice2 = input.nextInt();
                    if (promoChoice2 >= 1 && promoChoice2<= 3) {
                        if (promoChoice2 == 1) {
                            promoName = "Go55";
                        } else if (promoChoice2 == 2) {
                            promoName = "Go99";
                        } else {
                            promoName = "Go120";
                        }
                        System.out.println("\n** " + promoName + " **");
                        System.out.println("[1] Subscribe");
                        System.out.println("[2] Exit");
                        System.out.print("Enter your choice: ");

                        int action = input.nextInt();
                        if (action == 1) {
                            System.out.println("\nYou are now subscribed to "+ promoName + ". Thank you!");
                        } else if (action == 2) {
                            System.out.println("\nExit...");
                        } else {
                            System.out.println("Invalid Choice");
                        }
                    } else {
                        System.out.println("Invalid Choice!");
                    }

                }
                if (choice == 3) {
                    subMenu = "GoEXTRA";
                    System.out.println("\n** GoExtra Promo **");
                    System.out.println("[1] GoEXTRA99");
                    System.out.println("[2] GoEXTRA129");
                    System.out.println("[3] GoEXTRA149");
                    System.out.print("Choose your promo:");

                    int promoChoice3 = input.nextInt();

                    if (promoChoice3 >= 1 && promoChoice3 <= 3) {
                        if (promoChoice3 == 1) {
                            promoName = "GoEXTRA99";
                        } else if (promoChoice3 == 2) {
                            promoName = "GoEXTRA129";
                        } else if (promoChoice3 == 3) {
                            promoName = "GoEXTRA149";
                        }
                    } else {
                        System.out.println("Invalid Choice!");
                    }
                    System.out.println("\n** " + promoName + " **");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.print("Enter your choice: ");

                    int action = input.nextInt();
                    if (action == 1) {
                        System.out.println("\nYou are now subscribed to "+ promoName + ". Thank you!");
                    } else if (action == 2) {
                        System.out.println("\nExit...");
                    } else {
                        System.out.println("Invalid Choice!");
                    }

                }
                if (choice == 4) {
                    subMenu = "UNLI 5G";
                    System.out.println("\n** UNLI 5G Promos **");
                    System.out.println("[1] UNLI 5G 99");
                    System.out.println("[2] UNLI 5G 149");
                    System.out.println("[3] UNLI 5G 199");
                    System.out.print("Choose your promo:");

                    int promoChoice4 = input.nextInt();

                    if (promoChoice4 >= 1 && promoChoice4 <= 3) {
                        if (promoChoice4 == 1) {
                            promoName = "UNLI 5G 99";
                        } else if (promoChoice4 == 2) {
                            promoName = "UNLI 5G 149";
                        } else if (promoChoice4 == 3) {
                            promoName = "UNLI 5G 199";
                        }
                    } else {
                        System.out.println("Invalid Choice!");
                    }
                    System.out.println("\n** " + promoName + " **");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.print("Enter your choice: ");

                    int action = input.nextInt();
                    if (action == 1) {
                        System.out.println("\nYou are now subscribed to "+ promoName + ". Thank you!");
                    } else {
                        System.out.println("Invalid Choice!");
                    }

                }
                if (choice == 5) {
                    subMenu = "ALLNET";
                    System.out.println("\n** ALL NET Promos **");
                    System.out.println("[1] ALLNET99");
                    System.out.println("[2] ALLNET149");
                    System.out.println("[3] ALLNET199");
                    System.out.print("Choose your promo:");
                    int promoChoice5 = input.nextInt();

                    if (promoChoice5 >= 1 && promoChoice5 <= 3) {
                        if (promoChoice5 == 1) {
                            promoName = "ALLNET99";
                        } else if (promoChoice5 == 2) {
                            promoName = "ALLNET149";
                        } else if (promoChoice5 == 3) {
                            promoName = "ALLNET199";
                    while (promoChoice5 == 0) {
                        System.out.print("Invalid Choice! Try again.");
                    }
                    }
                    System.out.println("\n** " + promoName + " **");
                    System.out.println("[1] Subscribe");
                    System.out.println("[2] Exit");
                    System.out.print("Enter your choice: ");
                    }
                    int action = input.nextInt();
                    if (action <= 3) {
                        System.out.println("\nYou are now subscribed to "+ promoName + ". Thank you!");
                    }
                    if (action >= 3) {
                        System.out.println("Invalid Choice! Try Agin");
                    }
                    if (action == 0) {
                        System.out.println("Exiting..");
                    }
                } else {
                    System.out.println("\nInvalid Promo Code! Try again.");
                }
            }
        } else {
            System.out.println("Invalid USSD Code! Please try again.");
        }
        input.close();



    }
}

