package webProgramming.recommendTravel.service.recommend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webProgramming.recommendTravel.domain.destination.Destination;
import webProgramming.recommendTravel.repository.destination.DestinationRepository;

@Service
public class RecommendServiceImpl implements RecommendService {

    private final DestinationRepository destinationRepository;

    @Autowired
    public RecommendServiceImpl(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    @Override
    public Destination getRecommendationByMbti(String mbtiType) {
        // MBTI 유형에 해당하는 목적지를 찾아서 반환합니다.
        // 목적지를 찾지 못한 경우에는 null을 반환하거나 적절한 예외 처리를 할 수 있습니다.
        return destinationRepository.findByMbti(mbtiType).orElse(null);
    }
}