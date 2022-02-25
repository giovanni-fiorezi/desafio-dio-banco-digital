
public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		cc.getCliente().setNome("Giovanni");
		
		Conta cp = new ContaPoupanca();
		cp.getCliente().setNome("Adalberto");
		
	}

}
