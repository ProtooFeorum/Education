import java.util.Scanner;
   //Работа с функциями
public class Education{
	public static void main(String[] args) {
		int a = 5;
		sum( 4,5,2,a);
		mult(4,5,2,a);
		divide(4,5,2,a);
		display("Fiodor", 45);
	}
    static void sum(int ...nums){
		int result =0;
		for (int n: nums)
			result += n;
		System.out.println(result);
	}
	static void mult(int ...nums){
		int result =1;
		for (int n: nums)
			result *= n;
		System.out.println(result);
	}
	static void divide(int ...nums){
		double result =1;
		for (int n: nums)
			result /= n;
		System.out.println(result);
	}
	static void display(String name, int age){
		System.out.println(name);
		System.out.println(age);
	}
}

	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
      while(name.isBlank()) {
		  System.out.println("Write your name: ");
		  name = sc.nextLine();
		}
		System.out.println("Hello there "+name);
	}
}*/
 //ОКР здорового
/*public class Education{
	/*public static void main(String[] args) {
		   Person masha = new Person();
		   masha.person("Masha","Female", 36);
		   masha.diffAge(38);
		   masha.print();
		   SubPerson oleg = new SubPerson();
		   oleg.person2("Oleg","Male", 34);
		   oleg.second("Stulba");
		   oleg.printtwo();
		}
	}
	class Person{
		String name;
		String gender;
		int age;
		public void person(String name,String gender,int age){
			this.name=name;
			this.gender=gender;
			this.age=age;
			
		}
		public void diffAge(int age){
			this.age=age;
		}
		public void print(){
			System.out.println("Named "+name+" gender "+gender+" "+age+" old");
		}
	}
	class SubPerson extends Person{
		String secondName;
	   public void person2(String name,String gender,int age){
		  this.name=name;
			this.gender=gender;
			this.age=age; 
	   } 
	   public void second(String secondName){
		   this.secondName=secondName;
	   }
	   public void printtwo(){
			System.out.println("Named "+name+" "+secondName+" gender "+gender+" "+age+" old");
		}
	}
}*/
	//ОКР больного
/*public class Education {
	public static void main(String[] args) {
	   Person masha = new Person();
	   masha.person("Маша","Женский", 36);
	   masha.getAge(38);
	   masha.getSubname("Соловьёва");
	   masha.print();
	}
 }
 class Person{
		String name;
		String gender;
		String subname;
		int age; 
  void person(String name, String gender, int age){
	 this.name=name;
	 this.gender=gender;
	 this.age=age;
 }
 void getAge(int age){
	 this.age=age;
 } 
   void getSubname(String subname){
	  this.subname=subname;
   }
 
  
   void print(){
	 System.out.println("Зовут "+name+" "+subname);
	 System.out.println("Пол "+gender);
	 System.out.println(age+" лет"); 
   } 
 }*/
 
 //Двоичный поиск в массиве
/*import java.util.Scanner;
public class Education {
    public static void main(String[] args) {
		Scanner sс = new Scanner(System.in);
		System.out.print("Введите число: ");
		int num = sс.nextInt();
		int index = binaryScan(num);
		print(num, index);
	}

	public static int binaryScan(int scan){
		int[] mass = {5, 10, 15, 20, 25, 30, 35, 42, 51, 55, 60, 70, 80, 82, 90};

       int firstIndex = 0;
	   int lastIndex = mass.length - 1;

	   while(firstIndex <= lastIndex){

		   int middleIndex = (firstIndex + lastIndex) / 2;

		   if (mass[middleIndex] == scan){
			   return middleIndex;
		   }

		   else if (mass[middleIndex] < scan){
			   firstIndex = middleIndex + 1;
		   }

		   else if (mass[middleIndex] > scan){
			   lastIndex = middleIndex - 1;
		   }
	   }
	   return -1;
	}
	public static void print(int num, int index){
		if(index == -1){
			System.out.println("Числа "+ num + " в массиве нет. ");
		}
		else {
			System.out.println("Число "+ num + " есть в массиве и находится под индексом " + index);
		}
	}  
}/*
//Линейный поиск массива
   /* public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число: ");
		int num = sc.nextInt();
		linearScan(num);
	}

	public static void linearScan(int search) {
		int[] m = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int b = 0;
		for (int i = 0; i < m.length; i++) {
			if (search == m[b]) {
				System.out.println("Оно относится к массиву");
				break;
			} else {
				b++;
			}
			if (i == m.length - 1) {
				System.out.println("Оно не отсносится к массиву");
			}
		}
	}*/
