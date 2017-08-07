/*Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках. 
Посчитайте среднее арифметическое элементов каждого массива и сообщите,
 для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).*/

 import java.util.Random;
 
class Example5{
	public static void main(String[] args){
		int arrayTest1[] = new int[5]; // Сосздание массива №1
		int arrayTest2[] = new int[5]; // Сосздание массива №2
		Random rand = new Random(); // Реализация рандома
		int sum = 0;
		
		for(int i = 0; i < 5; i++){
			arrayTest1[i] = rand.nextInt(5); // Заполнение массива
			System.out.print(arrayTest1[i] + " "); // Вывод заполненного массива
			sum += arrayTest1[i]; // Суммирование всех эллементов массива
		}
		
		// Подсчет среднего арефметического
		int theArithmeticMean = sum/5; // Деление суммы всех элементов массива на длину массива
		System.out.println("Средее арифметическое: " + theArithmeticMean); // Вывод среднего арефметического
		//System.out.println("\n ");
		
		int sum2 = 0;
		
		for(int i = 0; i < 5; i++){
			arrayTest2[i] = rand.nextInt(5); //З аполнение массива
			System.out.print(arrayTest2[i] + " "); // Вывод заполненного массива
			sum2 += arrayTest2[i]; // Суммирование всех эллементов массива
		}
		
		int theArithmeticMean2 = sum2/5; // Деление суммы всех элементов массива на длину массива
		System.out.println("Средее арифметическое: " + theArithmeticMean2); // Вывод среднего арефметического
		
		// Сравнение значений средних арифметических каждого массива
		
		if(theArithmeticMean == theArithmeticMean2)
			System.out.println("Средее арифметическое первого массива равно среднему арифметическому второго массива.");
		else if(theArithmeticMean > theArithmeticMean2) 
			System.out.println("Средее арифметическое первого массива больше чем среднее арифметическое второго массива.");
		else System.out.println("Средее арифметическое второго массива больше чем среднее арифметическое первого массива.");
		
		
	}
}