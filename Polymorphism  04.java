interface Animal {
  void animalSound();
}

class Pig implements Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog implements Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class pack {
  public static void main(String[] args) {
    Animal[] animals = {new Dog(), new Pig()};
        for (Animal animal : animals) {
            animal.animalSound();
        }
  }
}
