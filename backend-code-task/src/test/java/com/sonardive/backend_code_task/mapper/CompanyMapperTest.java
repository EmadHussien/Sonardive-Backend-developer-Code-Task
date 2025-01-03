package com.sonardive.backend_code_task.mapper;

import com.sonardive.backend_code_task.dto.CompanyDto;
import com.sonardive.backend_code_task.entities.Company;
import com.sonardive.backend_code_task.entities.Country;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CompanyMapperTest {

    @Autowired
    private CompanyMapperImpl companyMapper;

    @Test
    void testToDto() {
        Country country = new Country();
        country.setId(100);
        country.setIsoCode("US");

        Company company = new Company();
        company.setId(1);
        company.setName("Test Company");
        company.setCountry(country);

        CompanyDto dto = companyMapper.toDto(company);

        assertEquals(1, dto.id());
        assertEquals("Test Company", dto.name());
        assertEquals(100, dto.country().id());
        assertEquals("name of US", dto.country().name());
    }
}
