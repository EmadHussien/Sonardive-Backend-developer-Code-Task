
package com.sonardive.backend_code_task.mapper;

import com.sonardive.backend_code_task.dto.CountryDto;
import com.sonardive.backend_code_task.entities.Country;
import com.sonardive.backend_code_task.service.CountryService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring") // Enable Spring integration
public abstract class CountryMapper {

    @Autowired
    protected CountryService countryService;

    @Mapping(target = "name", source = "isoCode", qualifiedByName = "mapIsoCodeToName")
    public abstract CountryDto toDto(Country country);

    @Named("mapIsoCodeToName")
    public String mapIsoCodeToName(String isoCode) {
        return countryService.getName(isoCode);
    }
}
