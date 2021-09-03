package com.zekeriyafince.schoolmanagement.utils;

import com.zekeriyafince.schoolmanagement.dto.CourseCreateDto;
import com.zekeriyafince.schoolmanagement.service.abstracts.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class InitializerRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(InitializerRunner.class);

    @Autowired
    CourseService courseService;

    @Override
    public void run(String... args) throws Exception {

        this.courseService.createCourse(new CourseCreateDto("Fizik","101",5));
        this.courseService.createCourse(new CourseCreateDto("Matematik","102",6));
        this.courseService.createCourse(new CourseCreateDto("Kimya","103",7));

        this.courseService.getCourses().forEach(course -> logger.info("{}", course));

    }
}
