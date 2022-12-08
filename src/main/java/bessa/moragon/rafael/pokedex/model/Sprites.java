package bessa.moragon.rafael.pokedex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sprites {

    private String back_default;
    private String back_female = null;
    private String back_shiny;
    private String back_shiny_female = null;
    private String front_default;
    private String front_female = null;
    private String front_shiny;
    private String front_shiny_female = null;

}
