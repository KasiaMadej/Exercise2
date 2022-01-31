package com.zadania.repository;

import com.zadania.models.GeolocationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GeolocationRepository extends JpaRepository<GeolocationData, Long> {



}