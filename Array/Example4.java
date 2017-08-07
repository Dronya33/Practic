/* Создайте массив из 8 случайных целых чисел из отрезка [1;10]. 
Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль. 
Снова выведете массив на экран на отдельной строке.*/

import java.util.Random;

class Example4{
	public static void main(String[] args){
		
		int arrayTest[] = new int [8]; // Создание массива
		Random rand = new Random(); // Реализация рандома
		
		//Заполнение цикла случайными числами
		for(int i = 0; i < arrayTest.length; i++){
			arrayTest[i] = rand.nextInt(10)+1; // Заполнение массива
			System.out.print(arrayTest[i] + " ");
		}
		
		System.out.println(" ");
		
		for(int i = 0; i < arrayTest.length; i++){
			if (i % 2 != 0){
				arrayTest[i] = 0;
			}
			System.out.print(arrayTest[i] + " ");
		}
	}
}