

public class RegularExpression {
	public static void main(String[] args) {
		 boolean b = "java".matches("java");
		 //A função matches verifca se o valor passado é igual ao valor comparado
		 System.out.println(b);
		 
		//modificadores 
		 
			
	 boolean T = "Java".matches("(?i)java");//ignora letras maisuculas e minusculas
	 
	  System.out.println(T);
	  boolean C = "j".matches(".");
	  System.out.println(C);
	  //procura qualquer carctere
	  
	  boolean x = "25".matches("\\d{2}");
	  System.out.println(x);
	  // procurar um numero num intervalo de 0 até 9
	  
	  boolean valor = "t".matches("\\w");//procura por letras e numeros
	  System.out.println(valor);
	  
	  boolean num = "#".matches("\\W");//procura por qualquer  coisa diferente de numero e letra
	  System.out.println(num);
	  
	}


	
	 
}
