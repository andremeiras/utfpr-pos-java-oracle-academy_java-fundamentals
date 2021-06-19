package studyTool;

public class Counting {
	
	public static int counter = 5;
	
	public static void main(String[] args) {
		System.out.println("At the start of this program, counter is " + counter);
		count();
		System.out.println("At the end of this program, counter is " + counter);
	} // fim do método main
	
	public static void count() {
		int counter = 10;
		System.out.println("At the end of this method, counter is " + counter);
	} // fim do método count
}// fim da classe Counting
