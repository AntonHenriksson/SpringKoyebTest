package se.jensen.anton.springkoyebtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/tests")
public class TestController {

    private final List<Test> tests = new ArrayList<>();

    public TestController() {
        Test a = new Test();
        a.setId(1L);
        a.setName("First");
        tests.add(a);

        Test b = new Test();
        b.setId(2L);
        b.setName("Second");
        tests.add(b);


        Test c = new Test();
        c.setId(3L);
        c.setName("Third");
        tests.add(c);
    }

    @GetMapping
    public List<Test> findAll() {
        return tests;
    }

}