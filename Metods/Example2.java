// ��������

class Example2{
	public static void main(String[] args){
		int rez = recurs(1,-1);
		System.out.println("���������: " + rez);
	}
	
	// �������� ��������
	static int recurs(int element1, int element2){
		int sum = element1 + element2;
		if(sum < 5){
			sum = recurs(sum,1);
			System.out.println("��������� ��������, ������� �������� ���������� sum ��������� �� �������");	
		}
		return sum;
	}
}