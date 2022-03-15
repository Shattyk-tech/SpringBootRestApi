package peaksoft.springbootrestapi.service;

import jdk.jfr.Registered;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.springbootrestapi.dto.CompanyRequest;
import peaksoft.springbootrestapi.dto.CompanyResponse;
import peaksoft.springbootrestapi.entity.Company;
import peaksoft.springbootrestapi.mapper.CompanyEditMapper;
import peaksoft.springbootrestapi.mapper.CompanyViewMapper;
import peaksoft.springbootrestapi.repository.CompanyRepository;

@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository repository;
    private final CompanyEditMapper editMapper;
    private final CompanyViewMapper viewMapper;

    public CompanyResponse create(CompanyRequest companyRequest){
        return viewMapper.viewCompany(repository.save(editMapper.create(companyRequest)));
    }

    public CompanyResponse update(Long id,CompanyRequest companyRequest){
        Company company = repository.findById(id).get();
        editMapper.update(company,companyRequest);
        return viewMapper.viewCompany(repository.save(company));
    }
    public CompanyResponse getCompany(long id){
        return viewMapper.viewCompany(repository.findById(id).get());
    }
    public CompanyResponse delateById(long id){
        Company company = repository.findById(id).get();
        repository.deleteById(id);
        return viewMapper.viewCompany(company);

    }

}
