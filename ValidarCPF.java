

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
	System.out.println("Informe seu email");
	String email =leia.nextLine();
	
	
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
	boolean validaSenha = senha.matches("");
	if(validaSenha == true) {
		System.out.println("Dados da senha validado");
	}
	else {
		System.out.println("Dados invalido");
	}
	boolean validaEmail = email.matches("\\w+@\\D{5}\\.\\D{3}.\\D{2}");

	if(validaEmail == true) {
		System.out.println("email validado com sucesso");
		
	}
	else {
		System.out.println("Email invalido");
	}
	if(idade > 18) {
		System.out.println("Sistema liberado");
	}
	else {
		System.out.println("Sistema invalido para uso");
	}
	
	}

	


}
