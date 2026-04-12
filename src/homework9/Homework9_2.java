package homework9;
/*Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса*/

import java.util.LinkedList;

public class Homework9_2 {
    private LinkedList<String> animals = new LinkedList<>();

    // Добавление в начало
    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    // Удаление с конца
    public String removeAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пуста");
            return null;
        }
        return animals.removeLast();
    }

    // Показать всех животных
    public void showAnimals() {
        System.out.println(animals);
    }
}