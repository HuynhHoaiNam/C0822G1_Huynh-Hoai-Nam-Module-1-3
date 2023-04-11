package ss7_adstractclass_interface.practice.animalinterfaceedible.interfaceedible;

import ss7_adstractclass_interface.practice.animalinterfaceedible.animal.Animal;

public class Edible2 extends Animal implements Edible {


    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
