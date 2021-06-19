package studyTool;

import java.util.Scanner;

public class StudyPage {
	public static void main(String[] args) {

		Scanner scanterm = new Scanner(System.in); // cria uma nova instância do objeto Scanner e utiliza uma entrada de
													// dados utilizando o System.in

		String termvar; // declaração de uma variável do tipo String (texto) - apenas criada em memória.
						// Nesse momento, o conteúdo dessa variável é null
		
		System.out.println("Enter a study term"); // saída de dados no console com uma mensagem
		termvar = scanterm.nextLine(); // é feita uma chamada de entrada de dados via teclado e a variável termvar vai
										// receber o que for digitado utilizando e armazenado na variável scanterm.

		Scanner scandef = new Scanner(System.in); // novamente é criada uma nova instancia da classe Scanner e passando
													// como parâmetro uma entrada de dados via System.in

		String termdef; // declaração da variável termdef
		System.out.println("Enter a definition"); // saída via console

		termdef = scandef.nextLine(); // solicitada entrada de dados via teclado que será armazenado na variável termdef
		System.out.println(termvar + ": " + termdef); // 

	} // fim do método main
} // fim da classe StudyPage
