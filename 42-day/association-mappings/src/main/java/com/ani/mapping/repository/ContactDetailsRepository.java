package com.ani.mapping.repository;

import com.ani.mapping.domain.Course;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.mapping.domain.ContactDetails;

public interface ContactDetailsRepository extends JpaRepository<ContactDetails, Long>{

}

