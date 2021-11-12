package com.example.demo.controller;

import com.example.demo.entity.Guide;
import com.example.demo.service.GuideService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/guide")
public class Controller {

    private final GuideService guideService;

    public Controller(GuideService guideService) {
        this.guideService = guideService;
    }
    @GetMapping("/get")
    public Guide getGuides(){
        return guideService.getGuides();
    }

    @PostMapping("/insert")
    public void insert(@RequestBody  Guide guide){
        guideService.insert(guide);
    }

    @PostMapping("/delete")
    public void delete(@RequestParam("id") Long id){
       guideService.delete(id);
    }

    @PostMapping("/change")
    public void changeTitleAndAbbreviate(@RequestBody Guide guide){
        guideService.change(guide);
    }
}
