package conta;

public class ContaPoupan�a extends Conta{
	public ContaPoupan�a(Cliente cliente) {
		super(cliente);  
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
	
}
