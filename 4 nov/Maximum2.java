import java.util.Scanner;
class Maximum2{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num: ");
	int a = sc.nextInt();
	System.out.println("Enter num: ");
	int b = sc.nextInt();
	System.out.println("Enter num: ");
	int c = sc.nextInt();
	int d = 0;
	
	if((a<b)&&(c<b)){
		System.out.print("Maximum number is "+b);
	}
	else if((a>b)&&(c<a)){
		System.out.print("Maximum number is "+a);
	}
	else if((c>a)&&(c>b)){
		System.out.print("Maximum number is "+c);
	}

	}
}