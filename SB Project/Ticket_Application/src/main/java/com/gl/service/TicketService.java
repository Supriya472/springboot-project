package com.gl.service;

import java.util.List;

import com.gl.entity.Ticket;

public interface TicketService {
	public void newTicket(Ticket t);
	public List<Ticket> getAllTic();
	public Ticket getTicById(int id);
	public void deleteTic(int id);

}
