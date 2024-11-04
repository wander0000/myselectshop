package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Product;
import com.sparta.myselectshop.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>{
//    페이징 전 전체 관심상품 조회
//    List<Product> findALlByUser(User user);
    //페이징 한 회원별 관심상품조회
    Page<Product> findAllByUser(User user, Pageable pageable);
}
