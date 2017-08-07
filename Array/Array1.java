import java.util.Random;

class Array1{
	public static void main(String[] args){
		
		int arrayTest [] = new int[50]; // Создание массива из 50 элементов
		Random rand = new Random(); // Реализация рандома
		
		System.out.println("Изначальный вид массива из 50-ти элементов: ");
		
		for(int i = 0; i < arrayTest.length; i++)
		{
			arrayTest[i] = rand.nextInt(100); // Заполнение массива эллементами от 0 до 100
			System.out.print(arrayTest[i] + " ");
		}
		
		System.out.println("\n");
		System.out.println("Ћтсартированный массив из 50-ти элементов: ");
		
		int box1 = 0;
		int box2 = 0;
		int box3 = 0;
		//boolean flag = true;
		
		for(int i = arrayTest.length-1; i > 0; i--){
			for(int j  = 0; j < i; j++){
				
				if(arrayTest[j] > arrayTest[j+1]){
					int box = arrayTest[j];
					arrayTest[j] = arrayTest[j+1];
					arrayTest[j+1] = box;
				}
			}
		}
		
		for(int i = 0; i < arrayTest.length; i++){
			System.out.print(arrayTest[i] + " ");
		}
		
		System.out.println("\n");
		
		// запись самого близкого числа к 50 от 50 до 100
		for(int i = arrayTest.length-1; i > 0; i--){
			if(arrayTest[i] > 50){
				box1 = arrayTest[i]; 
			}	
		}
		// запись самого близкого числа к 50 от 0 до 50
		for(int i = 0; i < arrayTest.length; i++){
			if(arrayTest[i] < 50){
					box2 = arrayTest[i]; 
				}
		}
		
		
		if(box1 > box2){ 
			box3 = (((box1 - 50) > (50 - box2))) ? box2:box1;
			System.out.println("ќлемент, значение которого ближе всего к 50: " + box3);
		}	
		
	}
}