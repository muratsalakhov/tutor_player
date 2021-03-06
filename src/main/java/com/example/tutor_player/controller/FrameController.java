package com.example.tutor_player.controller;

import com.example.tutor_player.model.Frame;
import com.example.tutor_player.model.Program;
import com.example.tutor_player.service.FrameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Set;

@RestController
@RequestMapping("/neo4j/frame")
public class FrameController {

    @Autowired
    FrameService frameService;

    @GetMapping
    public Collection<Frame> getAll() {
        return frameService.getAll();
    }

    @GetMapping("/getWithAction/{uuid}")
    public Set<Frame> getByAction(@PathVariable String uuid) {
        return frameService.getFramesByAction(uuid);
    }

    @GetMapping("/{uuid}")
    public Frame getByUuid(@PathVariable String uuid) {
        return frameService.getByUuid(uuid);
    }
}
