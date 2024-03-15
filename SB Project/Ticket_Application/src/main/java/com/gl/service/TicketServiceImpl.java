package com.gl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.entity.Ticket;
import com.gl.repository.TicketRepository;
@Service
public class TicketServiceImpl {
	
	@Autowired
	private TicketRepository repo;
	
	public void newTicket(Ticket t) {
		repo.save(t);
	}
	
	
		public List<Ticket> getAllTic(){
			return repo.findAll();
	}
	public Ticket getTicById(int id) {
		Optional<Ticket> t=repo.findById(id);
		if(t.isPresent()) {
			return t.get();
		}
		return null;
		
	}
	public void deleteTic(int id) {
		repo.deleteById(id);
	}
	

}
