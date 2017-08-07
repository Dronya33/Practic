class MyClass{
 int number;
 char symbol;
 
 void set(int n, char s){
	 number = n;
	 symbol = s;
 }
 
 String getInfo(){
	 String text = "Число: " + number + "\n";
	 text += "Символ: " + symbol;
	 return text;
 }
}

class UsingObjectDemo{
 public static void main(String[] args){
  MyClass objA = new MyClass();
  MyClass objB = new MyClass();
  objA.set(100,'A');
  objB.set(200,'B');
  
 objA.getInfo();
 objB.getInfo();
  
  System.out.print(objA.getInfo() +"\n"+ objB.getInfo());
 } 
}