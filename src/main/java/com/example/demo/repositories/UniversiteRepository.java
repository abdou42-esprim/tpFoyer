package com.example.demo.repositories;

import com.example.demo.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    @Override
    List<Universite> findAllById(Iterable<Long> longs);
}