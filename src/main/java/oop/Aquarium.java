package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aquarium {

    private List<Fish> aquarium = new ArrayList<>();

    public void addFish(Fish fish){
        aquarium.add(fish);
    }

    public void feed(){
        aquarium.forEach(Fish::feed);
    }

    public void removeFish(){
        int weightLimit = 11;
        aquarium = aquarium.stream().filter(fish -> fish.getWeight()<weightLimit)
                .collect(Collectors.toList());
    }
    public List<String> getStatus(){
        return aquarium.stream().map(Fish::status).collect(Collectors.toList());
    }

}
