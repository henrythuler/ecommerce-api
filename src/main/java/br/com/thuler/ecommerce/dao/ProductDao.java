package br.com.thuler.ecommerce.dao;

import br.com.thuler.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ProductDao extends JpaRepository<Product, Long> {

    Page<Product> findByCategoryId(@Param("id") Long category, Pageable pageable);

    Page<Product> findByNameContaining(@Param("keyword") String keyword, Pageable pageable);

}
