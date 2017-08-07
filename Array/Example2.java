/*Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, 
а затем этот же массив выведите на экран тоже в строку, 
но в обратном порядке (99 97 95 93 … 7 5 3 1).
*/

class Pr_2
{
	public static void main(String[] args)
	{
		int[] mass = new int[50]; // Создание массива
		int inx = 0; // Индекс
		
		for(int elt = 1; elt < 100; elt+=2)
		{
			mass[inx] = elt; // Заполнеине массива 
			inx++;
		}
		
		for(int elt = 0; elt <= 49; elt++)
		{
			System.out.print(mass[elt] + " ");
		}
		
		System.out.print("\n");
		
		for(int elt = 49; elt >= 0; elt--)
		{
			System.out.print(mass[elt] + " ");
		}
	}
}