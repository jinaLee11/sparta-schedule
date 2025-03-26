package com.example.schedule.controller;


import com.example.schedule.dto.ScheRequestDto;
import com.example.schedule.dto.ScheResponseDto;
import com.example.schedule.entity.Schedule;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/schedules")
public class ScheController {

    private final Map<Long, Schedule> scheduleMap = new HashMap<>();

    @PostMapping // 일정 생성 post
    public ResponseEntity<ScheResponseDto> createSchedule(@RequestBody ScheRequestDto dto) {
        //식별자 증가
        long scheId = scheduleMap.isEmpty() ? 1 : Collections.max(scheduleMap.keySet()) + 1;

        //요청받은 데이터로 일정 객체 생성. 요청은 requestDto형식으로 받았기 떄문에 schedule 형식으로 변환 필
        Schedule schedule = new Schedule(scheId, dto.getName(), dto.getContent(), dto.getPassword());

        // 데이터베이스에 저장
        scheduleMap.put(scheId,schedule); //key : value

        return new ResponseEntity<>(new ScheResponseDto(schedule), HttpStatus.CREATED);
    }

}
