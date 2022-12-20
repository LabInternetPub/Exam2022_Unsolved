package cat.tecnocampus.apollofy.persistence;

import cat.tecnocampus.apollofy.domain.UserFy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserFy, Long> {
    Optional<UserFy> findByEmail(String email);

    @Query("select u from UserFy u where u.email in :emails")
    List<UserFy> findAllByEmail(@Param("emails") List<String> emails);


}
