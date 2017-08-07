/*Составить расписание на неделю. 
Пользователь вводит порядковый номер дня недели и у него на экране отображается, 
то, что запланировано на этот день.*/

import java.util.Scanner;

class Plan{
	
	// Реализация метода ввода с клавиатуры
	static int inPut(){
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число: ");
		String element = in.nextLine();
		Integer element1 = 0;
		try{
			element1 = Integer.valueOf(element);
		} catch(NumberFormatException ex){
			System.out.print("Не верный формат!");
			System.exit(0);
		}
		return element1;
	}
	
	// Реализация метода switch
	static int metSwitch(){
		int element = inPut();
		
		switch(element){
			case 1 : System.out.println("Сходить к врачу"); System.exit(0); break; 
			case 2 : System.out.println("Сходить в кино"); System.exit(0); break; 
			case 3 : System.out.println("Сходить в зоопарк"); System.exit(0); break; 
			case 4 : System.out.println("Сходить в магазин"); System.exit(0); break; 
			case 5 : System.out.println("Сходить в гости"); System.exit(0); break; 
			case 6 : System.out.println("Посмотреть сериал"); System.exit(0); break; 
			case 7 : System.out.println("Искать новый сериал"); System.exit(0); break; 
			default : System.out.println("Вы ввели неправильное число"); System.exit(0);
		}
		return metSwitch();
	}
	
	public static void main(String[] args){
		int element = metSwitch();
		System.out.println(element);
	}
}