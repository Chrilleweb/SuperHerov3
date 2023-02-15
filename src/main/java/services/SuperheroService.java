package services;

import model.Superhero;
import org.springframework.stereotype.Service;
import repositories.SuperheroRepository;

import java.util.List;


@Service
public class SuperheroService {

    private final SuperheroRepository repository;

    public SuperheroService(SuperheroRepository superhero) {
        this.repository = new SuperheroRepository();
    }

    public List<Superhero> getSuperheros()  {
        return repository.getSuperheroes();
    }

    public Superhero getSuperhero(String superhero)  {
        return repository.getSuperhero(superhero);
    }

    public Superhero addSuperhero(Superhero superhero) {
        Superhero returnSuperhero = repository.addSuperhero(superhero);
        return returnSuperhero;
    }

    public Superhero putSuperhero(Superhero superhero) {
        Superhero returnNewSuperhero = repository.changeSuperhero(superhero);
        return returnNewSuperhero;
    }

    public Superhero deleteSuperhero(String superhero){
        Superhero returnDeletedSuperhero = repository.deleteSuperhero(superhero);
        return returnDeletedSuperhero;
    }
}


