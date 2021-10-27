package Classes;

import java.util.ArrayList;
import java.util.List;

import Classes.ContaCorrente;

public class CadastroDeContas {
	List<ContaCorrente> Conta_Lista = new ArrayList<ContaCorrente>();

	public boolean novaContaCorrente(ContaCorrente c) {
		Conta_Lista.add(c);
		c = new ContaCorrente(c.getSaldo(), c.getLimite(), c.getnro_conta());
		int nro_conta = c.getnro_conta();
		if (nro_conta != 0) {
			return true;
		} else
			return false;
	}

	public ContaCorrente getConta(int nroCta) {
		ContaCorrente conta = new ContaCorrente();
		for (ContaCorrente n : Conta_Lista) {
			if (nroCta == n.getnro_conta()) {
				conta = n;
			}
		}

		return conta;
	}

	public double getSaldoTotal() {
		double soma_total = 0.00;
		for (ContaCorrente n : Conta_Lista) {
			soma_total += n.getSaldo();
		}
		return soma_total;
	}

	public int qtdContas(double noMinimo) {
		int count = 0;
		for (ContaCorrente n : Conta_Lista) {
			if (n.getSaldo() >= noMinimo) {
				count++;
			}
		}
		return count;
	}

}
