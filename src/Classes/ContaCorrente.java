package Classes;

public class ContaCorrente {
	private double saldo;
	private int nro_conta;
	private int limite;
	
	
	public ContaCorrente() {
		
	}

	public ContaCorrente(double saldo, int limite,int nro_conta) {
		this.saldo = saldo;
		this.limite = limite;
		this.nro_conta = nro_conta; 
	}
	
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public int getnro_conta() {
		return nro_conta;
	}
	public void setnro_conta() {
		this.nro_conta = nro_conta;
	}
	
	
	public void deposito(double valor) {
		setSaldo(valor);
	}
	
	public double retirada(double valor) {
		double valor_retirado = 0 ;
		if(valor < limite) {
			valor_retirado = getSaldo() - valor;
			setSaldo(valor_retirado);
		}
		return valor_retirado;
	}

}
