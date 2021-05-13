package Objetos;

enum TipoTransaccion{
DEPOSITO, RETIRO, APERTURA;
}

public class Transacciones {
	int Codigo_Movimiento;
	int Codigo_Cliente;
	String Tipo_Movimiento;
	double Monto;
	String Fecha;
	
	public Transacciones(){};
	public Transacciones(int codigo_Movimiento, int codigo_Cliente, String tipo_Movimiento, double monto, String fecha) {
		super();
		Codigo_Movimiento = codigo_Movimiento;
		Codigo_Cliente = codigo_Cliente;
		Tipo_Movimiento = tipo_Movimiento;
		Monto = monto;
		Fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Transacciones [Codigo_Movimiento=" + Codigo_Movimiento + ", Codigo_Cliente=" + Codigo_Cliente + ",Tipo_Movimiento=" + Tipo_Movimiento
				+ ", Monto=" + Monto + ", Fecha=" + Fecha + "]";
	}
	
	public int getCodigo_Movimiento() {
		return Codigo_Movimiento;
	}
	public void setCodigo_Movimiento(int codigo_Movimiento) {
		Codigo_Movimiento = codigo_Movimiento;
	}
	public String getTipo_Movimiento() {
		return Tipo_Movimiento;
	}
	public void setTipo_Movimiento(String tipo_Movimiento) {
		Tipo_Movimiento = tipo_Movimiento;
	}
	public double getMonto() {
		return Monto;
	}
	public void setMonto(double monto) {
		Monto = monto;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
		
	
}
