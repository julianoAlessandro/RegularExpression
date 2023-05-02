
public class Quantificadores {

	public static void main(String[] args) {
	//=========================QUANTIFICADORES====================================//
		boolean letra = "abc".matches("\\D{3}");
		//Procura por qualquer coisa que nao seja numero e  tenha extamente 3 caracteres
		System.out.println(letra);
		//=========================Quantificadores numeros=====================================//
		boolean num = "123".matches("\\d{3}");//Procura por exatamente 3 caracteres
		System.out.println(num);
		boolean num1 = "13333333".matches("\\d{3,}");//Procura por pelo menos 3 caracteres, ou seja começa a ser verdadeiro
		// a partir de 3 em diante
		System.out.println(num1);
		boolean num2 = "34567".matches("\\d{3,5}");
		//Procura por caracteres que estejam num intervalo pre-determinado de valores
		System.out.println(num2);
		boolean num3 = "%".matches(".?");// 0 ou 1 vez, de letra,numero,caractere especial;
		System.out.println(num3);
		boolean num4 = "%*67t".matches(".*");// 0 ou + vez, de letra,numero,caractere especial;
		System.out.println(num4);
		boolean num5 = "567&*99".matches(".+");// 1 ou + vez, de letra,numero,caractere especial;
		System.out.println(num5);

	}

}
