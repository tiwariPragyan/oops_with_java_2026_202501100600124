/*
Scenario: A cinema's online booking system allows two counters to sell tickets for the same show
simultaneously, represented as two threads. Only 3 tickets remain. If both counters read and
update the ticket count at the same time without protection, two customers could be sold the same
last ticket. The system must ensure ticket allotment happens safely, one customer at a time.
(a) Create a class TicketCounter implementing Runnable, with a shared instance variable
availableTickets = 3, and a method bookTicket() that prints the ticket number sold and
decrements the count. [2]
(b) Make bookTicket() a synchronized method so that only one thread can execute it at a time,
preventing two threads from selling the same ticket. [2]
(c) Using the driver code below, create two Thread objects sharing the same TicketCounter
object, set one thread to a higher priority using setPriority(), and start both threads. [1]
*/

package oops_with_java_2026_202501100600124.UseCaseofOOPS;

class TicketCounter implements Runnable{
    int availableTickets = 3;

    public void run(){
        while (availableTickets > 0) {
            bookTicket();
        }
    }
    
    void bookTicket(){
        if(availableTickets > 0){
            availableTickets--;
            System.out.println("Ticket booked by "+ Thread.currentThread().getName());
            System.out.println("Left tickets are "+ availableTickets);
        }else{
            System.out.println("Tickets are sold out");
        }
    }
}

public class UseCase5 {
    public static void main(String[] args) {
    TicketCounter counter = new TicketCounter();
    Thread t1 = new Thread(counter);
    Thread t2 = new Thread(counter);
    // TODO: set t1 priority to Thread.MAX_PRIORITY
    t2.setPriority(10);
    t1.setName("Counter1");
    t2.setName("Counter2");
    t1.start();
    t2.start();
    // TODO: start both threads
    }
}
