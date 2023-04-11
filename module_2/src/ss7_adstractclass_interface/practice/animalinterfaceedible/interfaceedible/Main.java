package ss7_adstractclass_interface.practice.animalinterfaceedible.interfaceedible;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Origin();
        fruit[1] = new Apple();
        for (Fruit fruit1 : fruit) {
            System.out.println(fruit1.howToEat());
        }
    }
}
