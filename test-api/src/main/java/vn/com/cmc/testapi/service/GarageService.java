package vn.com.cmc.testapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.cmc.testapi.model.entity.Garage;
import vn.com.cmc.testapi.repository.GarageRepository;

import java.util.List;

@Service
public class GarageService {

    @Autowired
    GarageRepository garageRepository;

    public List<Garage> fetchAllGarages() {
        return garageRepository.findAll();
    }
}
