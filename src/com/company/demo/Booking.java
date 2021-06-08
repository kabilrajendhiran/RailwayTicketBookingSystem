package com.company.demo;

import java.util.ArrayList;

public class Booking {

    //Specifications
    private int CONFIRMED_TICKET_COUNT = 5;
    private int RAC_TICKET_COUNT = 2;
    private int WAITING_TICKET_COUNT = 2;


    ArrayList<Ticket> tickets = new ArrayList<>();

    public Booking() {
    }

    public void bookTicket(Ticket ticket)
    {
        int[] ticketCounts = ticketCounts();
        if(ticketCounts[0]<this.CONFIRMED_TICKET_COUNT)
        {
            ticket.setType("CONFIRM");
            allocateBerth(ticket);
            tickets.add(ticket);
        }
        else if(ticketCounts[1]<this.RAC_TICKET_COUNT)
        {
            ticket.setType("RAC");
            tickets.add(ticket);
        }
        else if(ticketCounts[2]<this.WAITING_TICKET_COUNT)
        {
            ticket.setType("WAITING");
            tickets.add(ticket);
        }
        else
        {
            System.out.println("No Tickets Available");
        }


    }

    private int[] ticketCounts()
    {
        int[] ticketCount = new int[3];

        for (Ticket ticket:tickets)
        {
            if(ticket.getType().equals("CONFIRM"))
            {
                ticketCount[0]++;
            }
            else if(ticket.getType().equals("RAC"))
            {
                ticketCount[1]++;
            }
            else if(ticket.getType().equals("WAITING"))
            {
                ticketCount[2]++;
            }
        }

        return ticketCount;

    }

    public void cancelTicket(String name)
    {
        boolean res = tickets.removeIf(t -> t.getName().equals(name));
        if(!res)
        {
            System.out.println("No tickets available for your name");
            return;
        }

        changeTicketStatus(0);
        changeTicketStatus(1);

    }

    private void changeTicketStatus(int option)
    {
        String existingStatus = "", newStatus = "";
        if(option==0)
        {
            existingStatus = "RAC";
            newStatus="CONFIRM";
        }
        else if(option==1)
        {
            existingStatus = "WAITING";
            newStatus="RAC";
        }

        for (Ticket t:tickets) {
            if(t.getType().equals(existingStatus))
            {
                if(option==0)
                {
                    allocateBerth(t);
                }
                t.setType(newStatus);
                return;
            }
        }
    }

    private void allocateBerth(Ticket ticket)
    {
        if (ticket.getAge()>=60)
        {
            ticket.setBerthConfirmed("LB");
        }
        else if (ticket.getType().equals("RAC"))
        {
            ticket.setBerthConfirmed("S-LB");
        }
        else
        {
            ticket.setBerthConfirmed(ticket.getBirthPreference());
        }

    }

    @Override
    public String toString()
    {
        String res="";
        for (Ticket t: tickets) {
            System.out.println(t);
        }
        return res;
    }


}
