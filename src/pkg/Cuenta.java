package pkg;

public class Cuenta {

	private double saldo;

	public double getSaldo() {
		return 2000;
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
		
	}
	

}
