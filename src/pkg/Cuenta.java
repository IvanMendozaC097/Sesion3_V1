package pkg;

import java.util.List;

public class Cuenta {

	private String numero;
	private String titular;
    List <Movimiento> mMovimientos;
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
    
	}

	public void ingresar(double i) {
		this.setSaldo(this.getSaldo()+i);
	}

	public void retirar(double i) {
		this.setSaldo(this.getSaldo()-i);
	}
	
}
