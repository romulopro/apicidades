package one.dio.countries.resources;


import java.util.Optional;
import one.dio.countries.entities.Country;
import one.dio.countries.repositories.CountryRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired // construtor que recebe o parâmetro da variável abaixo
    private CountryRepository repository;

    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repository.findAll(page);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Country> getOne(@PathVariable Long id){
        Optional<Country> optional = repository.findById(id);
        if(optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
