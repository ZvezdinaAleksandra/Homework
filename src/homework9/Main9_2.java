package homework9;

public class Main9_2 {
    public static void main(String[] args) {

        Homework9_2 animals = new Homework9_2();

        animals.addAnimal("Кот");
        animals.addAnimal("Собака");
        animals.addAnimal("Лев");

        animals.showAnimals();
        // [Лев, Собака, Кот]

        animals.removeAnimal();
        animals.showAnimals();
        // [Лев, Собака]

        animals.removeAnimal();
        animals.showAnimals();
        // [Лев]
    }
}

