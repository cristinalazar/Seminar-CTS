package clase;

import java.util.ArrayList;
import java.util.List;


public class Zoo implements ZooInterface{

    private Zookeeper zookeeper;
    private List<Animal> animalList;

    public Zoo() {
        this.animalList = new ArrayList<>();
        zookeeper = new Zookeeper("Ion");
    }

    public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
        this.zookeeper = zookeeper;
        this.animalList = animalList;
    }

    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void adaugaAnimal(Animal animal){
        this.animalList.add(animal);
    }

    public void feedAllAnimals(){
        for(Animal animal : animalList)
            zookeeper.feed(animal);
    }

}