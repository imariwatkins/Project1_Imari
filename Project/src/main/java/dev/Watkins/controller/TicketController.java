package controller;

import service.TicketService;
import sun.security.krb5.internal.Ticket;

public class TicketController {
    private handler ctx;
    public handler createTicket = (ctx) ->{
        Object ticket;
        Ticket registeredTicket = TicketService.getTicketService().createTicket(ticket);
        Object resultString;
        String createTicket1 = "createTicket";
        ctx.result(resultString:"createTicket");

    };
    public handler deleteTicket = ctx;
    public handler updateTicket = ctx;
    public handler getTicket = ctx;
    public handler getALLPendingTickets = ctx;
    public handler getPendingTickets = ctx;
}
