package operators;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 10;
		int z = 20;
		
		System.out.println(x < y && x < z);  // && and  TRUE
		System.out.println(x > y && x > z);  // FALSE
		System.out.println(x > y && x < z);  // FAlSE
		
		System.out.println(x < y || x < z);  // || or  TRUE
		System.out.println(x < y || x > z);  // TRUE
		System.out.println(x != y || x < z); // != NOT EQUAL  TRUE
		
		x ++;
		y --;
		z +=5;
		System.out.println(x);  // 5---->6
		System.out.println(y);  // 10---->9
		System.out.println(z);  // 20---->25
		
	}

}
