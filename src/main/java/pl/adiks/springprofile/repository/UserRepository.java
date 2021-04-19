package pl.adiks.springprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.adiks.springprofile.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
