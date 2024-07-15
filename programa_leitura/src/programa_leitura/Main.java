package programa_leitura;
import java.util.Scanner;
public class Main {
public static void main (String[]args) {
	Scanner in = new Scanner(System.in);
	int idade = 0;
	double altura = 0,peso = 0, imc;
	String nome,cidade,estado,pais,gnr;
	
	
	System.out.println("Digite o seu nome:");
	nome = in.nextLine();
	
	System.out.println("Digite sua idade: ");
	idade = in.nextInt();
	in.nextLine();
	
	System.out.println("(Masculino, Feminino) Digite seu gênero:");
	gnr = in.nextLine();
	
	System.out.println("Digite sua altura:");
	altura = in.nextDouble();
	in.nextLine();
	
	System.out.println("Digite seu peso: ");
	peso = in.nextDouble();
	in.nextLine();
	
	System.out.println("Digite sua cidade: ");
	cidade = in.nextLine();
	
	System.out.println("Digite seu estado: ");
	estado = in.nextLine();
	
	System.out.println("Digite seu pais ");
	pais = in.nextLine();
	
	System.out.println("Aqui estão suas informações:");
	
	System.out.println("Nome:"+ nome );
	
	if(idade <= 17) {
		System.out.println(idade +" Voce é menor de idade");
		
	}else {
	System.out.println("Idade:"+ idade );
	}
	
	System.out.println("Sexo:"+ gnr);
	
	System.out.println("Altura:"+altura);
	
	System.out.println("Peso:"+ peso +"KG" );
	
	imc = (peso)/((altura*altura));
	if(imc <= 16.9) {
	System.out.println("Voce esta com o Índice de Massa Corporal em:"+imc+" Muito abaixo do peso menor que 16,9");
	}else if(imc <= 18.4){
		System.out.println("Voce esta com o Índice de Massa Corporal em:"+imc+" Abaixo do peso entre 17 a 18,4");
	}else if(imc <= 24.9) {
		System.out.println("Voce esta com o Índice de Massa Corporal em:"+imc+" Peso Normal entre 18,5 a 24,9");
	}else if(imc <= 29.9) {
		System.out.println("Voce esta com o Índice de Massa Corporal em:"+imc+" Acima do Peso entre 25 a 29,9");
	}else if(imc <= 34.9) {
		System.out.println("Voce esta com o Índice de Massa Corporal em:"+imc+" Obesidade Grau I entre 30 a 34,9");
	}else if(imc <= 40) {
		System.out.println("Voce esta com o Índice de Massa Corporal em:"+imc+" Obesidade Grau II entre 35 a 40");
	}else if(imc >= 40) {
		System.out.println("Voce esta com o Índice de Massa Corporal em:"+imc+" Obesidade Grau III  acima de 40");
	}
	System.out.println("Cidade:"+ cidade );
	
	System.out.println("Estado:"+ estado );
	
	System.out.println("Páis:"+ pais );
	
}
}
