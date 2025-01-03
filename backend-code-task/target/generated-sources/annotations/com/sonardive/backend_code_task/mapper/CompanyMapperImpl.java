package com.sonardive.backend_code_task.mapper;

import com.sonardive.backend_code_task.dto.CompanyDto;
import com.sonardive.backend_code_task.dto.CountryDto;
import com.sonardive.backend_code_task.entities.Company;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-03T19:46:22+0200",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class CompanyMapperImpl implements CompanyMapper {

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public CompanyDto toDto(Company company) {
        if ( company == null ) {
            return null;
        }

        int id = 0;
        String name = null;
        CountryDto country = null;

        id = company.getId();
        name = company.getName();
        country = countryMapper.toDto( company.getCountry() );

        CompanyDto companyDto = new CompanyDto( id, name, country );

        return companyDto;
    }
}
