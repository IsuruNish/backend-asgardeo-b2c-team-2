package com.hackathon.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface ServiceRepository extends JpaRepository<Service, String> {
}
