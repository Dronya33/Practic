import java.util.Random;
class Array2{
	public static void main(String[] args){
		
		int [] arrayTest = new int[5];
		int [][] arrayTestDuo = new int [5][5];
		Random rand = new Random();
		
		for(int i = 0; i < arrayTest.length; i++){
			arrayTest[i] = rand.nextInt(10);
			System.out.print(arrayTest[i] + " ");
		}
		
	}
}