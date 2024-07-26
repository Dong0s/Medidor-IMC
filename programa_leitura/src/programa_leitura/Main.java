package programa_leitura;
import java.util.Scanner;
public class Main {
public static void main (String[]args) {
	Scanner in = new Scanner(System.in);
	int idade = 0;
	double altura = 0,peso = 0, imc;
	String nome,gnr;
	
	
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
	peso = in.nextDouble ();
	in.nextLine();
	
	System.out.println("Aqui estão suas informações:");
	
	System.out.println("Nome:"+ nome );
	
	if(idade <= 17) {
		System.out.printf("%d Anos, Voce é menor de idade",idade);
		
	}else {
	System.out.printf("Idade:%d\n", idade );
	}
	
	System.out.printf("Sexo:%s\n",gnr);
	
	System.out.printf("Altura:%.2f\n",altura);
	
	System.out.printf("Peso:%.2f KG\n",peso );
	
	imc = (peso)/(altura*altura);
	if(imc <= 16.9) {
	System.out.printf("Voce esta com o Índice de Massa Corporal em:%.2f Muito abaixo do peso menor que 16,9\n",imc);
	}else if(imc <= 18.4){
		System.out.printf("Voce esta com o Índice de Massa Corporal em:%.2f Abaixo do peso entre 17 a 18,4\n",imc);
	}else if(imc <= 24.9) {
		System.out.printf("Voce esta com o Índice de Massa Corporal em:%.2f Peso Normal entre 18,5 a 24,9\n",imc);
	}else if(imc <= 29.9) {
		System.out.printf("Voce esta com o Índice de Massa Corporal em:%.2f Acima do Peso entre 25 a 29,9\n",imc);
	}else if(imc <= 34.9) {
		System.out.printf("Voce esta com o Índice de Massa Corporal em:%.2f Obesidade Grau I entre 30 a 34,9\n",imc);
	}else if(imc <= 40) {
		System.out.printf("Voce esta com o Índice de Massa Corporal em:%.2f Obesidade Grau II entre 35 a 40\n",imc);
	}else if(imc >= 40) {
		System.out.printf("Voce esta com o Índice de Massa Corporal em:%.2f Obesidade Grau III  acima de 40\n",imc);
	}
	
	in.close();
}
}
