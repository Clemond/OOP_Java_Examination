import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        
        System.out.println("Mata in hur mycket pengar du har: ");
        int userBalance = myScanner.nextInt();
        System.out.println("Hur mycket vill du ta ut: ");
        int userWithdrawal = myScanner.nextInt();

        if (userWithdrawal > userBalance) {
            System.out.println("Du kan inte ta ut " + userWithdrawal + " kronor. Du har bara " + userBalance + " kronor så det saknas " + (userWithdrawal - userBalance) + " kronor.");
        }
        else{
            System.out.println(userWithdrawal + " kronor uttaget. Du har nu " + (userBalance - userWithdrawal) + " kronor kvar.");
        }
    }
}