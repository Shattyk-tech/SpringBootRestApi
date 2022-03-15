package peaksoft.springbootrestapi.mapper;

import org.springframework.stereotype.Component;
import peaksoft.springbootrestapi.dto.CompanyResponse;
import peaksoft.springbootrestapi.entity.Company;

import java.util.ArrayList;
import java.util.List;

@Component

public class CompanyViewMapper {
    public CompanyResponse viewCompany(Company company){
        if (company==null){
            return null;
        }
        CompanyResponse response = new CompanyResponse();
        if (company.getId()!= null){
            response.setId(String.valueOf(company.getId()));
        }
        response.setCompanyName(company.getCompanyName());
        response.setAddress(company.getAddress());
        response.setEmal(company.getEmail());
        response.setBlocked(company.isBloked());
        response.setDateTime(company.getCreateadAt());
        response.setNumber(company.getNumber());
        return response;
    }
    public List<CompanyResponse> viewCompanies(List<Company>companies){
        List<CompanyResponse> responses = new ArrayList<>();
        for (Company c:companies
             ) {
            responses.add(viewCompany(c));
        }
            return responses;
            
        }
    }

