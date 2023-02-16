package com.example.superheltev3.repositories;

import com.example.superheltev3.model.Superhero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperheroRepository {
    private final List<Superhero> superheroes = new ArrayList<Superhero>(List.of(
            new Superhero("Batman", "Bruce Wayne", false, "Money", 1939, 1.0),
            new Superhero("Spiderman", "Peter Parker", true, "Spindelvæv", 2000, 1.0),
            new Superhero("Wonder Women", "Diana Prince", true, "fly", 2010, 1.0)
    ));

    public List<Superhero> getSuperheroes()  {
        return superheroes;
    }
    public Superhero getSuperhero(String superhero)  {
        for(Superhero superhero1 : superheroes){
            if(superhero1.getSuperHeroName().equals(superhero)){
                return superhero1;
            }

        }

        return null;
    }

    public Superhero addSuperhero(Superhero superhero) {
        superheroes.add(superhero);
        // her kunne server tilføje ekstra attributter, f.eks dato for oprettelse
        // inden vi returnerer message
        return superhero;
    }

    public Superhero changeSuperhero(Superhero superhero) {
        //Overskriv eksisterende message

        // find message i messages

        for(Superhero superhero1 :superheroes) {
            if(superhero1.getSuperHeroName().equals(superhero.getSuperHeroName())) {

                String newSuperHeroName = superhero.getSuperHeroName();
                superhero1.setSuperheroName(newSuperHeroName);
                String newReelName = superhero.getReelName();
                superhero1.setReelName(newReelName);
                boolean newIsHuman = superhero.isHuman();
                superhero1.setIsHuman(newIsHuman);
                String newSuperPower = superhero.getSuperPower();
                superhero1.setSuperPower(newSuperPower);
                int newCreationYear = superhero.getCreationYear();
                superhero1.setCreationYear(String.valueOf(newCreationYear));
                double newPowerLevel = superhero.getPowerLevel();
                superhero1.setPowerLevel(String.valueOf(newPowerLevel));

            }
            return superhero1;
        }

        return null; // object not found


    }

    public Superhero deleteSuperhero(String superhero){
        for(Superhero superhero1 : superheroes) {
            if(superhero1.getSuperHeroName().equals(superhero)) {
                superheroes.remove(superhero1);
            }
        }
        return null;
    }




}
