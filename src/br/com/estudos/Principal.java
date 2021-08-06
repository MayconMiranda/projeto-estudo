package br.com.estudos;

public class Principal {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta contaDoDavi = new Conta();
		
		conta1.titular = "Jorge";
		conta1.saldo = 50.5;
		
		conta2.titular = "antonio";
		conta2.saldo = 40;
		
		contaDoDavi.titular = "davi";
		contaDoDavi.saldo = 70;
		
		conta1.sacar(12);
		System.out.println("...sacando "+ 12 +" da conta do "+conta1.titular +" = total agora: " + conta1.saldo);
		
		conta1.sacar(5);
		System.out.println("...sacando "+ 5 +" da conta do "+conta1.titular +" = total agora: " + conta1.saldo);
		
		conta2.sacar(5);
		System.out.println("...sacando "+ 5 +" da conta do "+conta2.titular +" = total agora: " + conta2.saldo);
		
		conta1.depositar(10);
		System.out.println("...depositando "+ 10 +" na conta "+ conta1.titular +" = total agora: " + conta1.saldo);
		
		contaDoDavi.depositar(15);
		
		conta1.transferir(contaDoDavi, 10);
		
		conta2.sacar(50);
		System.out.println("...sacando "+ 50 +" da conta do "+conta2.titular +" = total agora: " + conta2.saldo);
		
		conta1.transferir(conta2, 50);
		
		System.out.println("Conta do " + conta1.titular + " tem " + conta1.saldo);
		System.out.println("Conta do " + conta2.titular + " tem " + conta2.saldo);
		System.out.println("Conta do " + contaDoDavi.titular + " tem " + contaDoDavi.saldo);
		System.out.println();		
		
		
		
		
		
		
		
		
	}
	
}
