package com.gl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TICKET_APP")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String ticketTitle;
	String ticketShortDescription;
	int ticketCreatedon;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTicketTitle() {
		return ticketTitle;
	}
	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}
	public String getTicketShortDescription() {
		return ticketShortDescription;
	}
	public void setTicketShortDescription(String ticketShortDescription) {
		this.ticketShortDescription = ticketShortDescription;
	}
	public int getTicketCreatedon() {
		return ticketCreatedon;
	}
	public void setTicketCreatedon(int ticketCreatedon) {
		this.ticketCreatedon = ticketCreatedon;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", ticketTitle=" + ticketTitle + ", ticketShortDescription="
				+ ticketShortDescription + ", ticketCreatedon=" + ticketCreatedon + "]";
	}
	public Ticket(int id, String ticketTitle, String ticketShortDescription, int ticketCreatedon) {
		super();
		this.id = id;
		this.ticketTitle = ticketTitle;
		this.ticketShortDescription = ticketShortDescription;
		this.ticketCreatedon = ticketCreatedon;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
