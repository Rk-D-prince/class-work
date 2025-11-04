import java.util.Scanner;
class Middle2{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num: ");
	int a = sc.nextInt();
	System.out.println("Enter num: ");
	int b = sc.nextInt();
	System.out.println("Enter num: ");
	int c = sc.nextInt();
	int d = 0;
	
	if((a<b)&&(c>b)||(c<b)&&(a>b)){
		System.out.print("Middle number is "+b);
	}
	else if((b<a)&&(a<c)||(c<a)&&(a<b)){
		System.out.print("Middle number is "+a);
	}
	else if((c>a)&&(c<b)||(c>b)&&(c<a)){
		System.out.print("Middle number is "+c);
	}

	}
}