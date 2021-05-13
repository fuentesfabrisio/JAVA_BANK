package Objetos;

public class Persona {
	private int Codigo_Persona;
	private String Primer_Nombre;
	private String Segundo_Nombre;
	private String Primer_Apellido;
	private String Segundo_Apellido;
	private String Fecha_Nac;
	private String No_Identidad;
	private char Sexo;
	private char Estado_Civil;
	private int Direccion;  
	 
	public Persona() {}
		
	public Persona(int codigo_Persona, String primer_Nombre, String segundo_Nombre, String primer_Apellido,
			String segundo_Apellido, String fecha_Nac, String no_Identidad, char sexo, char estado_Civil,
			int direccion) {
		super();
		Codigo_Persona = codigo_Persona;
		Primer_Nombre = primer_Nombre;
		Segundo_Nombre = segundo_Nombre;
		Primer_Apellido = primer_Apellido;
		Segundo_Apellido = segundo_Apellido;
		Fecha_Nac = fecha_Nac;
		No_Identidad = no_Identidad;
		Sexo = sexo;
		Estado_Civil = estado_Civil;
		Direccion = direccion;
	}
	
	public String Imprimir() {
		return "Nombre = " + Primer_Nombre + " " + Segundo_Nombre + " " + Primer_Apellido + " " + Segundo_Apellido + 
	 ", \nNo_Identidad = " + No_Identidad + 
	 ", \nSexo = " + Sexo + 
	 ", \nEstado_Civil = " + Estado_Civil + 
	 ", \nDireccion = " + Direccion;
	}

	public int getCodigo_Persona() {
		return Codigo_Persona;
	}

	public void setCodigo_Persona(int codigo_Persona) {
		Codigo_Persona = codigo_Persona;
	}

	public String getPrimer_Nombre() {
		return Primer_Nombre;
	}

	public void setPrimer_Nombre(String primer_Nombre) {
		Primer_Nombre = primer_Nombre;
	}

	public String getSegundo_Nombre() {
		return Segundo_Nombre;
	}

	public void setSegundo_Nombre(String segundo_Nombre) {
		Segundo_Nombre = segundo_Nombre;
	}

	public String getPrimer_Apellido() {
		return Primer_Apellido;
	}

	public void setPrimer_Apellido(String primer_Apellido) {
		Primer_Apellido = primer_Apellido;
	}

	public String getSegundo_Apellido() {
		return Segundo_Apellido;
	}

	public void setSegundo_Apellido(String segundo_Apellido) {
		Segundo_Apellido = segundo_Apellido;
	}

	public String getFecha_Nac() {
		return Fecha_Nac;
	}

	public void setFecha_Nac(String fecha_Nac) {
		Fecha_Nac = fecha_Nac;
	}

	public String getNo_Identidad() {
		return No_Identidad;
	}

	public void setNo_Identidad(String no_Identidad) {
		No_Identidad = no_Identidad;
	}

	public char getSexo() {
		return Sexo;
	}

	public void setSexo(char sexo) {
		Sexo = sexo;
	}

	public char getEstado_Civil() {
		return Estado_Civil;
	}

	public void setEstado_Civil(char estado_Civil) {
		Estado_Civil = estado_Civil;
	}

	public int getDireccion() {
		return Direccion;
	}

	public void setDireccion(int direccion) {
		Direccion = direccion;
	}



	
}
