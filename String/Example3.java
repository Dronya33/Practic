// Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.

import java.util.*;

class Example3{
	public static void main(String[] args){
	
		//Реализация ввода с клавиатуры
		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество строк которые необходимо заполнить и вывести: ");
		String quntity = in.nextLine();
		Integer quntityStr = 0;
		try{
			quntityStr = Integer.valueOf(quntity);
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
		
		// Вывод полученных строк
		for(int i = 0; i < quntityStr; i++){
			System.out.println(arrayTest[i] + " ");
		}
		
		int temp = 0;
		
		// Cуммирование длин строк, для того чтоб в будущем вычислить среднюю строку
		for(int i = 0; i < quntityStr; i++){
			temp += arrayTest[i].length();
		}
		
		temp /= quntityStr; // Вычисление длины средней строки
		String str1 = " ";  // Переменная в которую будут записываться средняя строка
		
		// Запись в переменную среднюю строку
		for(int i = 0; i < quntityStr; i++){
			if(arrayTest[i].length() == temp)
			str1 = arrayTest[i];	
		}	
		
		System.out.println("\nДлина средней строки: " + temp + " символа(ов)" + " эта строка: " + str1);
		System.out.println("\nСтроки, которые меньше средней строки: ");
							  
		// Вывод строк меньших чем средняя					  
		for(int i = 0; i < quntityStr; i++){
			if(arrayTest[i].length() < temp)
				System.out.println(arrayTest[i] + " имеет длину: " + arrayTest[i].length() + " символа(ов).");
		}
		
		System.out.println("\nСтроки, которые больше стредней строки: ");
		
		// Вывод строк больших чем среняя
		for(int i = 0; i < quntityStr; i++){
			if(arrayTest[i].length() > temp)
				System.out.println(arrayTest[i] + " имеет длину: " + arrayTest[i].length() + " сивола(ов).");
		}
	}
}