public class app {

	public int square(int num) {
		int squared = num*num;
		
		return squared;
	}
	
	public int cube(int num) {
		int cubed = num*num*num;
		
		return cubed;
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(square(2));
	}
}