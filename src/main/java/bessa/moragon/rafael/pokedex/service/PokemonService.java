package bessa.moragon.rafael.pokedex.service;

import bessa.moragon.rafael.pokedex.model.Pokemon;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    public Pokemon getJsonAndSetPokemon(String json) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Pokemon.class);
    }


}
