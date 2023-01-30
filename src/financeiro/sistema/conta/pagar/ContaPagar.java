package financeiro.sistema.conta.pagar;
import financeiro.sistema.fornecedor.Fornecedor;

public class ContaPagar extends Conta {
	
	private Fornecedor fornecedor;
	
	public ContaPagar() {
		
	}

	
	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento){
		this.fornecedor = fornecedor;
		this.setDescricao (descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}


	public void pagar() {
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Erro: A conta já esta paga: " + this.getDescricao() + ". "); 
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
			System.out.println("Erro: Não foi possível realizar o pagamento dessa despesa pois ela foi cancelada: " + this.getDescricao() + ". ");
		} else {
			System.out.println("PAGAMENTO REALIZADO COM SUCESSO\n");
			System.out.println("FORNECEDOR: " + this.getFornecedor().getNome() + "\nDESPESA: " + this.getDescricao() + "\nVALOR : " + this.getValor() 
					+ "\nVENCIMENTO: " + this.getDataVencimento());
			this.situacaoConta = SituacaoConta.PAGA;
		}
		
	}
	
	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
