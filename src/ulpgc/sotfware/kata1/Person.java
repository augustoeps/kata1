package ulpgc.sotfware.kata1;
import java.lang.String;
public class Person {

    private String name;
    private int age;

    public Person(String name, int age){

        this.name = name;
        this.age = age;

    }

    public String getName(){

        return this.name;
    }

    public int getAge(){

        return this.age;
    }

    public String setName(String name){
        this.name = name;
    }

    public int setName(int age){
        this.age = age;
    }

    public String toString(){

        return this.name + "" + this.age ;
    }
}
