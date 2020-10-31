package progr;

public class Fact {
static int fact=1;
	static int num(int no) {
		
		if(no>0) {
			fact=fact*no;
			no--;
			num(no);
		}
		
		return fact;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println(num(4));
	}

}
