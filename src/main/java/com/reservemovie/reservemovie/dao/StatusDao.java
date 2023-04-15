package com.reservemovie.reservemovie.dao;

import com.reservemovie.reservemovie.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusDao extends JpaRepository<Status, Integer> {
}
