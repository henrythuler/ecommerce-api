package br.com.thuler.ecommerce.dao;

import br.com.thuler.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ProductDao extends JpaRepository<Product, Long> {
}
