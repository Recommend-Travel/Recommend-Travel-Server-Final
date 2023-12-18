package webProgramming.recommendTravel.service.recommend;


import webProgramming.recommendTravel.domain.destination.Destination;

public interface RecommendService {
    Destination getRecommendationByMbti(String mbtiType);
}