package com.zizou.stockweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zizou on 2017-12-04.
 */

@RestController
public class IndexController {
    @RequestMapping("/api/hello")
    public String greeting(){
        return "Hello Stock Web!!!";
    }
}
