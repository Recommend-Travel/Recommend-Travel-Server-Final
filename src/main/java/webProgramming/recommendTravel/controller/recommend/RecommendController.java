package webProgramming.recommendTravel.controller.recommend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import webProgramming.recommendTravel.domain.destination.Destination;
import webProgramming.recommendTravel.service.recommend.RecommendService;

@RestController
@RequestMapping("/recommend-travel")
public class RecommendController {

    private final RecommendService recommendService;

    @Autowired
    public RecommendController(RecommendService recommendService) {
        this.recommendService = recommendService;
    }

    @GetMapping("/recommend-destinations")
    public ResponseEntity<Destination> recommendDestinations(@RequestParam String mbti) {
        Destination recommendation = recommendService.getRecommendationByMbti(mbti);
        if (recommendation != null) {
            return ResponseEntity.ok(recommendation);
        } else {
            // 목적지를 찾지 못했을 때 적절한 HTTP 상태 코드와 메시지를 반환하도록 처리
            return ResponseEntity.notFound().build();
        }
    }
}