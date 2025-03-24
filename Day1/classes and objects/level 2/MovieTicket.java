public class MovieTicket {
    public String movieName;
    public int seatNumber;
    public int price;

    public void BookMovieTicket(String movieName, int seatNumber, int price){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket for"+movieName+"has been booked successfully!");
    }
    
    public void displayDetails(){
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[]args){
            MovieTicket ticket = new MovieTicket();
            ticket.BookMovieTicket("Inception", 12, 250);
            ticket.displayDetails();
        }
}

