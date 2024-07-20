package emerson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import emerson.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
