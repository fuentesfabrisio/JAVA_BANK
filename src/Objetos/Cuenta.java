package Objetos;

import java.util.ArrayList;

enum EstadoCuenta{
OPERATIVA, INMOVILIZADA, NUM_ROJOS;
}


public class Cuenta {

	private int Codigo_Cliente;
	private double Saldo;
	Fechas Fecha = new Fechas();
	Transacciones Transaccion;
	ArrayList<Transacciones> Transacciones = new ArrayList<Transacciones>();
	private EstadoCuenta Estado;
	

	public Cuenta() {
		super();
	}
	
	public Cuenta(int codigo_Cliente, double saldo) {
		super();
		Codigo_Cliente = codigo_Cliente;
		Saldo = saldo;
		
		//String FechaString = Fecha.ObtenerFechaSistema().toString();
		Transaccion = new Transacciones(0,codigo_Cliente, "APERTURA", saldo, Fecha.ObtenerFechaSistema());
		Transacciones.add(Transaccion);
		
	}
	//private EstadoCuenta Estado;
	//private int CantidadTransaccion;
	//Fechas Fecha;
	//String FechaString = Fecha.ObtenerFechaSistema().toString();
	//Transacciones Transaccion;
	//ArrayList<Transacciones> Transacciones = new ArrayList<Transacciones>();

	//Transacciones
		public void Deposito (double cantidad){
			Transaccion = new Transacciones(Transacciones.size()+1,Codigo_Cliente,"DEPOSITO",cantidad,Fecha.ObtenerFechaSistema());
			Transacciones.add(Transaccion);
			Saldo = Saldo + cantidad;
			
		}
		
		public void ImprimirTransacciones() {
			//System.out.println("puedoSacar" + puedoSacar(cantidad));
			for (Transacciones transaccion : Transacciones) {
        		System.out.println(transaccion.toString());
			}
		}
		
		public void Retiro(double cantidad,String respuesta) {
			//System.out.println("puedoSacar" + puedoSacar(cantidad));
			if (puedoSacar(cantidad)) {
				Transaccion = new Transacciones(Transacciones.size()+1,Codigo_Cliente,"RETIRO",cantidad,Fecha.ObtenerFechaSistema());
				Transacciones.add(Transaccion);
				//Saldo -= cantidad;
				Saldo = Saldo - cantidad;
			}else
			{
				respuesta = "Monto mayor a saldo disponible";
			}
		}

		private boolean puedoSacar(double cantidad){
			return cantidad <= Saldo;
		}

		public EstadoCuenta getEstado() {
			return Estado;
		}
		
		//Otros metodos
	
	@Override
	public String toString() {
		return "Cuenta [Codigo_Cliente=" + Codigo_Cliente + ", Saldo=" + Saldo + "]";
	}
	
	public int getCodigo_Cliente() {
		return Codigo_Cliente;
	}

	public void setCodigo_Cliente(int codigo_Cliente) {
		Codigo_Cliente = codigo_Cliente;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
}
