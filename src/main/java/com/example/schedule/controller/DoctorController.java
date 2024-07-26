package com.example.schedule.controller;


import com.example.schedule.domain.dto.DoctorDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/doctors")
public class DoctorController {

    @GetMapping(value = "/{id}")
    public DoctorDTO findById(@PathVariable(value = "id") String id) {
        if (id.equals("1")) {
            return new DoctorDTO("1", "José");
        }
        return new DoctorDTO("NOT FOUND");
    }

    @GetMapping
    public List<DoctorDTO> findAll() {
        List<DoctorDTO> doctorDTOS = new ArrayList<>();
        doctorDTOS.add(new DoctorDTO("1", "José"));
        doctorDTOS.add(new DoctorDTO("2", "Maria"));
        doctorDTOS.add(new DoctorDTO("3", "João"));
        doctorDTOS.add(new DoctorDTO("4", "Mario"));
        doctorDTOS.add(new DoctorDTO("5", "Jair"));
        doctorDTOS.add(new DoctorDTO("6", "Wagner"));
        return doctorDTOS;
    }
}
