package api.mysql.repo;
import api.mysql.controller.*;
import api.mysql.entity.*;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long>{

}
