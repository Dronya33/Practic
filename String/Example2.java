// Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.

import java.util.Scanner;

class Example2{
	public static void main(String[] args){
		
		// Реализация ввода через клавиатуру
		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество строк, которое необходим заполнить и ввести: ");
		String quntity = in.nextLine();
		Integer quntityStr = 0;
		// Проверка на верность вводимого формата
		try{
			quntityStr = Integer.valueOf(quntity); // Преобразование из типа String в Integer
		} catch(NumberFormatException ex){
			System.out.println("Неверный формат!!!");
			System.exit(0);
		}
		
		String[] arrayTest = new String[quntityStr];
		
		// Реализация ввода строк и запись их в массив
		for(int i = 0; i < quntityStr; i++){
			System.out.println("Введите строку: ");
			arrayTest[i] = in.nextLine();
		}
		
		System.out.println("\nПолучившиеся строки: ");
		
		// Вывод полученых строк
		for(int i = 0; i < quntityStr; i++){
			System.out.println(arrayTest[i] + " с индексом " + i + " и с длиной " + arrayTest[i].length() + " символов");
		}
		
		int line1 = 0; /* Переменная, которая принимает значение 
					      длины текущего элемента массива. */
		int line2 = 0; /* Переменная, которая принимает значение
						  длины слудующего элемента массива. */
		
		// Сортировка массива из строк методом пузырька
		for(int i = quntityStr-1; i > 0; i--){
			for(int j = 0; j < i; j++){
				line1 = arrayTest[j].length();
				line2 = arrayTest[j+1].length();

				//String str1 = arrayTest[j];
				//String str2 = arrayTest[j+1];
				String box = arrayTest[j];
				
				if(line1 > line2){   
					arrayTest[j] = arrayTest[j+1];
					arrayTest[j+1] = box;
				}
			}
		}
		
		System.out.println();
		System.out.println("Получившейся массив: ");
		
		for(int i = 0; i < quntityStr; i++){
			System.out.print(arrayTest[i] + " ");
		}
		
		System.out.println();
		System.out.println("Получившейся массив в обратном порядке: ");
		
		for(int i = quntityStr-1; i >= 0; i--){
			System.out.print(arrayTest[i] + " ");
		}
	}
}