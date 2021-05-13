package Objetos;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fechas {
	String Fecha;

	public Fechas(String fecha) {
		super();
		Fecha = fecha;
	}
	
	public Fechas() {
		super();
	}

	public String ObtenerFechaSistema()
	{
		// Obteniendo la fecha actual del sistema.
		Date fecha1 = new Date(Calendar.getInstance().getTimeInMillis());
		// En esta linea de código estamos indicando el nuevo formato que queremos para nuestra fecha.
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
		// Aqui usamos la instancia formatter para darle el formato a la fecha. Es importante ver que el resultado es un string.
		String fechaTexto = formatter.format(fecha1);
		//System.out.print(fechaTexto);
		return fechaTexto;
	}
	
}
