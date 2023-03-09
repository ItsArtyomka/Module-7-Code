@SuppressWarnings("CommentedOutCode")
public class Zoo {
    // Code below is old version, and is limited because we cannot for example simply add
    // object "PopcornStand" just by using the change() method because Object class doesn't have print() method.

//    Animal[] animals;
//    public Zoo(){
//        animals = new Animal[3];
//        animals[0] = new Dog();
//        animals[1] = new Cat();
//        animals[2] = new Reptile();
//    }
//    public void print(){
//        for( Animal a: animals){
//            a.print();
//        }
//    }
//    public void change(Animal a, int i){
//        if (i >= 0 && i < animals.length)
//            animals[i] = a;
//    }

    // The problem above that was stated at the start of the old code could be fixed
    // by using the Object method as it's a superclass for all classes.

    // Object[] so we could have different things in the zoo.
    Object[] objects;

    // Zoo constructor will be used to create the instance of the Zoo class.
    // Fun fact: Constructors are similar to methods that automatically gets executed whenever you create an object.
    public Zoo() {
        // First we create the "space" for the object of the zoo.
        objects = new Object[3];
        // Then we fill it with animals and a popcorn stand.
        objects[0] = new Dog();
        objects[1] = new PopcornStall();
        objects[2] = new Reptile();
    }

    public void print() {
        // Looping through the objects array;
        for (Object a : objects) {
            // Thanks to toString() method, we simply output variable 'a'.
            System.out.println(a);
        }
    }
}
