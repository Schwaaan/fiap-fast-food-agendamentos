package com.example.schedule.domain.dto;

import lombok.Data;

@Data
public class DoctorDTO {

    private String id;
    private String name;
    private String message;

    public DoctorDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public DoctorDTO(String message) {
        this.message = message;
    }
}
