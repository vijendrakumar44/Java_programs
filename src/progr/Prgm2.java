package progr;

public class Prgm2 {

	static void search(String s1) {
		String[] arr= {"dosa","vada","idli"};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==s1) {
				System.out.println(s1+" is present");
				break;
			}else {
				System.out.println(s1+"  is not present");
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
search("ii");
	}

}
