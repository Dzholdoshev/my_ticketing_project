package com.cydeo.entity;

import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private String name;
    private String code;
    private UserDTO assignedManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private Status status;



}
