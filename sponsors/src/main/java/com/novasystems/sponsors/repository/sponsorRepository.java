package com.novasystems.sponsors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novasystems.sponsors.entity.sponsorEntity;

@Repository
public interface sponsorRepository extends JpaRepository<sponsorEntity, Integer> {

}
