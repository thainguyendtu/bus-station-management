package vn.com.cmc.testapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.cmc.testapi.service.BusesService;

@RestController
@RequestMapping("/buses")
public class BusesController {

    @Autowired
    BusesService busesService;

    @GetMapping()
    public ResponseEntity<?> fetchAllBuses() {
        return ResponseEntity.ok(busesService.fetchAllBuses());
    }
}
