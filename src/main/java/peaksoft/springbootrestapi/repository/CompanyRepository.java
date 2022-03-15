package peaksoft.springbootrestapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.springbootrestapi.entity.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository
        extends JpaRepository<Company, Long> {

    @Override
    List<Company> findAll();

    @Override
    <S extends Company> S save(S entity);

    @Override
    Optional<Company> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
