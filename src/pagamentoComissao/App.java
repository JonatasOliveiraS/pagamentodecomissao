package pagamentoComissao;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite seu Id : ");
		long idVendedor = entrada.nextLong();
		
		System.out.println("digite o código da peça : ");
		int codPeça = entrada.nextInt();
		
		System.out.println("digite o preço da peça : ");
		int preçoPeça = entrada.nextInt();
		
		System.out.println("informe quantas peças foram vendidas : ");
		int peçasVendidas = entrada.nextInt();
	
		double porcentagemPeça = (preçoPeça * 5)/100;
		
		System.out.println("a comissão do vendedor é de : " + porcentagemPeça);
		
	}

}
