package com.tomato.delivery.controllers;

import com.tomato.delivery.services.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class KafkaController {
    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        for(int i=1;i<=200000;i++) {this.kafkaService.updateLocation("("+Math.random()+" , "+Math.random()+")");}

        return new ResponseEntity<>(Map.of("message","Location Updated."), HttpStatus.OK);
    }
}
