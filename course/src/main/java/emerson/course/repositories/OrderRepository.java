package emerson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import emerson.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
