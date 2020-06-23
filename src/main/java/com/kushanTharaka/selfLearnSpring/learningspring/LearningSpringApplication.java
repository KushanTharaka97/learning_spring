package com.kushanTharaka.selfLearnSpring.learningspring;

import com.kushanTharaka.selfLearnSpring.learningspring.data.entity.Guest;
import com.kushanTharaka.selfLearnSpring.learningspring.data.entity.Reservation;
import com.kushanTharaka.selfLearnSpring.learningspring.data.entity.Room;
import com.kushanTharaka.selfLearnSpring.learningspring.data.repository.GuestRepository;
import com.kushanTharaka.selfLearnSpring.learningspring.data.repository.ReservationRepository;
import com.kushanTharaka.selfLearnSpring.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}

	//controller for rooms
	@RestController
	@RequestMapping("/rooms")
	public class RoomController{
		@Autowired
		private RoomRepository roomRepository;

		@GetMapping
		public Iterable<Room> getRooms(){
				return this.roomRepository.findAll();

		}
	}

	//controller for guests
	@RestController
	@RequestMapping("/guests")
	public class GuestController{
		@Autowired
		private GuestRepository guestRepository;

		@GetMapping
		public Iterable<Guest> getGuest(){
			return this.guestRepository.findAll();
		}
	}

	@RestController
	@RequestMapping("/reservations")
	public class ReservationController{
		@Autowired
		public ReservationRepository reservationRepository;

		@GetMapping
		public Iterable<Reservation> getReservation(){
			return this.reservationRepository.findAll();
		}
	}


}

/*
* Remote Database: application properties
*
* spring.jpa.database = postgresql
spring.datasource.platform = postgres
spring.datasource.url = jdbc:postgresql://localhost:5432/dev
spring.datasource.username = postgres
spring.datasource.password = postgres

*
* */