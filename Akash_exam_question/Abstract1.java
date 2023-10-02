package Akash;

abstract class Abstract1 {
    public abstract void animal();
    public void sleep(){
        System.out.println("This is Sleep abstract method...");
    }
}
class Animal extends Abstract1{
    public void animal(){
        System.out.println("Hello, I am Rokib...");
    }
}
class Main{
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.animal();
        a1.sleep();
    }
}