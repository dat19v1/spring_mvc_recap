package kea.clbo.repository;

import kea.clbo.model.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class AnimalRepository implements ICrudRepository<Animal> {

    private List<Animal> animals = new ArrayList<>();

    public AnimalRepository() {
        this.animals.add(new Animal(1, "Hans", "Dog"));
        this.animals.add(new Animal(2, "Hansine", "Cat"));
        this.animals.add(new Animal(3, "Hansole", "Fish"));
    }

    @Override
    public void create(Animal animal) {
        animals.add(animal);
    }

    @Override
    public List<Animal> readAll() {
        return animals;
    }

    @Override
    public Animal read(int id) {
        return null;
    }

    @Override
    public boolean update(Animal animal) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
