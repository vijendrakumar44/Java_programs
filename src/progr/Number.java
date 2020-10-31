package progr;

public class Number {
	static int no=1;
	static void num() {
		if(no<11 ) {
			System.out.println(no);
			no++;
			num();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
num();
	}

}
