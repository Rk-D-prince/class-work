import java.util.Scanner;

class Maximum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		
		for(int i=0; i<len; i++){
			System.out.println("Enter num: ");
			arr[i]=sc.nextInt();
		}
		int max = 0;
		for(int i=0; i<len;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("Maximum number from the array is "+max);
	}
}