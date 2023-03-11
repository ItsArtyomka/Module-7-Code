package TheZoo;

public class Reptile extends Animal{
    public Reptile(){}
    public Reptile(boolean veg, String food) {
        super(veg, food);
    }

    @Override
    public void print(){
        System.out.println("I am a TheZoo.Reptile");
    }

    @Override
    public String toString(){
        return "I am a TheZoo.Reptile";
    }
}
