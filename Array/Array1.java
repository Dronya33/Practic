import java.util.Random;

class Array1{
	public static void main(String[] args){
		
		int arrayTest [] = new int[50]; // �������� ������� �� 50 ���������
		Random rand = new Random(); // ���������� �������
		
		System.out.println("����������� ��� ������� �� 50-�� ���������: ");
		
		for(int i = 0; i < arrayTest.length; i++)
		{
			arrayTest[i] = rand.nextInt(100); // ���������� ������� ����������� �� 0 �� 100
			System.out.print(arrayTest[i] + " ");
		}
		
		System.out.println("\n");
		System.out.println("��������������� ������ �� 50-�� ���������: ");
		
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
		
		// ������ ������ �������� ����� � 50 �� 50 �� 100
		for(int i = arrayTest.length-1; i > 0; i--){
			if(arrayTest[i] > 50){
				box1 = arrayTest[i]; 
			}	
		}
		// ������ ������ �������� ����� � 50 �� 0 �� 50
		for(int i = 0; i < arrayTest.length; i++){
			if(arrayTest[i] < 50){
					box2 = arrayTest[i]; 
				}
		}
		
		
		if(box1 > box2){ 
			box3 = (((box1 - 50) > (50 - box2))) ? box2:box1;
			System.out.println("�������, �������� �������� ����� ����� � 50: " + box3);
		}	
		
	}
}