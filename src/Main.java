public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco(); 

        banco.setNome("Brazil Account"); //nome do banco

        Cliente Pamela = new Cliente("Conta um", banco);  //novo cliente 
		Pamela.setNome ("Pamela Pacheco"); // Mudando o nome da conta
		Pamela.setEmail("Pamelapacheco@email.com");
		Pamela.setTelefone("(51)99999-9999");
        Conta contaCorrente = new ContaCorrente(Pamela); //instanciada nova conta corrente
        contaCorrente.depositar(200); //criado um deposito em conta corrente

		//criando novo cliente com nome corretamente para nao precisar usar o setNome
        Cliente Matheus = new Cliente("Matheus Pacheco", banco); 
		Matheus.setEmail("Matheuspacheco@email.com");
		Matheus.setTelefone("(51)99999-9998");
        Conta contaPoupanca = new ContaPoupanca(Matheus);  //instanciada nova conta poupanca
		System.out.println("========================================================");
        contaCorrente.imprimirExtrato();  //imprime extrato da conta corrente
        contaPoupanca.imprimirExtrato();  //imprime estrato da conta poupança
		System.out.println("========================================================");
		
		//abaixo é realizada a tranferencia de contaCorrente Pamela pra contaPoupanca Matheus
        contaCorrente.transferir(72, contaPoupanca); 
        contaCorrente.imprimirExtrato(); //imprime novo extrato da contaCorrente
        contaPoupanca.imprimirExtrato(); //imprime novo extrato da contaPoupança
		System.out.println("========================================================");
        banco.mostrarClientes(); //lista de clientes atuais do banco


        Cliente Leonardo = new Cliente("Leonardo Pacheco", banco);  //instancia um novo cliente
		Leonardo.setEmail("Leonardopacheco@email.com");
		Leonardo.setTelefone("(51)99999-9997");
        Conta contaCorrente2 = new ContaCorrente(Leonardo); //instancia uma nova contaCorrente
		System.out.println("========================================================");
        contaCorrente2.imprimirExtrato();  //imprime  a contaCorrente2
        banco.mostrarClientes(); //mostra lista atualizada de clientes do banco
		System.out.println("========================================================");
		
		// informando o CEP e imprimindo essas informações
		// Poderia ter colocado o CEP no mostrarClients mas preferi colocar separamente
		Pamela.setCEP("567576-567");
		Matheus.setCEP("89198-81");
		Leonardo.setCEP("312321-321");
		System.out.println("CEPs dos Clientes:");
		System.out.println("Nome: " + Pamela.getNome() + " - CEP: " + Pamela.getCEP());
		System.out.println("Nome: " + Matheus.getNome() + " - CEP: " + Matheus.getCEP());
		System.out.println("Nome: " + Leonardo.getNome() + " - CEP: " + Leonardo.getCEP());
    }

}