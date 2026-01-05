import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tests")
public class TestController {

    private final TestRepository testRepository;

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @PostMapping
    public Test save(@RequestBody Test test) {
        return testRepository.save(test);
    }

    @GetMapping
    public List<Test> findAll() {
        return testRepository.findAll();
    }

}