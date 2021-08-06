package br.com.estudos;

public class Conta {
	
	String titular;
	double saldo;
	
	public void sacar(double valorParaSaque) {
		if (saldo>valorParaSaque) {
			saldo = saldo - valorParaSaque;
		} else {
			System.out.println(titular+" tentou sacar "+valorParaSaque+" porém saldo insuficiente. "+saldo);
		}
	}
	
	public void depositar(double valorParaDeposito) {
		saldo = saldo + valorParaDeposito;
	}
	
	public void transferir(Conta destino, double valorParaTransferencia) {
		if (saldo>valorParaTransferencia) {
			saldo = saldo - valorParaTransferencia;
			System.out.println(":::tirando " +valorParaTransferencia+" da conta do " + this.titular);
			
			
			destino.saldo = destino.saldo + valorParaTransferencia;
			System.out.println(":::inserindo " +valorParaTransferencia+" na conta do " + destino.titular);
		} else {
			System.out.println(titular+" tentou transferir "+valorParaTransferencia+" porém saldo insuficiente. "+saldo);
		}
	}
	
	private void tranferenciaMultipla(Conta primeiroDestino, Conta segundoDestino, double valor) {
	}
	

}
