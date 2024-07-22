package secao12.updowncasting;

import java.util.ArrayList;
import java.util.List;

import static secao12.updowncasting.AlimentarAnimais.alimentar;

public class UpDownCastingMain {

    public static void main(String[] args) {

//        Passaro passaro = new Passaro();
//        // animal = (Animal) pássaro
//        Animal animal = passaro;
//
//        passaro.comer();
//        animal.comer();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Passaro());
        animalList.add(new Cachorro());

        for (Animal animal : animalList) {
            alimentar(animal);
        }

        Animal animal = new Cachorro();
        alimentar(animal);
    }
}
