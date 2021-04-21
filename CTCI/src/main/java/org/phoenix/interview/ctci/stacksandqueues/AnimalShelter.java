package org.phoenix.interview.ctci.stacksandqueues;

/**
 * An animal shelter, which holds only dogs and cats, operates on a strictly"first in, first
 * out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
 * or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of
 * that type). They cannot select which specific animal they would like. Create the data structures to
 * maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog,
 * and dequeueCat. You may use the built-in Linked List data structure.
 */

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {

    public static void main(String[] args) {
        AnimalShelter animals = new AnimalShelter();
        Cat cat = new Cat("cat");
        animals.enqueue(cat);

        Dog dog = new Dog("dog");
        animals.enqueue(dog);
        Cat cat1 = new Cat("cat");
        animals.enqueue(cat1);
        Dog dog1 = new Dog("dog");
        animals.enqueue(dog1);
        Cat cat2 = new Cat("cat");
        animals.enqueue(cat2);
        Dog dog3 = new Dog("dog");
        animals.enqueue(dog3);

        System.out.println("Dequeue Any: " + animals.dequeueAny().type);
        System.out.println("Dequeue Cat: " + animals.dequeueCat().type);
        System.out.println("Dequeue Dog: " + animals.dequeueDog().type);
        System.out.println("Dequeue Dog: " + animals.dequeueDog().type);
        System.out.println("Dequeue Cat: " + animals.dequeueCat().type);
    }

    private final Queue<Dog> dogQueue = new LinkedList<>();

    private final Queue<Cat> catQueue = new LinkedList<>();

    private int timeStamp = 0;

    public void enqueue(Animal animal) {
        animal.setTimeStamp(this.timeStamp);
        this.timeStamp++;
        if (animal instanceof Dog) {
            dogQueue.add((Dog) animal);
        } else if (animal instanceof Cat) {
            catQueue.add((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (dogQueue.isEmpty()) {
            return dequeueCat();
        } else if (catQueue.isEmpty()) {
            return dequeueDog();
        }
        Dog tempDog = dogQueue.peek();
        Cat tempCat = catQueue.peek();
        return (tempCat.getTimeStamp() > tempDog.getTimeStamp()) ? dequeueDog() : dequeueCat();
    }

    public Animal dequeueCat() {
        if (catQueue.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return catQueue.poll();
        }
    }

    public Animal dequeueDog() {
        if (dogQueue.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return dogQueue.poll();
        }
    }


    static abstract class Animal {
        String type;
        private int timeStamp;

        Animal(String type) {
            this.type = type;
        }

        public int getTimeStamp() {
            return this.timeStamp;
        }

        public void setTimeStamp(int time) {
            this.timeStamp = time;
        }
    }

    static class Dog extends Animal {
        Dog(String type) {
            super(type);
        }
    }

    static class Cat extends Animal {
        Cat(String type) {
            super(type);
        }
    }
}
