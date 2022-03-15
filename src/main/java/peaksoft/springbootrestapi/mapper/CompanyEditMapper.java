package peaksoft.springbootrestapi.mapper;

import org.springframework.stereotype.Component;
import peaksoft.springbootrestapi.dto.CompanyRequest;
import peaksoft.springbootrestapi.entity.Company;

@Component
public class CompanyEditMapper {

    public Company create(CompanyRequest companyRequest){
        if (companyRequest == null){
            return null;
        }
        Company company = new Company();
        company.setCompanyName(companyRequest.getCompanyName());
        company.setAddress(companyRequest.getAddress());
        company.setNumber(companyRequest.getNumber());
        company.setEmail(company.getEmail());
        return company;
    }
    public void update(Company company,CompanyRequest companyRequest){
        company.setCompanyName(companyRequest.getCompanyName());
        company.setEmail(companyRequest.getEmail());
        company.setNumber(companyRequest.getNumber());
        company.setAddress(companyRequest.getAddress());



    }

}