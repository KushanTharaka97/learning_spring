package com.kushanTharaka.selfLearnSpring.learningspring.data.repository;

import com.kushanTharaka.selfLearnSpring.learningspring.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
