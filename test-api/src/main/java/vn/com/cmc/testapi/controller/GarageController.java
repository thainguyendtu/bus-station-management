package vn.com.cmc.testapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.cmc.testapi.service.GarageService;

@RestController
@RequestMapping("/garage")
public class GarageController {

    @Autowired
    GarageService garageService;

    @GetMapping()
    public ResponseEntity<?> fetchAllBuses() {
        return ResponseEntity.ok(garageService.fetchAllGarages());
    }
}
