/*�������� ������ �� 4 ��������� ����� ����� �� ������� [10;99], �������� ��� �� ����� � ������. 
���������� � ������� �� ����� ��������� � ���, �������� �� ������ ������ ������������ �������������������.*/

import java.util.Random;

class Example6{
	public static void main(String[] args){
		
		int arrayTest [] = new int[4]; // �������� �������
		Random rand = new Random(); // ���������� �������
	
		for(int i = 0; i < arrayTest.length; i++){
			arrayTest[i] = rand.nextInt(89)+10;
			System.out.print(arrayTest[i] + " ");
		}	
		
		String txt = new String();
	
			for(int i = 1; i < arrayTest.length-1; i++){
				if(i > 0){
					if(arrayTest[i-1] <= arrayTest[i]){
						txt = "�� ��������";
						//break;
					}
				}
				if (i == arrayTest.length-1)
					txt = "��������";
			}
			System.out.println(txt);
	} 
}