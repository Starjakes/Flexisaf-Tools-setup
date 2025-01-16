package com.flexisaf.spring_framework_demo.controllers;

import com.flexisaf.spring_framework_demo.entities.ClassRoom;
import com.flexisaf.spring_framework_demo.services.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classrooms")
public class ClassRoomController {

    @Autowired
    private ClassRoomService classRoomService;

    @GetMapping
    public List<ClassRoom> getAllClasses() {
        return classRoomService.getAllClasses();
    }

    @PostMapping
    public ClassRoom createClassRoom(@RequestBody ClassRoom classRoom) {
        return classRoomService.saveClassRoom(classRoom);
    }
}
