package Akash;

public class Encapsulation1 {
    private String name;

    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsulation1 e1 = new Encapsulation1();
        e1.setName("Rokibul Hasan Rokib");
        System.out.println(e1.getName());
    }
}
