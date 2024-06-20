package br.com.thuler.ecommerce.dao;

import br.com.thuler.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Long> {
}
