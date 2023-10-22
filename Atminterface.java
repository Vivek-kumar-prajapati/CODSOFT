import java.util.Scanner;

class ATM {

    float balance;
    int pin = 1111;

    ATM() {
        System.out.println("ENTER YOUR ATM PIN (1111)");
        Scanner sc = new Scanner(System.in);
        int inputpin = sc.nextInt();
        if (inputpin == pin) {
            menu();
        } else {
            System.out.println("Please! Please enter a valid pin number ");

        }

    }

    /**
     * 
     */
    public void menu() {
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1.CHECK A/C BALANCE");
        System.out.println("2. WITHDRAW AMOUNT");
        System.out.println("3.DEPOSITE AMOUNT");
        System.out.println("4.EXIT");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1: {
                checkAmount();
                break;

            }
            case 2: {
                withdrawAmount();
                break;

            }
            case 3: {
                depositeAmount();
                break;

            }
            case 4: {
                System.out.println("THANK YOU !!");
                return;

            }
            default: {
                System.out.println("ENTER A VALID CHOICE PLEASE!!");
            }
        }

    }

    public void checkAmount() {
        System.out.println("BALANCE:" + balance);
        menu();
    }

    public void withdrawAmount() {
        System.out.println("ENTER AMOUNT TO WITHDRAW");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println(" Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("MONEY WITHDRAW SUCCESFULLY !!");
        }
        menu();
    }

    public void depositeAmount() {
        System.out.println("ENTER AMOUNT :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("MONEY DIPOSITED SUCCESSFULLY !!");
        menu();

    }

}

public class Atminterface {
    public static void main(String[] args){
        ATM obj = new ATM();

    }
}