package pe.edu.i201020059.cl1_jpa_data_tafur_manuel.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountryLanguage {
    @EmbeddedId
    private CountryLanguageId id;
    @ManyToOne
    @MapsId("countryCode")
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country country;
    private String isOfficial;
    private float percentage;
}
