package webProgramming.recommendTravel.service.community;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webProgramming.recommendTravel.domain.comment.Comment;
import webProgramming.recommendTravel.repository.comment.CommentRepository;

import java.util.Date;

@Service
@Slf4j
public class CommunityService {
    @Autowired
    private CommentRepository commentRepository;
    public Comment getTst() {
        return commentRepository.findById("C2").orElse(null);
    }
    public Comment saveTst() {
        Comment comment = new Comment("C2", "P1", "U1", "내용내용내용", new Date(2023, 11, 11));
        return commentRepository.save(comment);
    }
}
