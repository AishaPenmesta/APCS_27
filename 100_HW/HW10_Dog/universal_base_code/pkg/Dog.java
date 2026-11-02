package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
		private String name;
		private int age;
		private String breed;

	public Dog(){
		name = "Clifford";
		age =3;
		breed = "big red dog";
	}
	public Dog(String dogName){
		name = dogName;
		age =1;
		breed ="dog dog";
	}
	public Dog(String dogName,String dogBreed){
name = dogName;
age=1;
breed =dogBreed;
	}
	public Dog(String dogName, int dogAge){
name = dogName;
age =dogAge;
breed ="dog dog";

	}

	public void setName(String dogName){
name = dogName;
	}
	public void setAge(int dogAge){
age = dogAge;
	}
	public void setBreed(String dogBreed){
		breed = dogBreed;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}

	public boolean isSleeping(){
		int sleepNum = (int)(Math.random()*2);
		if(sleepNum==0){
			return true;
		}
		else if(sleepNum==1){
			return false;
		}
			return false;
	
	}	
	public void bark(){
		System.out.println(name+ " barks!");
	}
}

