// ������

import java.util.Random;

class Example1{
	public static void main(String[] args){
		calcSum(2,3);
		int rez = calcSumBack(2,5);
		System.out.println("�����, ������������ �� ������ � ����������: " + rez);
		arrayMet();
		System.out.print("\n");
		calcSum(1,1);
		int rez2 = calcSumBack(5,4);
		System.out.println("�����, ������������ �� ������ � ����������: " + rez2);
		arrayMet();
	}
	
	// ����� ������������
	static void calcSum(int element1, int element2){
		int sum = element1 + element2;
		System.out.println("�����, ������������ �� ������: " + sum );
	}
	
	// ����� ������������ ��������
	static int calcSumBack(int element3, int element4){
		int sumBack = element3 + element4;
		return sumBack;
	}
	
	// ����� ��������� � ����������� ���������� ������� ������
	static void arrayMet(){
		int arrayTest[] = new int[8];
		Random rand = new Random();
		System.out.print("������, ������������ �� ������: ");
		for(int i = 0; i < arrayTest.length; i++){
			arrayTest[i] = rand.nextInt(8);
			System.out.print(arrayTest[i] + " ");
		}
	}
}