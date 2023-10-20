package kr.co.lotteon.repository.product;

import kr.co.lotteon.entity.product.ProductCartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCartRepository extends JpaRepository<ProductCartEntity, Integer>{
    
}
