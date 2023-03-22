package vn.com.cmc.testapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.cmc.testapi.repository.GarageRepository;

@Service
public class GarageService {

    @Autowired
    GarageRepository garageRepository;
}
