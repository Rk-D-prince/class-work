import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		double a = sc.nextInt();
		System.out.println("Enter num: ");
		double b = sc.nextInt();
		System.out.println("Enter symbol(+,-,/,*): ");
		char ch = sc.next().charAt(0);
		c.calc(a,b,ch);
	}
	public void calc(double a, double b, char ch){
		double d = 0;
		switch(ch)
		{
			case '+':
				d = a+b;
				break;
				
			case '-':
				d = a-b;
				break;
				
			case '/':
				d = a/b;
				break;
				
			case '*':
				d = a*b;
				break;
				
			default:
			System.out.println("Sorry");
		}
		System.out.println(d);
	
	}
}