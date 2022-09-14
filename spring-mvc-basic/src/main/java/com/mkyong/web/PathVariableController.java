package com.mkyong.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/path")
public class PathVariableController {

    @GetMapping("/api/page/{id}")
    public String getPageById(@PathVariable String id) {
        return id;
    }

    @GetMapping("/api/title/{title}")
    public String getPageByName(@PathVariable("title") String name) {
        return name;
    }

    @GetMapping("/api/multi/{tag}/{name}")
    public String getPageByTagAndName(@PathVariable String tag, @PathVariable String name) {
        return tag + ":" + name;
    }

    @GetMapping("/api/multi/{tag}/and/{name}")
    public String getPageByTagAndNameMapVersion(@PathVariable Map<String, String> map) {
        String tag = map.get("tag");
        String name = map.get("name");
        if (tag != null && name != null) {
            return tag + ":" + name;
        } else {
            return "Tag or name are missing";
        }
    }

    // From docs.spring.io, modify to support version double digits and .RELEASE as optional
    // spring-webmvc-5.3.22.jar, spring-webmvc-5.2.22.RELEASE.jar
    @GetMapping("/api/get/{name:[a-z-]+}-{version:\\d{1,2}\\.\\d{1,2}\\.\\d{1,2}(?:\\.RELEASE)?}{ext:\\.[a-z]+}")
    public String getJarFile(@PathVariable String name,
                             @PathVariable String version,
                             @PathVariable String ext) {
        return name + "-" + version + ext;
    }

    @GetMapping(value = {"/api2/page/", "/api2/page/{id}"})
    public String getPageByApi2(@PathVariable String id) {
        return id;
    }

    @GetMapping(value = {"/api3/page/", "/api3/page/{id}"})
    public String getPageByApi3(@PathVariable(required = false) String id) {

        if (id != null) {
            return id;
        } else {
            return "id is required!";
        }

    }

    @GetMapping(value = {"/api4/page/", "/api4/page/{id}"})
    public String getPageByApi4(@PathVariable Optional<String> id) {

        if (id.isPresent()) {
            return id.get();
        } else {
            return "id is required!";
        }

        // or one line
        // return id.orElse("id is required!");

    }

    // value after the last dot get truncated, try regex
    /*@GetMapping("/hello/{name}")
    public String whereIsDot(@PathVariable("name") String name) {
        return name;
    }*/
    @GetMapping("/hello/{name:.+}")
    public String whereIsDotFixed(@PathVariable("name") String name) {
        return name;
    }

}
