package com.Question3;

import java.util.ArrayList;
import java.util.Collections;

public class Fruit {

	public static void main(String[] args) {
		ArrayList<String> FruitBasket1=new ArrayList<>(); //FruitBasket1
		FruitBasket1.add("Mango");
		FruitBasket1.add("Apple");
		FruitBasket1.add("Orange");
		System.out.println("This is FruitBasket1"+FruitBasket1);
		System.out.println("-------------------------------------------");
		ArrayList<String> FruitBasket2= new ArrayList<>(); //FruitBascket2
		FruitBasket2.add("WaterMelon");
		FruitBasket2.add("Grapes");
		FruitBasket2.add("Cherry");
		System.out.println("This is Fruitbasket2 "+FruitBasket2);
		System.out.println("-------------------------------------------");
		Collections.sort(FruitBasket1);
		System.out.println("after sorting in ascending order:"+FruitBasket1); //sorting the list 1st in ascending order
		System.out.println("-------------------------------------------");
		Collections.sort(FruitBasket2,Collections.reverseOrder());
		System.out.println("after sorting in descending order"+FruitBasket2); //sorting the list 2nd in descending order
		System.out.println("-------------------------------------------");
		FruitBasket1.addAll(FruitBasket2); //Adding FruitBucket1 and FruitBascket2
		System.out.println("after adding the elements from FruitBasket2 to FruitBasket1"+FruitBasket1);
		System.out.println("-------------------------------------------");
		System.out.println("Whether mango is in the FruitBucket1?"+FruitBasket1.contains("Mango"));
		System.out.println("-------------------------------------------");//checking fruit present or not
		FruitBasket1.clear();
		System.out.println("Whether FruitBucket1 is empty or not"+FruitBasket1.isEmpty()); //checking FruitBucket1 is empty or not
        System.out.println("before removing the element from the specific position"+FruitBasket2);
        System.out.println("-------------------------------------------");
		FruitBasket2.remove("Grapes"); //removing one fruit from FruitBucket1
		System.out.println("after removing the element from the specific position:"+FruitBasket2);
		

	}

}
