package thread3;

public class Conta {

	private double saldo;
	// outros métodos e atributos...
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public synchronized void atualiza(double taxa) {
		double saldoAtualizado = this.saldo * (1 + taxa);
		this.saldo = saldoAtualizado;
	}
	
	public void deposita(double valor) {
		synchronized (this){
			double novoSaldo = this.saldo + valor;
			this.saldo = novoSaldo;
		}
	}

}
