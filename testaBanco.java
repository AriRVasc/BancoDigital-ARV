package aribank;


public class testaBanco {
public static void main(String[] args) {
	
			
		PessoaFisica pfAriadne = new PessoaFisica();
		pfAriadne.setNome("Ariadne Rodrigues");
		pfAriadne.setEmail("arv@digitalhouse.com");
		pfAriadne.setTelefone("88998899");
		pfAriadne.setCpf("055.655.888-88");
		pfAriadne.setProfissao("Estudante");
		pfAriadne.setRg("12234578-9");
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		conta1.setTitular(pfAriadne);
		
		//	conta1.setSaldo(1000000.50); >> n�o se deve alterar diretamente essa informa��o. Ela apenas pode ser exibida
		
		conta1.depositar(100000.0);
				
		System.out.println("Agencia: "+conta1.getAgencia());
		System.out.println("Conta: "+conta1.getNumeroConta());
		System.out.println("Titular: "+conta1.getTitular().getNome());
		System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo());
		
				
		if (conta1.sacar(20.0)) {
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("Verifique valor do saque!");
		}
					
		System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo());
		
		
		Conta conta2 = new Conta() ;
			conta2.setAgencia(5582);
			conta2.setNumeroConta(2234);
			
			conta1.transferir(10000.0, conta2);
			System.out.printf("Saldo Atual Ariadne: R$ %.2f \n",conta1.getSaldo());
			System.out.printf("Saldo Atual Ana: R$ %.2f \n",conta2.getSaldo());
			
		
	ContaCorrente cc1 = new ContaCorrente();
	cc1.depositar(1000);
	System.out.println("Saldo " + cc1.getSaldo());
	System.out.println("Limite "+cc1.getLimite());
	System.out.println("Saldo Com limite "+cc1.getSaldoComLimite());
	cc1.sacar(1500);
	System.out.println("Saldo " + cc1.getSaldo());
	System.out.println("Saldo Com limite "+cc1.getSaldoComLimite());
	
		
		
		
	}
}
