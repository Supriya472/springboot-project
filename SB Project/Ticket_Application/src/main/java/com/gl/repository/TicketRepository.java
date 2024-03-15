package com.gl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.entity.Ticket;
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{
	

}
