package com.korit.springboot.controller;

import com.korit.springboot.dto.InsertStudyReqDto;
import com.korit.springboot.mapper.StudyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class MybatisController {

    @Autowired
    private StudyMapper studyMapper;

    @PostMapping("/mybatis/study")
    public ResponseEntity<?> insert(@RequestBody InsertStudyReqDto dto) {
        studyMapper.insert(dto.getName(), dto.getAge());
        return ResponseEntity.ok().build();
    }

}
