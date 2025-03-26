package com.example.schedule.dto;

import com.example.schedule.entity.Schedule;
import lombok.Getter;

import java.util.Date;

@Getter
public class ScheResponseDto {

    private long id;
    private String name;
    private String content;
    private String password;
    //private Date createdDate;
    //private Date updatedDate;

    public ScheResponseDto(Schedule schedule){
        this.id = schedule.getId();
        this.name = schedule.getName();
        this.content = schedule.getContent();
        this.password = schedule.getPassword();
    }
}
