package com.fate.test.controller;

import com.fate.test.kkk.ImageMatch;
import com.fate.test.power.Result;
import com.fate.test.power.k;
import com.fate.test.power.ttk;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.awt.image.BufferedImage;

@Controller
@RequestMapping("/fate")
public class FGOController {


    @RequestMapping("/test")
    //@ResponseBody
    public String edit() throws AWTException, InterruptedException {
        ImageMatch imageMatch =new ImageMatch();
       // LOGGER.info("编辑任务");
        // "testJobId"为add方法添加的job的namereturn Result.ok();
        return  "test";
    }
    @RequestMapping("/save")
    //@ResponseBody
    public String save(@RequestBody ttk ttk) throws AWTException, InterruptedException {
        System.out.println(ttk);
        ImageMatch imageMatch =new ImageMatch();
        imageMatch.startbattle(ttk);
        // LOGGER.info("编辑任务");
        // "testJobId"为add方法添加的job的namereturn Result.ok();
        return  "test";
    }

    @RequestMapping("/truetest")
    //@ResponseBody
    public String test(@RequestBody k ttk) throws AWTException, InterruptedException {
        System.out.println(ttk);
        ImageMatch imageMatch =new ImageMatch();
        // LOGGER.info("编辑任务");
        // "testJobId"为add方法添加的job的namereturn Result.ok();
        return  "";
    }

}
