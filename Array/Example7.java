/*�������� ������ �� 20-�� ������ ����� ��������� � �������� ��� �� �����. 
������ � ������ ����� ������������������ ����� ��������, � ������ ��������� � ����� ���� ����������.*/

class Example7{
	public static void main(String[] args){
		
		int arrayTest[] = new int[20];
		
		int a = 1, b = 1;
		System.out.print(a + " " + b + " ");
		
		int fib = 2;
		
		for(int i = 2; i < arrayTest.length; i++){
			fib = a + b;
			a = b; 
			b = fib;
			System.out.print(fib + " ");
		}
	}
}