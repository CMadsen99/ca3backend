package fetcher;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.FactDTO;
import dto.ChuckDTO;
import dto.CombinedDTO;
import dto.DadDTO;
import dto.FactsDTO;
import dto.PersonDTO;
import dto.PlanetDTO;
import dto.SpaceShipDTO;
import dto.SwabiDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import utils.HttpUtils;


public class Fetcher {
 
        private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
        
    public CombinedDTO getJokes() throws IOException{
        String chuck = HttpUtils.fetchData("https://api.chucknorris.io/jokes/random");
        ChuckDTO chuckDTO = GSON.fromJson(chuck, ChuckDTO.class);

        String dad = HttpUtils.fetchData("https://icanhazdadjoke.com");
        DadDTO dadDTO = GSON.fromJson(dad, DadDTO.class);

        CombinedDTO cDTO = new CombinedDTO(chuckDTO, dadDTO);
        
        return cDTO;
    }
    
    public SwabiDTO getSwabi() throws IOException{
        
        String person = HttpUtils.fetchData("https://swapi.dev/api/people/1/");
        String planet  = HttpUtils.fetchData("https://swapi.dev/api/planets/1/");
        String spaceship  = HttpUtils.fetchData("https://swapi.dev/api/starships/9/");
        
        PersonDTO pDTO = GSON.fromJson(person, PersonDTO.class);
        PlanetDTO planetDTO = GSON.fromJson(planet, PlanetDTO.class);
        SpaceShipDTO sDTO = GSON.fromJson(spaceship, SpaceShipDTO.class);
        
        SwabiDTO swabiDTO = new SwabiDTO(sDTO, pDTO, planetDTO);
        
        return swabiDTO;
    }
    
    public FactsDTO getFacts() throws IOException{
        String cat = HttpUtils.fetchData("https://cat-fact.herokuapp.com/facts/random?animal_type=cat");
        String dog = HttpUtils.fetchData("https://cat-fact.herokuapp.com/facts/random?animal_type=dog");
        
        FactDTO cDTO = GSON.fromJson(cat, FactDTO.class);
        FactDTO dDTO = GSON.fromJson(dog, FactDTO.class);
        
        FactsDTO facts = new FactsDTO(cDTO, dDTO);
        
        return facts;
    }
    
}
