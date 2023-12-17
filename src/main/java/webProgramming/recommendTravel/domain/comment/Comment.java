package webProgramming.recommendTravel.domain.comment;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue
    private String CommentID;
    @Column(nullable = false, length = 25, name = "PostID")
    private String PostID;
    @Column(nullable = false, length = 25, name = "UserID")
    private String UserId;
    @Column(nullable = false, length = 200, name = "Content")
    private String Content;
    @Column(nullable = false, name = "Timestamp")
    private Date Timestamp;
}