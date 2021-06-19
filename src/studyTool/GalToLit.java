package studyTool;

import java.util.Scanner;

public class GalToLit {
	
	public static void main(String[] args) {
		
		double galao = 3.785;
		double qtdeGaloes;
		double totalConversao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Galões: ");
		qtdeGaloes = sc.nextDouble();
		
		totalConversao = qtdeGaloes * galao;
		
		System.out.print("TOTAL: " + totalConversao);
	
	}
}
	