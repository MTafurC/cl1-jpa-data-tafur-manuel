package pe.edu.i201020059.cl1_jpa_data_tafur_manuel.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountryLanguageId implements Serializable {
    private String countryCode;
    private String language;
}