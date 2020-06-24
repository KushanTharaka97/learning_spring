package com.kushanTharaka.selfLearnSpring.learningspring.business.service;

import com.kushanTharaka.selfLearnSpring.learningspring.business.domain.RoomResevation;
import com.kushanTharaka.selfLearnSpring.learningspring.data.repository.GuestRepository;
import com.kushanTharaka.selfLearnSpring.learningspring.data.repository.ReservationRepository;
import com.kushanTharaka.selfLearnSpring.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Service
public class ReservationService {

    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;
    private final RoomRepository roomRepository;

    @Autowired
    public ReservationService(GuestRepository guestRepository, ReservationRepository reservationRepository, RoomRepository roomRepository) {
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
        this.roomRepository = roomRepository;
    }

    public List<RoomResevation> getRoomReservationsForDate(Date date){
        return null;
    }
}
