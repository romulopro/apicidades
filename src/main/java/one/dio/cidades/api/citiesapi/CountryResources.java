package one.dio.cidades.api.citiesapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResources {

    @Autowired // construtor que recebe o parâmetro da variável abaixo
    private CountryRepository repository;
    @GetMapping
    public List<Country> countries(){
        return repository.findAll();
    }
}
