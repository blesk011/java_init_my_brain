package blesk011.lecture3;

public class AssignOperatorExample {
	public static void main(String[] args) {
		int result = 0;
		result += 10;
		
		System.out.println("result=" + result);
		
		result -= 5;
		System.out.println("result=" + result);
		
		result *= 3;
		System.out.println("result=" + result);
		
		result /= 5;
		System.out.println("result=" + result);
		
		result %= 3;
		System.out.println("result=" + result);
	}
}
