package TheZoo;

// This is a superclass TheZoo.Animal that is a parent class
// for child class TheZoo.Cat.
@SuppressWarnings("FieldMayBeFinal") // <-- Для красоты кода.

public class Animal {

    //---Constructor---
     public Animal(){} // Empty constructor is created by java, aka called default constructor

    // Constructor that accepts argument and that could be called by the child class TheZoo.Cat
    // that could call its own argument within TheZoo.Cat's constructor.
    public Animal(boolean veg, String food){
        this.vegetarian = veg;
        this.eats = food;
    }

    //---Fields---
    private boolean vegetarian;
    private String eats;

    //---Methods---
    @Override
    public String toString(){
        return "";
    }

    public void sound(){}

    public void print(){}

    //---Getters---
    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }
}
