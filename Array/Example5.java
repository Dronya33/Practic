/*�������� 2 ������� �� 5 ��������� ����� ����� �� ������� [0;5] ������, �������� ������� �� ����� � ���� ��������� �������. 
���������� ������� �������������� ��������� ������� ������� � ��������,
 ��� ������ �� �������� ��� �������� ��������� ������ (���� ��������, ��� �� ������� �������������� �����).*/

 import java.util.Random;
 
class Example5{
	public static void main(String[] args){
		int arrayTest1[] = new int[5]; // ��������� ������� �1
		int arrayTest2[] = new int[5]; // ��������� ������� �2
		Random rand = new Random(); // ���������� �������
		int sum = 0;
		
		for(int i = 0; i < 5; i++){
			arrayTest1[i] = rand.nextInt(5); // ���������� �������
			System.out.print(arrayTest1[i] + " "); // ����� ������������ �������
			sum += arrayTest1[i]; // ������������ ���� ���������� �������
		}
		
		// ������� �������� ���������������
		int theArithmeticMean = sum/5; // ������� ����� ���� ��������� ������� �� ����� �������
		System.out.println("������ ��������������: " + theArithmeticMean); // ����� �������� ���������������
		//System.out.println("\n ");
		
		int sum2 = 0;
		
		for(int i = 0; i < 5; i++){
			arrayTest2[i] = rand.nextInt(5); //� ��������� �������
			System.out.print(arrayTest2[i] + " "); // ����� ������������ �������
			sum2 += arrayTest2[i]; // ������������ ���� ���������� �������
		}
		
		int theArithmeticMean2 = sum2/5; // ������� ����� ���� ��������� ������� �� ����� �������
		System.out.println("������ ��������������: " + theArithmeticMean2); // ����� �������� ���������������
		
		// ��������� �������� ������� �������������� ������� �������
		
		if(theArithmeticMean == theArithmeticMean2)
			System.out.println("������ �������������� ������� ������� ����� �������� ��������������� ������� �������.");
		else if(theArithmeticMean > theArithmeticMean2) 
			System.out.println("������ �������������� ������� ������� ������ ��� ������� �������������� ������� �������.");
		else System.out.println("������ �������������� ������� ������� ������ ��� ������� �������������� ������� �������.");
		
		
	}
}