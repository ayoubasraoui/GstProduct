package ma.ayouub.gestionproduit.repository;

import ma.ayouub.gestionproduit.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository  extends JpaRepository<Product,Long> {
    List<Product> findByNameContains (String mc);
    List<Product> findByPriceGreaterThan(double price);
}
