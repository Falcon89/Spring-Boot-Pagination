package guru.springframework.dao;

import guru.springframework.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Integer>{
    Page<Product> findAll(Pageable pageable);
}
