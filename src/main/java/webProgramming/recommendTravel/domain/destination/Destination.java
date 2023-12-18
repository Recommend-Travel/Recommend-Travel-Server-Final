package webProgramming.recommendTravel.domain.destination;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 4)
    private String mbti;

    @Column(nullable = false)
    private String bestPartner;

    @Column(nullable = false)
    private String worstPartner;

    @Column(name = "destination", nullable = false)
    private String destinationsList;

    @Column(nullable = false, length = 1024)
    private String message;

    @Column(length = 50)
    private String imgUrl1; // `img_url` 필드를 Java에서 camelCase로 변경

    @Column(length = 50)
    private String imgUrl2; // `img_url` 필드를 Java에서 camelCase로 변경

    @Column(length = 50)
    private String imgUrl3; // `img_url` 필드를 Java에서 camelCase로 변경
}
