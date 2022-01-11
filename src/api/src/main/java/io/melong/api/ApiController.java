package io.melong.api;

import io.melong.common.TestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class ApiController {
    @GetMapping("/")
    public TestDto index() {
        return TestDto.builder().message("test").build();
    }
}
