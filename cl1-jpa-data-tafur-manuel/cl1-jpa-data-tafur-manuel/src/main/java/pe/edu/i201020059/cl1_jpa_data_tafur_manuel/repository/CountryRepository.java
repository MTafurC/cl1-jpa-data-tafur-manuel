package pe.edu.i201020059.cl1_jpa_data_tafur_manuel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.i201020059.cl1_jpa_data_tafur_manuel.entity.Country;

import java.util.Optional;

@Repository
public interface CountryRepository extends CrudRepository<Country,String> {
    Optional<Country> findByCode(String code);
}
