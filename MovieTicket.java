import java.util.Scanner;
class  MovieTicket{

    String movieName;
    double ticketPrice;
    int numberOfTickets;

     MovieTicket(String name, double price, int tickets) {
        movieName = name;
        ticketPrice = price;
        numberOfTickets = tickets;
    }

    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    double calculateDiscount() {
        if (numberOfTickets >= 5)
            return calculateTotal() * 0.10;
        return 0;
    }

    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    void displayBill() {
        System.out.println("\n--- Cinema Bill ---");
        System.out.println("Movie: " + movieName);
        System.out.println("Tickets: " + numberOfTickets);
        System.out.printf("Price: %.2f%n", ticketPrice);
        System.out.printf("Discount: %.2f%n", calculateDiscount());
        System.out.printf("Final Amount: %.2f%n", calculateFinalAmount());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Movie name: ");
        String name = sc.nextLine();

        System.out.print("Ticket price: ");
        double price = sc.nextDouble();

        System.out.print("Number of tickets: ");
        int tickets = sc.nextInt();

      MovieTicket m = new  MovieTicket(name, price, tickets);
        m.displayBill();
    }
}
