package TheZoo;

public class Dog extends Mammal{
    public Dog() {}

    @Override
    public void print(){
        System.out.println("I am a TheZoo.Dog");
    }

    @Override
    public String toString(){
        return "I am a TheZoo.Dog.";
    }
}
