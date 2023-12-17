package webProgramming.recommendTravel.controller.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import webProgramming.recommendTravel.domain.comment.Comment;
import webProgramming.recommendTravel.service.community.CommunityService;

@RestController
public class CommunityController {
    // 커뮤니티 api 여기서 받음
    @Autowired
    private CommunityService communityService;
    @GetMapping("/GetGet")
    public String getTst() {
        Comment comment = communityService.getTst();
        if (comment != null)
            return comment.toString();
        else return "조회 실패";
    }
    @GetMapping("/SaveSave")
    public String saveTst() {
        Comment comment = communityService.saveTst();
        if (comment != null)
            return comment.toString();
        else return "저장 실패";
    }
}
