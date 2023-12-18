package webProgramming.recommendTravel.controller.mbti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webProgramming.recommendTravel.service.mbti.MbtiService;

import java.util.List;

@RestController
@RequestMapping("/api/mbti")
public class MbtiController {
    private static final Logger log = LoggerFactory.getLogger(MbtiController.class);

    private final MbtiService mbtiService;

    @Autowired
    public MbtiController(MbtiService mbtiService) {
        this.mbtiService = mbtiService;
    }

    @PostMapping("/evaluate")
    public ResponseEntity<String> evaluateMbti(@RequestBody List<String[]> answers) {
        log.info("Received data: {}", answers);
        String mbtiResult = mbtiService.evaluateMbti(answers);
        return ResponseEntity.ok(mbtiResult);
    }
}
