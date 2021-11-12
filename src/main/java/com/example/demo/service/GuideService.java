package com.example.demo.service;

import com.example.demo.config.AppConfig;
import com.example.demo.dao.GuideMapper;
import com.example.demo.entity.Guide;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class GuideService {

    GuideMapper guideMapper;

    public GuideService(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        guideMapper = ctx.getBean(GuideMapper.class);
    }
    
    public void insert(Guide guide) {
        guideMapper.insert(guide);
        System.out.println("New region has been added");
    }

    public Guide getGuides() {
        return guideMapper.getGuides();
    }

    public void delete(Long id) {
        guideMapper.delete(id);
    }


    public void change(Guide guide) {
        guideMapper.updateVillage(guide);
    }
}
