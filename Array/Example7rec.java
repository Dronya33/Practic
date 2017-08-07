class Example7rec{
	public static void main(String[] args){
		int rez = recurs(15);
		System.out.print(rez + " ");
		
	}
	
	// Реализация последовательности чисел Фибоначчи через рекурсию
	static int recurs(int element1){
		if(element1 == 0) return 0;
		else if (element1 == 1)return 1;
		//else if (element1 == 2) return 1;
		else return recurs(element1 - 1) + recurs(element1 - 2);
	}
}