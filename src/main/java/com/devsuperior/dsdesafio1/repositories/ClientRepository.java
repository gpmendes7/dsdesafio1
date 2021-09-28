package com.devsuperior.dsdesafio1.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdesafio1.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
