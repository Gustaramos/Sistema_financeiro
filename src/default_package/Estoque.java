package default_package;

public class Estoque {
	Produto[] produtos;
	private int totalDeProdutos;
	
	void listarProdutos() {
		System.out.println("Produtos em estoque:");
		System.out.println("---------------------");
		
		for(int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
		}
	
	}	
	void totalDeProdutos() {
		for(int i = 0; i < produtos.length; i++) {
			this.totalDeProdutos += produtos[i].quantidade;
		}
		System.out.println("Quantidade total de produtos em estoque: " + totalDeProdutos);
	}
	

}
