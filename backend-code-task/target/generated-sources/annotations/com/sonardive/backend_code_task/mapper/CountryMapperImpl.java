package com.sonardive.backend_code_task.mapper;

import com.sonardive.backend_code_task.dto.CountryDto;
import com.sonardive.backend_code_task.entities.Country;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-03T19:35:00+0200",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class CountryMapperImpl extends CountryMapper {

    @Override
    public CountryDto toDto(Country country) {
        if ( country == null ) {
            return null;
        }

        String name = null;
        int id = 0;

        name = mapIsoCodeToName( country.getIsoCode() );
        id = country.getId();

        CountryDto countryDto = new CountryDto( id, name );

        return countryDto;
    }
}
