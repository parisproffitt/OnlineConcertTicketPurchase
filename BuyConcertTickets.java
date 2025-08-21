
/**
 * This program functions to allow users to purchase concert tickets online
 *
 * @author Paris Proffitt
 * @version September 11th, 2024
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class BuyConcertTickets
{
    public static void main(String[] args) {
        //Imports
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        //Questions for user input
        System.out.print("Good Evening. Please enter your first and last name: ");
        String fullName = scanner.nextLine();
        
        System.out.print("Enter today's date (mm/dd/yyyy): ");
        String date = scanner.nextLine();
        
        System.out.print("What concert would you like to attend? ");
        String concert = scanner.nextLine();
        
        System.out.print("How many tickets? ");
        int ticketCount = Integer.parseInt(scanner.nextLine());
        
        System.out.print("What is the ticket price? $");
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Enter your debit card number (####-###-####): ");
        String cardNumber = scanner.nextLine();
        
        System.out.print("Enter your PIN (#####): ");
        String pin = scanner.nextLine();
        
        String[] nameParts = fullName.split(" ");
        String firstInitial = nameParts[0].substring(0, 1);
        String lastName = nameParts[nameParts.length - 1];

        String orderNumber = lastName.toLowerCase().substring(0, 2) + cardNumber.substring(cardNumber.length() - 3);
        String formattedDate = date.replace("/", "-");
        String maskedCardNumber = "####-###-" + cardNumber.substring(cardNumber.length() - 4);

        double totalCost = ticketCount * ticketPrice;
        
        System.out.println();
        System.out.println("**********************************************");
        System.out.println("**********************************************");
        
        //Receipt
        System.out.println("Your e-Receipt:");
        System.out.println();
        System.out.println(formattedDate);
        System.out.println("Order number: " + orderNumber);
        System.out.println(firstInitial + ". " + lastName);
        System.out.println("Account: " + maskedCardNumber);
        System.out.println("Concert: " + concert);
        System.out.println("Number of Tickets: " + ticketCount);
        System.out.println("Ticket Price: $" + df.format(ticketPrice));
        System.out.println();
        System.out.println("$" + df.format(totalCost) + " will be charged to your account.");
        System.out.println();
        System.out.println("Thank you. Enjoy the concert!");
        System.out.println("**********************************************");
        System.out.println("**********************************************");
        
        scanner.close();
    }
}
