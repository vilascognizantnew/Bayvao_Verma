
public class Question13 {

	int myVariable;
	   static int data = 30;
	   
	   public static void main(String args[]){
	      int a = 100;
	      Question13 obj = new Question13();
	      
	      System.out.println("Value of instance variable myVariable: "+obj.myVariable);
	      System.out.println("Value of static variable data: "+Question13.data);
	      System.out.println("Value of local variable a: "+a);
	   }
}
