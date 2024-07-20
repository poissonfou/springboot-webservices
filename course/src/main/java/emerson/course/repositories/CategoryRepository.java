package emerson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import emerson.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
