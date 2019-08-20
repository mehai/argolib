package com.argodebate.library.argolib.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argodebate.library.argolib.repositories.ReservationRepository;

@Service
public class ReservationService {
	@Autowired
	private ReservationRepository reservationRepository;
}
