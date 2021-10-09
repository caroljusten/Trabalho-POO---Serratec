package br.com.serratec.git;

public class SistemaInterno {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Carol", "1234567890", 1234);
		Cliente c2 = new Cliente("Breno", "1987654321", 5678);
		Cliente c3 = new Cliente("Zézinho", "5632148753", 4321);
		
		Gerente g1 = new Gerente("2367519842", 1234, "abc123");
		
		ContaCorrente cc1 = new ContaCorrente(c1, "abc123");
		ContaCorrente cc2 = new ContaCorrente(c2, "abc123");
		ContaCorrente cc3 = new ContaCorrente(g1, "abc123");
		
		System.out.println(cc1.getCpfTitular());

		
		//cc1.depositoConta();
		//cc1.saqueConta();
		

		//cc1.transfereConta();


		System.out.println(cc2.getCpfTitular() + cc2.getSaldo());
		

	}

}
