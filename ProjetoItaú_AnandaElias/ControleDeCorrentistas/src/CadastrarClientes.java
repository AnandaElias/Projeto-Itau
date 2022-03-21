import java.util.Scanner;

public class CadastrarClientes {

	public static void main(String[] args) { 
		
		String agencia,conta,nome, email, telefone,saldo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cadastro de clientes");
		
		System.out.println("Entre com a Agência (4 dígitos):");
		agencia=teclado.next();
		System.out.println(agencia);
		
		System.out.println("Entre com a Conta incluido um dígito verificador (DV):");
		conta=teclado.next();
		System.out.println(conta);

		
		System.out.println("Digite o seu nome completo:");
		nome=teclado.nextLine();
		System.out.println(nome);

		
		System.out.println("Digite o seu e-mail:");
		email=teclado.nextLine();
		System.out.println(email);

		
		System.out.println("Digite o seu número do telefone:");
		telefone=teclado.next();
		System.out.println(telefone);

		
		System.out.println("Digite o seu saldo em conta:");
		saldo=teclado.next();	
		System.out.println(saldo);

		
		ListarClientes executar=new ListarClientes();
		executar.recebeCadastrarClientes(agencia,conta,nome,email,telefone,saldo);
		
	}

}