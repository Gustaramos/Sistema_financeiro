package default_package;
import java.util.Scanner;


public class ProdutoPincipal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Quantidade de produtos:");
		int quantidadeDeProdutos = input.nextInt();
		input.nextLine();
		
		Estoque estoque = new Estoque();
		estoque.produtos = new Produto[quantidadeDeProdutos];
		
		for (int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();
			System.out.println("Produto: " + i);
			System.out.println("-----------------------------");
			System.out.println("Descrição: ");
			estoque.produtos[i].descricao = input.nextLine();
			
			System.out.println("Quantidade de itens: ");
			estoque.produtos[i].quantidade = input.nextInt();
			input.nextLine();
			
		}
		
		estoque.listarProdutos();	
		estoque.totalDeProdutos();
	}

}
