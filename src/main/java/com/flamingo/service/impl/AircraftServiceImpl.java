package com.flamingo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.flamingo.model.Aircraft;
import com.flamingo.repository.AircraftRepository;
import com.flamingo.services.AircraftService;

@Service
public class AircraftServiceImpl implements AircraftService {
    @Autowired
    private AircraftRepository aircraftRepository;

//    @Autowired
//    public AircraftServiceImpl(AircraftRepository aircraftRepository){
//        this.aircraftRepository = aircraftRepository;
//    }

    @Override
    public Page<Aircraft> getAllAircraftsPaged(int pageNum) {
        return aircraftRepository.findAll(PageRequest.of(pageNum,5,Sort.by("model")));
    }

    @Override
    public List<Aircraft> getAllAircrafts() {
        return aircraftRepository.findAll();
    }

    @Override
    public Aircraft getAircraftById(Long aircraftId) {
        return aircraftRepository.findById(aircraftId).orElse(null);
    }

    @Override
    public Aircraft saveAircraft(Aircraft aircraft) {
        if(aircraft==null) throw new IllegalArgumentException();
        return aircraftRepository.save(aircraft);
    }

    @Override
    public void deleteAircraftById(Long aircraftId) {
        aircraftRepository.deleteById(aircraftId);
    }
}
