package com.sonardive.backend_code_task.mapper;

import com.sonardive.backend_code_task.dto.CompanyDto;
import com.sonardive.backend_code_task.entities.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = CountryMapper.class)
public interface CompanyMapper {

    CompanyDto toDto(Company company);
}
