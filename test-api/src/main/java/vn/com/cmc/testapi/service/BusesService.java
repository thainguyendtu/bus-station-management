package vn.com.cmc.testapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.cmc.testapi.model.entity.Buses;
import vn.com.cmc.testapi.repository.BusesRepository;

import java.util.List;

@Service
public class BusesService {

    @Autowired
    BusesRepository busesRepository;

    public List<Buses> fetchAllBuses() {
        return busesRepository.findAll();
    }
}
