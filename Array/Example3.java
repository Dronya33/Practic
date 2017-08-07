/*Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. 
Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.*/

import java.util.Random;

class Example1
{
	public static void main(String[] args)
	{	
		int[] arrayTest = new int[15]; // Создание массива
		
		Random rand = new Random();
			
		for (int i = 0; i < 15; i++){
			arrayTest[i]  = rand.nextInt(9);
			System.out.print(arrayTest[i] + " ");
		}
		
		int quantity = 0;
		
		for(int i = 0; i < 15; i++ ){
			if(arrayTest[i] % 2 == 0 && arrayTest[i] != 0){
				quantity++;
			}
		}
		System.out.println("\n Количество четных элементов массива " + quantity);
	}
}