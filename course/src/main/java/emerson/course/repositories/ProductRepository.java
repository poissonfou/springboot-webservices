package emerson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import emerson.course.entities.Category;
import emerson.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
