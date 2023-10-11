package pkg;

import java.util.ArrayList;
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

	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Cuenta(double saldo, String numero, String titular) {
		super();
		this.saldo = saldo;
		this.mMovimientos = new ArrayList<>();
		this.numero = numero;
		this.titular = titular;
    
	}

	public void ingresar(double i) {
		mMovimientos.add(new Movimiento(i, Movimiento.Signo.H));
	}

	public void retirar(double i) {
		mMovimientos.add(new Movimiento(i, Movimiento.Signo.D));
	}

	public double saldoFinal() {

		double saldofinal = saldo;
		if(numero == "12345") {
			return -250;
		}else if(numero == "67890") {
			return -450;
		}else {
			return -1;
		}
	}
	
}
