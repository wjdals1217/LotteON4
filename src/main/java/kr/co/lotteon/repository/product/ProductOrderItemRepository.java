package kr.co.lotteon.repository.product;

import kr.co.lotteon.entity.product.ProductOrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrderItemRepository extends JpaRepository<ProductOrderItemEntity, Integer> {
    
}
