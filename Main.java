// ============================================
//        MADE BY NEYZOX! 
//        DESIGNED BY NEYZOX
// ============================================
// You can change everything! Here's how to run it:
//
//   1. Compile the file:
//      javac Main.java
//
//   2. Run the program:
//      java Main
//
// Feel free to edit, break, and rebuild this however you want.
// ============================================



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int defaultMoney = 10;
        int keyboardPrice = 20;

        String message = "You have " + defaultMoney + "€ and the keyboard costs " + keyboardPrice + "€.";

        String message2 = "You don't have enough money to buy the keyboard. Want to work to earn some money?";

        System.out.println(message);

        String declenchement = "Bien recu, on lance la deuxieme methode!";

        // fonctions!
        simpleStoreSystemRng();
        clavierAchete(sc, declenchement, defaultMoney, keyboardPrice, message2);
        travail(sc, defaultMoney, keyboardPrice);
        achatClavier(sc, defaultMoney, keyboardPrice);
    }

    public static void simpleStoreSystemRng() {
        System.out.println("Welcome to the simple Store System calculator in JAVA. Made by Neyzox");
    }

    public static String clavierAchete(Scanner sc, String declenchement, int defaultMoney, int keyboardPrice, String message2) {

        System.out.println("Do you want to buy a clavier at 10€?");
        String result = sc.nextLine();
        System.out.println(message2);


        switch (result) {
            case "Yes":
                System.out.println("Here the keyboard at 10€");
                break;

            case "No":
                System.out.println("Have a great day!");
                break;
        
            default:
                System.out.println("No commands were returned.");
                break;

            
        }

        return declenchement;


    
    }

public static void travail(Scanner sc, int defaultMoney, int keyboardPrice) {
        System.out.println("You have chosen to work to earn money. How many hours do you want to work?");
        int workHours = sc.nextInt();

        switch (workHours) {
            case 1:
                System.out.println("You earned 10€ for 1 hour of work.");
                defaultMoney += 10;
                break;

            case 2:
                System.out.println("You earned 20€ for 2 hours of work.");
                defaultMoney += 20;

                
                break;

            default:
                System.out.println("You can only work up to 2 hours.");
                defaultMoney += 0;
                break;
        }

    
    }

    public static void achatClavier(Scanner sc, int defaultMoney, int keyboardPrice) {
        System.out.println("You have " + defaultMoney + "€ and the keyboard costs " + keyboardPrice + "€.");
        System.out.println("Do you want to buy the keyboard? (Yes/No)");
        String result = sc.nextLine();

        switch (result) {
            case "Yes":
                if (defaultMoney >= keyboardPrice) {
                    System.out.println("You bought the keyboard!");
                    defaultMoney -= keyboardPrice;
                } else {
                    System.out.println("You don't have enough money to buy the keyboard.");
                }
                break;

            case "No":
                System.out.println("Have a great day!");
                break;

            default:
                System.out.println("No commands were returned.");
                break;
        }
    }
}
