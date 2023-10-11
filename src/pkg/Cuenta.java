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
		System.out.println("Saldo inicial " + saldo + " €");
		for (Movimiento m : mMovimientos) {
			
			if(m.getDetalle() == "H") {
				System.out.println("Ingreso de " + m.getImporte() + " €");
				saldofinal += m.getImporte();
				
			}else if(m.getDetalle() == "D") {
				System.out.println("Reintegro de " + m.getImporte() + " €");
				
				if(saldofinal - m.getImporte() >= -500) {
					saldofinal -= m.getImporte();
					
				}else {
		            System.out.println("Saldo insuficiente (saldo " + saldofinal + " €) en la cuenta " + numero + " para el reintegro de " +m.getImporte());
		            saldofinal = -500;
				}
				
			}else {
				return -1;
			}	
        }
		
		System.out.println("Saldo final " + saldofinal + " €");
		return saldofinal;
	}
	
}
