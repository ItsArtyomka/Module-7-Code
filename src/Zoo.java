public class Zoo {
    Animal[] animals;
    public Zoo(){
        animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Reptile();
    }
    public void print(){
        for( Animal a: animals){
            a.print();
        }
    }
    public void change(Animal a, int i){
        if (i >= 0 && i < animals.length)
            animals[i] = a;
    }
}
