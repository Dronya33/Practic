// Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.

import java.util.*; 

class Example4{
	public static void main(String[] args){
		
		// Реализация ввода строки знания, которое в будущем будет являться размером массива
		Scanner in = new Scanner(System.in); /* Создание объекта класса Scanner, 
		                                         который позволит вводить данные 
												 с клавиатуры(за это отвечает объект Systeam.in) */
												 
		System.out.println("Введите количество строк которые необходимо заполнить и вывести: ");
		
		String quantity = in.nextLine();      /* Считывание целой последовательности символов
										         полученное значение записывается в объект
										         класса String */
		Integer quantityStr = 0;
		// Обработчик исключений, в данном случае при вводе не правильного формата
		try{
			quantityStr = Integer.valueOf(quantity); /* Перевод в целочисленный формат. 
			                                            Именно в этом формате должен происходить ввод,
														т.е. здесь отслеживается ошибка. */
		} catch(NumberFormatException ex){ // Тут указывается тип исключения и обрабатывается исключение.
			System.out.println("Неверный формат!!!");
			System.exit(0); // Выход из программы
		}
		
		String[] arrayTest = new String[quantityStr]; // Создание массива размер которого соответствует значеню переменной quantityStr
		
		// Реализация ввода строк и запись их в массив
		for(int i = 0; i < quantityStr; i++){
			System.out.println("Введите строку: ");
			arrayTest[i] = in.nextLine(); // Присваивание элементу массива целой последовательности символов(строк)
		}
		
		System.out.println("\nПолученные строки: ");
		
		// Вывод полученных строк
		for(int i = 0; i < quantityStr; i++){
			System.out.println(arrayTest[i]);			
		}
		
		System.out.println();
		
		char char1; // Переменная в которую будут помещаться символы
		
		for(int i = 0; i < arrayTest.length; i++){
			int enumerator = 1; // Счетчик разных символов
			
			char[] arrayTest1 = new char[arrayTest[i].length()]; // Длина массива равна значениию длины первого элемента(строки) массива arrayTest
															     // Массив для символов
			System.out.print("Обрабатываемая строка: ");
			
			for(int k = 0; k < arrayTest[i].length(); k++){
				arrayTest1[k] = arrayTest[i].charAt(k);
				System.out.print(arrayTest1[k]);
			}
			
			for(int j = arrayTest[i].length()-1; j > 0; j--){	
			   // char1 = arrayTest[i].charAt(j); // Записывается текущий символ из текущей строки
				if(arrayTest1[j-1] != arrayTest1[j]){ // Сравнение текущего символа с символом, который уже есть во вспомогательном массиве
					//arrayTest1[j] = char1; // Если символ не встречался, то мы записываем его в массив
					enumerator++; // постфиксная инкрементация счетчика разных символов
				} 
				//System.out.print(arrayTest1[j]);
			}
			System.out.println();
			System.out.println("Количетво разных символов в строке под №" + i + " равно: " + enumerator);
			System.out.println();
		}
		/*if(){
			
		}*/
	}	
}