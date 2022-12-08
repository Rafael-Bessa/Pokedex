package bessa.moragon.rafael.pokedex.controller;

import bessa.moragon.rafael.pokedex.model.Pokemon;
import bessa.moragon.rafael.pokedex.service.PokemonService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@AllArgsConstructor
@RequestMapping("/pokemon")
public class PokemonController {

    final private RestTemplate restTemplate;
    final private PokemonService service;

    @GetMapping("/{id}")
    public String getJsonPokemon(@PathVariable Long id, Model model) throws Exception {
        ResponseEntity<String> json = restTemplate.getForEntity("https://pokeapi.co/api/v2/pokemon/" + id, String.class);

        Pokemon pokemon = service.getJsonAndSetPokemon(json.getBody());
        model.addAttribute("pokemon", pokemon);
        return "pokemon";
    }





}
