package com.novasystems.sponsors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novasystems.sponsors.entity.SponsorEntity;

@Repository
public interface SponsorRepository extends JpaRepository<SponsorEntity, Integer> {

}
