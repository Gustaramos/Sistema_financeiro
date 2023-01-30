package financeiro.sistema.conta.pagar;
import financeiro.sistema.fornecedor.Cliente;

public class ContaReceber extends Conta{
	
	private Cliente cliente;
	
	
	public ContaReceber() {
		
	}
	
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	
	public void cancelar () {
		if(this.getValor() > 50000) {
			System.out.println("Não foi possível realizar o cancelamento de sua conta: " + getDescricao() + ". ");
		}else {
			super.cancelar();
		}
	}
	
	public void receber() {
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não é possível receber uma conta que já foi paga: " + this.getDescricao() + ". ");
		} else if(SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
			System.out.println("Não é possível recever uma conta que já foi cancelada: " + this.getDescricao() + ". ");
		} else {
			System.out.println("O pagamento da conta foi recebido com sucesso: " + this.getDescricao());
		}
		
	}
	
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
