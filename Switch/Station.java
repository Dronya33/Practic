/*Пользователю для расчета времени в пути надо вводить не номера станций, а буквы (A,B,C,D,E). 
Необходимо предусмотреть ввод пользователем и маленьких, и больших букв (избавиться от регистрозависимости). 
То есть если введено или D, или d — должен сработать один и тот же case.*/

import java.util.Scanner;

class Station{
	
	// Реализация метода ввода
	static String inPut(){
		Scanner in = new Scanner(System.in);
		System.out.println("Введите имя станции: ");
		String element = in.nextLine();
		return element;
	}
	
	static String metSwitch(){
		String element = inPut();
		
		switch(element){
			case "a" : case "A" : System.out.println("До прибытия осталось 5 минут"); System.exit(0); break;
			case "b" : case "B" : System.out.println("До прибытия осталось 35 минут"); System.exit(0); break;
			case "c" : case "C" : System.out.println("До прибытия осталось 65 минут"); System.exit(0); break;
			case "d" : case "D" : System.out.println("До прибытия осталось 95 минут"); System.exit(0); break;
			case "e" : case "E" : System.out.println("До прибытия осталось 125 минут"); System.exit(0); break;
			default : System.out.println("Такой станции не существует"); System.exit(0); break;
		}
		return metSwitch();
	}
	
	public static void main(String[] args){
		String element = metSwitch();
		System.out.println(element);
		
	}
}