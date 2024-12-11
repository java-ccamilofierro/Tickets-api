package com.doublevpartners.ticket_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doublevpartners.ticket_api.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
