

import java.util.Scanner;

public class ValidarCPF {

	public static void main(String[] args) {
		System.out.println("========Validando informações do usuario================");
		Scanner leia = new Scanner(System.in);
	System.out.println("Informe sua data de nascimento:");
	String data = leia.nextLine();
	System.out.println("Informe seu CPF:");
	String cpf = leia.nextLine();
	System.out.println("Informe seu nome:");
	String nome = leia.nextLine();
	System.out.println("Informe sua senha:");
	String senha = leia.nextLine();
	System.out.println("Informe sua idade:");
	int idade = Integer.parseInt(leia.nextLine());
	
	
	//======================VALIDAÇÃO DE DADOS================================\\
	boolean  validar = cpf.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}");
	System.out.println(validar);
	if(validar == true) {
		System.out.println("cpf validado com sucesso!");
	}
	else {
		System.out.println("cpf invalido!");
	}
	
	boolean validaData = data.matches("\\d{2}/\\d{2}/\\d{4}");
	
	if(validaData == true) {
		System.out.println("Data validada com sucesso!");
	}
	else {
		System.out.println("Data invalida");
	}

	boolean validaNome = nome.matches("\\d{(?i)3,}");
	if(validaNome == true) {
		System.out.println("Nome valido");
	}
	else {
		System.out.println("nome invalido");
	}
	boolean validaSenha = senha.matches("\\w{4,12}");
	

	}

	


}
