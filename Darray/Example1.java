class Example1{
	public static void main(String[] args){
		int rows = 9, cols = 9; // Размер массива
		int [][] table = new int[rows][cols]; // Создание двумерного массива
		String txt = "\t|";
		
		for(int i = 0; i <= cols; i++){
			txt+=i+"\t";
		}
		txt+="\n";
		for(int i = 1; i <= 10+8*cols; i++){
			txt += "-";
		}
		
		// Заполнение массива
		for(int i = 0; i < table.length; i++){
			txt+="\n"+(i+1)+"\t|\t"; // Дополнение текстового значения
			
			for(int j = 0; j<table[i].length; j++){
				table[i][j] = (i+1) * (j + 1); // Вычисление значения элемента массива
				txt += table[i][j] + "\t";
				
			}
		}
		System.out.println("Таблица умножения");
		System.out.println(txt);
	}
}