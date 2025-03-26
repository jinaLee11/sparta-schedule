package com.example.schedule.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor //생성자
public class Schedule {
    private long id;
    private String name;
    private String title;
    private String content;
    private String password;
    //날짜 우짜지
    //private Date createdDate;
    //private Date updatedDate;

}
