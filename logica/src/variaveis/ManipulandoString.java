package variaveis;

public class ManipulandoString {

	public static void main(String[] args) {
		String email = "xPtO@gaMa.com";
		System.out.println("Original: " + email);
		System.out.println("Maiusculas: " + email.toUpperCase());
		System.out.println("Minusculas: " + email.toLowerCase());
		System.out.println("Qtde caracteres " + email.length());
		System.out.println("Tem @? " + email.contains("@"));
		System.out.println("@ na posição:  " + email.indexOf("@"));
		System.out.println("Parte da string: " + email.substring(2, 4));
		System.out.println("Parte da string: " + email.substring(0, email.length()/2));
		System.out.println("Parte da string: " + email.substring(0, email.indexOf("@")));
		System.out.println("Parte da string: " + email.substring(email.indexOf("@") + 1, email.length()));
	}

}
