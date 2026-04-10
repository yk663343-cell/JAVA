class Animal {
    Animal getObject() {
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    Dog getObject() {
        return new Dog();
    }
}