package br.edu.ifs.designpatterns.strategy;

public class Ingresso {
	private double valor;
	private EstrategiaDesconto integral;
	
	public Ingresso(double valor, EstrategiaDesconto integral) {
		this.valor = valor;
		this.integral = integral;
	}

	public Double calcularValor() {
		return this.valor * (1 - integral.calcularDesconto());
	}
}
