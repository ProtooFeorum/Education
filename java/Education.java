public class Education {
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
 }
 
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
