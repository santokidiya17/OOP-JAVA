import java.util.Scanner;

abstract class Vegetable{
	String color;
	String name;
    abstract public String toString();
}
class Potato extends Vegetable{

	Potato(String color, String name){
         super.color = color;
         super.name = name;
    }
    public String toString(){
         	return "Vegetable name"+super.name+"color"+super.color;
    }
} 
class Brinjal extends Vegetable{

	Brinjal(String color, String name){
         super.color = color;
         super.name = name;
         
	}
	public String toString(){
         	return "Vegetable name"+super.name+"color"+super.color;
    }
}
class Tomato extends Vegetable{

	Tomato(String color, String name){
         super.color = color;
         super.name = name;
    }
    public String toString(){
         	return "Vegetable name"+super.name+"color"+super.color;
    }
}
public class Lab7_1{
	public static void main(String[] args) {
		Potato p1 = new Potato("brown","potato");
		System.out.println(p1.toString());

		Brinjal b1 = new Brinjal("purple","brinjal");
		System.out.println(b1.toString());

		Tomato t1 = new Tomato("red","tomato");
		System.out.println(t1.toString());
	}
}