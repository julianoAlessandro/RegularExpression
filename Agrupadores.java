

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Agrupadores {
	public static void main(String[] args) {
		boolean email = "julianoalessandro23@gmail.com.br".matches("\\w+@\\D{5}\\.\\D{3}.\\D{2}");
		System.out.println(email);
		boolean teste = "x".matches("[a-z]");// em um intervalo de a até z minusculo existe x
		System.out.println(teste);
		boolean teste2 = "x".matches("[a-z]|[A-Z]");// em um intervalo de a até z ,sendo minusculo ou maisculo existe x
		System.out.println(teste2);
		boolean nome = "juliano".matches("[Jj]uliano");
		System.out.println(nome);
		//verificar uma determinada condição 
		boolean palavra = "olho".matches("[^abc]lho");
		System.out.println(palavra);
		
		String doce = "Qual é o Doce mais DoCe do que Doce ";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);//mostrar todas as ocorrencias de Doce
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		/*================== TRABALHANDO COM SUBSTITUIÇÃO =====================*/
		
		String r = doce.replace("(?i)doce", "DOCINHO");
		System.out.println(r);
		
		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeio]","XX");
		System.out.println(r);
		
		r = "Tabular este texto ".replaceAll("\\s", "\t");
		System.out.println(r);
		
		String url = "www.xti.com.br/clientes-2011.html";
		String re = "(www.xti.com.br/)(\\w{2,})-(\\d{4}).html";
		
		r = url.replaceAll(re,"http://$1\\/$3/$2.jsp");
		System.out.println(r);
	}

}
