class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class pack {
  public static void main(String[] args) {
    Animal[] animals = {new Animal(),new Dog(), new Pig()};
        for (Animal animal : animals) {
            animal.animalSound();
        }
  }
}
