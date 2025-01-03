package com.sonardive.backend_code_task.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.sonardive.backend_code_task.dto.CountryDto;
import com.sonardive.backend_code_task.entities.Country;
import com.sonardive.backend_code_task.service.CountryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CountryMapperTest {

    @Mock
    private CountryService countryService;

    @InjectMocks
    private CountryMapperImpl countryMapper;

    @Test
    public void testToDto() {
        // Arrange
        Country country = new Country();
        country.setId(1);
        country.setIsoCode("US");

        when(countryService.getName("US")).thenReturn("name of US");

        // Act
        CountryDto countryDto = countryMapper.toDto(country);

        // Assert
        assertEquals(1, countryDto.id());
        assertEquals("name of US", countryDto.name());
    }
}