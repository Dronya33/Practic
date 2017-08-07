import java.util.Random;

class Bubble{
	public static void main(String[] args){
		
		int arrayTest[] = new int [5]; // Создание массива
		Random rand = new Random(); // Реализция рандома
	
		// Цикал заполнения массива
		for(int i= 0; i < arrayTest.length; i++){
			arrayTest[i] = rand.nextInt(50)+1; 
			System.out.print(arrayTest[i] + " ");
		}
		
		System.out.println("");
		
		// Реализация метода пузырьковой сортировки
		for(int i = arrayTest.length-1; i > 0; i--){
			for(int j = 0; j < i; j++){	
				
				if(arrayTest[j] > arrayTest[j+1]){
					int box4 = arrayTest[j];
					arrayTest[j] = arrayTest[j+1];
					arrayTest[j+1] = box4;
					
				} 
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < arrayTest.length; i++)
		{
			System.out.print(arrayTest[i] + " ");
		}
	}
}