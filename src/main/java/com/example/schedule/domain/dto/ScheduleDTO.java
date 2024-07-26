package com.example.schedule.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ScheduleDTO {

    private String id;
    private Date startDate;
    private Date endDate;
    private DoctorDTO medic;
    private String address;

}
