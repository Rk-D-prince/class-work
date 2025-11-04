import java.util.Scanner;

class Minimum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		
		for(int i=0; i<len; i++){
			System.out.println("Enter num: ");
			arr[i]=sc.nextInt();
		}
		int min=1000000;
		for(int i=0; i<len;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("Minimum number from the array is "+min);
	}
}