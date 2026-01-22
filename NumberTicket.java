import java.util.Scanner;

public class NumberTicket {
    public static void main(String[] args) {
        final int TICKET_COST = 15;
        Scanner keyboard = new Scanner(System.in);
        int total;

        System.out.print("Enter a ticket number: ");
        total = keyboard.nextInt();
        total *= TICKET_COST;

        System.out.print("The total is: " + total);
        keyboard.close();
    };
}
