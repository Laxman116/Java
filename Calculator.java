import java.util.Scanner;

public class Calculator {
	public int num1,num2;
	String op;
	public double result;
	
	int addition(int a,int b){
				return  a+b;
		}
	int subtraction(int a,int b){
		
		return a-b;
		}
	int multiplication(int a,int b){
		 
		return a*b;
		}

	
		float division(float a,float b){
		 
			return a/b;
		}
	
	    
	/*void display(int val){
		System.out.println();
	}*/
	
	public static void main(String [] S){
	try {
	
		Calculator calc = new Calculator();
		Scanner s1=new Scanner(System.in);
	
		System.out.println("Enter a number ");
		calc.num1 = s1.nextInt();
		
		System.out.println("Enter another number");
		calc.num2=s1.nextInt();
		
		
		System.out.println("Enter operator/(+,-,* or //)");
		calc.op=s1.next();
	
		
		if(calc.op.contentEquals("+")) {
			
			calc.result=calc.addition(calc.num1, calc.num2);
			System.out.println(calc.num1 +" "+calc.op+" "+calc.num2+" = "+calc.result);
			//System.out.println(calc.num1 +" "+calc.op+" "+calc.num2+" = "+calc.addition(calc.num1, calc.num2));
			
		}
			else if(calc.op.contentEquals("-")) {
				calc.result=calc.subtraction(calc.num1,calc.num2);
				System.out.println(calc.num1 +" "+calc.op+" "+calc.num2+" = "+calc.result);
			
			}
			else if(calc.op.contentEquals("*")) {
				calc.result=calc.multiplication(calc.num1,calc.num2);
				System.out.println(calc.num1 +" "+calc.op+" "+calc.num2+" = "+calc.result);
			}
			else if(calc.op.contentEquals("/")) {
				calc.result=calc.division(calc.num1,calc.num2);
				System.out.println(calc.num1 +" "+calc.op+" "+calc.num2+" = "+calc.result);
			}
			
			else {
				System.out.println("Not a valid operator");
				
			}
		s1.close();
			}
	catch(Exception e) {
				System.out.println("Exception Found : " +e.getMessage());
			}
		
	/** @author Honey author
	 * version 1.2
	 * 
	 */
		
	}
	
	
	
}
