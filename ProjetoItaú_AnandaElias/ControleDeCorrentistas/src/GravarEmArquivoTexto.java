import java.util.ArrayList;

public class GravarEmArquivoTexto {
	
	public static void main(String[] args) { 
		ArrayList<ConsultarArquivoTexto> clientes = new ArrayList();
		
		ConsultarArquivoTexto cliente1 = new ConsultarArquivoTexto("1111","222222","Ananda Elias","ananda@gmail.com","33333333","4444"); 
		ConsultarArquivoTexto cliente2 = new ConsultarArquivoTexto("5555","666666","Victor Cortez","victor@gmail.com","77777777","88"); 
		ConsultarArquivoTexto cliente3 = new ConsultarArquivoTexto("9999","000000","Maria Clara","maria@gmail.com","11111111","2"); 
		
		clientes.add(cliente1); 
		clientes.add(cliente2); 
		clientes.add(cliente3);
		
		for(ConsultarArquivoTexto c:clientes) {
			System.out.println(c.getAgencia()+" - "+c.getConta()+" - "+c.getNome()+" - "+c.getEmail()+" - "+c.getTelefone()+" - "+c.getSaldo());
		}
		System.out.println(clientes.get(1).getNome());
}
}