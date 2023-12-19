package webProgramming.recommendTravel.repository.userfavorite;

import org.springframework.data.jpa.repository.JpaRepository;

import webProgramming.recommendTravel.domain.user.User;


public interface UserFavoriteRepository {
    void deleteByUser(User user);

}