package progr;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,20,50,15,90,45};
		//int temp=0;
		int n=arr.length;
		for(int i=1;i<n-1;i++) {
			
			if(arr[i-1]>arr[i]) {
				int temp=arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;
			}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
	}

}
