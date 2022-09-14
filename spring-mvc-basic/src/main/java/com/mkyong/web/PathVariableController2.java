package com.mkyong.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/path2/api/{id}")
public class PathVariableController2 {

    @GetMapping("/page/{title}")
    public String getPageById(@PathVariable String id, @PathVariable String title) {
        return id + title;
    }

}
