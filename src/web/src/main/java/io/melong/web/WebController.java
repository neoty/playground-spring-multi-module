package io.melong.web;

import io.melong.common.TestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class WebController {
    @GetMapping("/")
    public TestDto index() {
        return TestDto.builder().message("t123est").build();
    }
}
