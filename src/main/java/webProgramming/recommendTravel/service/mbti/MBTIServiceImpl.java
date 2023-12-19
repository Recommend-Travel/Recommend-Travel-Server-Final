package webProgramming.recommendTravel.service.mbti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webProgramming.recommendTravel.domain.mbti.MbtiEvaluator;

import java.util.List;

// MbtiServiceImpl.java
@Service
public class MBTIServiceImpl implements MBTIService {

    private final MbtiEvaluator mbtiEvaluator;

    @Autowired
    public MBTIServiceImpl(MbtiEvaluator mbtiEvaluator) {
        this.mbtiEvaluator = mbtiEvaluator;
    }

    @Override
    public String evaluateMbti(List<String[]> answers) {
        return mbtiEvaluator.evaluateMbti(answers);
    }
}
