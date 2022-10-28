package driver;

import controller.TicketController;
import io.javalin.Javalin;

public class Driver {
    public static void main(String[] args) {
            Javalin app = Javalin.create();

    TicketController ticketController = new TicketController();


        app.post("/auth/createTicket", ticketController.createTicket);
        app.delete("/auth/deleteTicket/{id}", ticketController.deleteTicket);
        app.put("/auth/updateTicket", ticketController.updateTicket);
        app.get( "/auth/getTicket/{id}", ticketController.getTicket);
        app.get( "/auth/getALLPendingTickets", ticketController.getALLPendingTickets);
    app.get("/auth/getALLPendingTickets/{id}", ticketController.getPendingTickets);


    }
}
