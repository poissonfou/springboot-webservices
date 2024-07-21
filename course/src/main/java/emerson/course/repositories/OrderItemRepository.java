package emerson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import emerson.course.entities.OrderItem;
import emerson.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
