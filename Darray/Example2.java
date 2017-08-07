import java.util.Random;

class Example2{
	public static void main(String[] args){
		int [][] arrayTest = new int [3][3]; // Создание двумерного массива
		
		Random rand = new Random();
		
		for(int i = 0; i < arrayTest.length; i++){ //
			for(int j = 0; j < arrayTest[i].length; j++){ //
				arrayTest[i][j] = rand.nextInt(5)+1;
				System.out.print(arrayTest[i][j]);
			}
			System.out.println();
		}
		System.out.println(arrayTest[1][2]);
	}
}