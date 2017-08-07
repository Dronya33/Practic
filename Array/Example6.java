/*Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку. 
Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.*/

import java.util.Random;

class Example6{
	public static void main(String[] args){
		
		int arrayTest [] = new int[4]; // Создание массива
		Random rand = new Random(); // Реализация рандома
	
		for(int i = 0; i < arrayTest.length; i++){
			arrayTest[i] = rand.nextInt(89)+10;
			System.out.print(arrayTest[i] + " ");
		}	
		
		String txt = new String();
	
			for(int i = 1; i < arrayTest.length-1; i++){
				if(i > 0){
					if(arrayTest[i-1] <= arrayTest[i]){
						txt = "Не является";
						//break;
					}
				}
				if (i == arrayTest.length-1)
					txt = "Является";
			}
			System.out.println(txt);
	} 
}