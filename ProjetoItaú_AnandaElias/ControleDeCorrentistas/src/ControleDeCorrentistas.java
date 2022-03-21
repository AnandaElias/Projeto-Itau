import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Scanner;

public class ControleDeCorrentistas {

	public static void main(String[] args) throws IOException {
		
/*				int opcao;
				do {
				
				System.out.println("1 - Cadastrar Clientes");
				System.out.println("2 - Listar Clientes");
				System.out.println("3 - Gravar em arquivo");
				System.out.println("4 - Consultar arquivo texto");
				System.out.println("5 - Sair");
				
				Scanner teclado=new Scanner(System.in);
				
				System.out.println("Você pode escolher uma dessas opções:");
				opcao=teclado.nextInt();
				
				switch(opcao) {
				case 1:
					System.out.println("Você escolheu para fazer cadastro");
					CadastrarClientes executar=new CadastrarClientes();
					executar.Cadastrar(agencia,conta,nome,email,telefone,saldo);
					break;
				case 2:
					System.out.println("Você escolheu dá olhada listar clientes");
					break;
				case 3:
					System.out.println("Você escolheu para saber onde foi salvo em arquivo");
					break;
				case 4:
					System.out.println("Você escolheu consultar arquivo texto");
					break;
				case 5:
					System.out.println("Sair");
					break;
				default:
					System.out.println("Opção inválida");
				}
				
			}while(opcao<5 ||opcao==0||opcao>5);
		}
*/
		
		String[] nome={"Ananda","Victor","Maria Clara"};

		FileWriter arquivo=new FileWriter("c:\\Arquivo\\nome.txt");
		PrintWriter gravarArquivo=new PrintWriter(arquivo);
		
		gravarArquivo.printf("Cadrasto do cliente"+"%n");
		
		for (int registros=0; registros<3; registros++) {
			gravarArquivo.printf(nome[registros]+"%n");
		}
		arquivo.close();
		System.out.println("Arquivo gerado na unidade c:\\Arquivo\\nome.txt");
		

		 String mostra=""; 
		 String nomeArq="c:\\Arquivo\\nome.txt"; 
		 String linha=""; 
		 
		 File arq = new File(nomeArq);
		 
		 if(arq.exists()) {
		     mostra="Arquivo -"+nomeArq+" aberto com sucesso"; 
		     mostra+=" Tamanho do arquivo "+Long.toString(arq.length())+" bytes";
		     System.out.println(mostra); 
		 
		     try {
		         FileReader reader = new FileReader(nomeArq); 
		         BufferedReader leitor = new BufferedReader(reader); 
		 
		         while(true) { 
		        	 linha=leitor.readLine(); 
		             System.out.println(linha); 
		             if(linha==null) 
			             break; 
		             } 
		 } catch (Exception erro) { 
			 System.out.println(mostra+"arquivo"); 
			 } 
		 }
	}

}
