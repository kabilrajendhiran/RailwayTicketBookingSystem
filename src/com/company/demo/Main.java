package com.company.demo;

public class Main {

    public static void main(String[] args) {

        Ticket ticket1 = new Ticket("Kabil",23,"M","UB");
        Ticket ticket2 = new Ticket("Kabilan",23,"M","UB");
        Ticket ticket3 = new Ticket("Alcatraz",25,"M","UB");
        Ticket ticket4 = new Ticket("Ram",67,"M","UB");
        Ticket ticket5 = new Ticket("AlcatrazKabil2",21,"M","UB");
        Ticket ticket6 = new Ticket("AlcatrazKabil3",21,"M","UB");
        Ticket ticket7 = new Ticket("AlcatrazKabil4",21,"M","UB");


        Booking booking = new Booking();
        booking.bookTicket(ticket1);
        booking.bookTicket(ticket2);
        booking.bookTicket(ticket3);
        booking.bookTicket(ticket4);
        booking.bookTicket(ticket5);
        booking.bookTicket(ticket6);
        booking.bookTicket(ticket7);


        System.out.println("Booking");
        System.out.println(booking);

        System.out.println("Ticket Cancellation");
        booking.cancelTicket("Kabil");
        System.out.println(booking);


    }
}
