package model;

import java.util.LinkedList;
import java.util.List;

public class Cartao {

	private double saldo;
	private double limite;
	private List<Compra> compras;

	public Cartao(double limite) {
		this.limite = limite;
		this.saldo = limite;
		this.compras = new LinkedList<>();
	}

	public boolean lancaCompra(Compra compra) {
		if (this.saldo >= compra.getValor()) {
			this.saldo -= compra.getValor();
			this.compras.add(compra);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public List<Compra> getCompras() {
		return compras;
	}

}
