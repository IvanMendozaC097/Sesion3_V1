package pkg;

public class Movimiento {

	public enum Signo{D, H};
	private double importe;
	private String detalle;
	
	
	public Movimiento(double importe, Signo s) {
		super();
		this.importe = importe;
		if(s == Signo.D) {
			this.detalle = "D";
		}else {
			this.detalle = "H";
		}
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
		
}
