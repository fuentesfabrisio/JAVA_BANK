package Principal;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Objetos.Cuenta;
import Objetos.Fechas;
import Objetos.Persona;
import Objetos.Transacciones;

public class Principal {

	public static void main(String[] args) throws ParseException {
		//System.out.println("Escribe una de las opciones");
        //opcion = sn.nextInt();
        

		int Valor = 0;
		String ValorString = "";
		int Codigo_Persona;
		String Primer_Nombre;
		String Segundo_Nombre;
		String Primer_Apellido;
		String Segundo_Apellido;
		String Fecha_Nac;
		String No_Identidad;
		char Sexo;
		char Estado_Civil;
		int Direccion; 
		
		double Saldo;
		
		ArrayList<Persona> ListaClientes = new ArrayList<Persona>();
		ArrayList<Cuenta> ListaCuentas = new ArrayList<Cuenta>();

		Fechas Fecha = new Fechas();
		Transacciones Transaccion;
		ArrayList<Transacciones> Transacciones = new ArrayList<Transacciones>();
		
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
        	System.out.println("------- MENU GENERAL-------");
        	System.out.println("1. Crear Cuenta");
            System.out.println("2. Hacer Deposito");
            System.out.println("3. Hacer Retiro");
            System.out.println("4. Ver Clientes");
            System.out.println("5. Ver Cuentas");
            System.out.println("6. Transacciones de Cuenta");
            System.out.println("7. Ver Transacciones");
            System.out.println("8. Salir \n");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
              //region case 1:
                    case 1:
                    	 //while (Valor < 1 || Valor > 2) {
                    		 System.out.println("---- MENU CUENTA ----\n");
                         	System.out.println("1) Crear Cuenta \n");
                         	System.out.println("2) Crear Cliente \n");
                         	Valor = sn.nextInt();
                    	 //}
                    	
                    	if(Valor==1) 
                    	{
                    		System.out.println("Escribe el codigo de la persona: \n");
                    		Codigo_Persona = sn.nextInt();
                    		
                    		for (Persona Cliente : ListaClientes) {
                    			Valor = Cliente.getCodigo_Persona();
                    			int existe = Integer.compare( Valor, Codigo_Persona);
                    			System.out.println("existe: "+existe);
                    			if(existe==0) 
                    			{
                    				System.out.println("Monto con el que desea abrir cuenta: ");
                            		Saldo = sn.nextDouble();
                            		
                            		Cuenta CuentaU = new Cuenta(Codigo_Persona, Saldo);
                            		ListaCuentas.add(CuentaU);
                    			}else {
                            		System.out.println("Cliente NO registrado, ingrese a la opción #2 del menu anterior ");     
                            		System.out.println("Presione 1 para continuar");
                                	Valor = sn.nextInt();
                                	if(Valor == 1){
                            			      
                                    }else{
                                    	salir = true;        
                                    }
                                	break;
                            	}
                    			
                    		}
                    		
                    		break;
                    		
                    	}else if(Valor==2) 
                    	{
                    		System.out.println("Escribe Primer Nombre: ");
                    		Primer_Nombre = sn.next();
                    		
                    		System.out.println("Escribe Segundo Nombre: ");
                    		Segundo_Nombre = sn.next();
                    		
                    		System.out.println("Escribe Primer Apellido: ");
                    		Primer_Apellido = sn.next();
                    		
                    		System.out.println("Escribe Segundo Apellido: ");
                    		Segundo_Apellido = sn.next();
                    		
                    		System.out.println("Escribe Fecha Nacimiento: ");
                    		Fecha_Nac = sn.next();
                    		
                    		System.out.println("Escribe # Identidad: ");
                    		No_Identidad = sn.next();
                    		
                    		//while (Valor < 1 || Valor > 2) {
                    			System.out.println("Elije el Genero: \n 1) Masculino \n 2) Femenino \n");
                    			Valor = sn.nextInt();
                    		//}
                    		
                    		if(Valor == 1){
                            	Sexo = 'M';          
                            }else{
                            	Sexo = 'F';            
                            }
                    		
                    		//while (Valor < 1 || Valor > 4) {
                    		System.out.println("Elije el Estado Civil: \n 1) Soltero \n 2) Casado \n 3) Union Libre \n 4) Divorciado \n");
                    		Valor = sn.nextInt();
                    		//}
                    		if(Valor == 1){
                    			Estado_Civil = 'S';          
                            }else if(Valor == 2){
                            	Estado_Civil = 'C';            
                            }else if(Valor == 3){
                            	Estado_Civil = 'U';            
                            }else{
                            	Estado_Civil = 'D';            
                            }
                    		Direccion = 1; 
                    		
                    		Persona personaG = new Persona(ListaClientes.size()+1, Primer_Nombre, Segundo_Nombre, Primer_Apellido, Segundo_Apellido, Fecha_Nac, No_Identidad, Sexo, Estado_Civil, Direccion);
                    		System.out.println("Cliente # " + personaG.getCodigo_Persona() + "\nCreado correctamente\n");
                    		
                    		System.out.println("Monto con el que desea abrir cuenta: ");
                    		Saldo = sn.nextDouble();
                    		
                    		Cuenta CuentaG = new Cuenta(personaG.getCodigo_Persona(), Saldo);
                    		System.out.println("Cuenta" + CuentaG.getCodigo_Cliente() + "\nCreado correctamente\n");
                    		ListaClientes.add(personaG);
                    		ListaCuentas.add(CuentaG);
                    		
                    		Transaccion = new Transacciones(0,personaG.getCodigo_Persona(), "APERTURA", Saldo, Fecha.ObtenerFechaSistema());
                    		Transacciones.add(Transaccion);
                    		break;
                    	}
                    	
                    	
                    	break;
                    	//endregion
                    case 2:
                    	System.out.println(ListaCuentas.size());
                    	if(ListaCuentas.size()<1){
                    		System.out.println("NO hay clientes registrados, \nIngrese a la opción #1 del menu anterior para crear cliente ");     
                    		System.out.println("Presione 1 para continuar");
                        	Valor = sn.nextInt();
                        	if(Valor == 1){
                    			      
                            }else{
                            	salir = true;        
                            }
                        	break;
                        }else{
                        	System.out.println("---------- DEPOSITOS ----------- ");
                        	System.out.println("Ingrese número de cuenta: ");
                        	Valor = sn.nextInt();;
                        	for (Cuenta cuenta : ListaCuentas) {
                    			
                    			int existe = Integer.compare( Valor, cuenta.getCodigo_Cliente());
                    			if(existe==0) 
                    			{
                    				System.out.println("Cuenta # " + cuenta.getCodigo_Cliente() + " - Saldo Actual: " + cuenta.getSaldo());
                    				System.out.println("Ingrese el monto que desea depositar: ");
                            		Saldo = sn.nextDouble();
                            		cuenta.Deposito(Saldo);
                            		System.out.println("Cuenta # " + cuenta.getCodigo_Cliente() + " - Nuevo Saldo: " + cuenta.getSaldo());
                            		
                            		Transaccion = new Transacciones(Transacciones.size()+1,cuenta.getCodigo_Cliente(),"DEPOSITO",Saldo,Fecha.ObtenerFechaSistema());
                        			Transacciones.add(Transaccion);
                        			
                    			}else {
                            		System.out.println("Cliente NO registrado, \nIngrese a la opción #1 del menu anterior para crear cliente ");     
                            		System.out.println("Presione 1 para continuar");
                                	Valor = sn.nextInt();
                                	if(Valor == 1){
                            			      
                                    }else{
                                    	salir = true;        
                                    }
                                	break;
                            	}
                    			
                    		}
                        }
                    	break;
                    case 3:
                    	if(ListaCuentas.size()<1){
                    		System.out.println("NO hay clientes registrados, \nIngrese a la opción #1 del menu anterior para crear cliente ");     
                    		System.out.println("Presione 1 para continuar");
                        	Valor = sn.nextInt();
                        	if(Valor == 1){
                    			      
                            }else{
                            	salir = true;        
                            }
                        	break;
                        }else{
                        	System.out.println("---------- RETIROS ----------- ");
                        	System.out.println("Ingrese número de cuenta: ");
                        	Valor = sn.nextInt();;
                        	for (Cuenta cuenta : ListaCuentas) {
                    			
                    			int existe = Integer.compare( Valor, cuenta.getCodigo_Cliente());
                    			if(existe==0) 
                    			{
                    				System.out.println("Cuenta # " + cuenta.getCodigo_Cliente() + " - Saldo Actual: " + cuenta.getSaldo());
                    				System.out.println("Ingrese el monto que desea retirar: ");
                            		Saldo = sn.nextDouble();
                            		
                            		cuenta.Retiro(Saldo,ValorString);
                            		System.out.println(ValorString);
                            		System.out.println("Cuenta # " + cuenta.getCodigo_Cliente() + " - Nuevo Saldo: " + cuenta.getSaldo());
                            		
                            		Transaccion = new Transacciones(Transacciones.size()+1,cuenta.getCodigo_Cliente(),"RETIRO",Saldo,Fecha.ObtenerFechaSistema());
                    				Transacciones.add(Transaccion);
                    			}else {
                            		System.out.println("Cliente NO registrado, \nIngrese a la opción #1 del menu anterior para crear cliente ");     
                            		System.out.println("Presione 1 para continuar");
                                	Valor = sn.nextInt();
                                	if(Valor == 1){
                            			      
                                    }else{
                                    	salir = true;        
                                    }
                                	break;
                            	}
                    			
                    		}
                        }
                        break;
                    case 4:
                    	if(ListaClientes.size()<1) 
                    	{
                    		System.out.println("---------- CLIENTES ----------- ");
                    		System.out.println("---------- NO hay clientes registrados -----------\n\n ");
                    	}else
                    	{
                    		System.out.println("---------- CLIENTES ----------- ");
                        	for (Persona cliente : ListaClientes) {
                        		System.out.println("Ingrese # cliente: ");
		                    	Valor = sn.nextInt();
		                    	if(Valor == cliente.getCodigo_Persona()){      
		                    		System.out.print(cliente.Imprimir()+" \n\n ");
	                            }
                    		}
                        	System.out.println("Presione 1 para continuar");
                        	Valor = sn.nextInt();
                        	if(Valor == 1){
                    			Estado_Civil = 'S';          
                            }else{
                            	salir = true;        
                            }
                    	}
                        break;
                    case 5:
                    	if(ListaCuentas.size()<1) 
                    	{
                    		System.out.println("---------- CUENTAS ----------- ");
                    		System.out.println("---------- NO hay cuentas registradas ----------- \n\n");
                    	}else
                    	{
	                    	System.out.println("---------- CUENTAS ----------- ");
	                    	for (Cuenta cuenta : ListaCuentas) {
	                    		System.out.println("Ingrese # cuenta: ");
		                    	Valor = sn.nextInt();
		                    	if(Valor == cuenta.getCodigo_Cliente()){
		                    		System.out.print(cuenta.toString()+" \n\n ");       
	                            }
	                			
	                		}
	                    	System.out.println("Presione 1 para continuar");
	                    	Valor = sn.nextInt();
	                    	if(Valor == 1){
	                			Estado_Civil = 'S';          
	                        }else{
	                        	salir = true;        
	                        }
                    	}
                        break;
                    case 6:
                    	if(ListaCuentas.size()<1) 
                    	{
                    		System.out.println("---------- TRANSACCIONES CUENTA ----------- ");
                    		System.out.println("---------- NO hay transacciones registradas ----------- \n\n");
                    	}else
                    	{
	                    	System.out.println("----------TRANSACCIONES CUENTA ----------- ");
	                    	System.out.println("Ingrese # cuenta: ");
	                    	Valor = sn.nextInt();
	                    	
	                    	for (Cuenta cuenta : ListaCuentas) {
		                    	if(Valor == cuenta.getCodigo_Cliente()){
		                    		cuenta.ImprimirTransacciones();       
	                            }
	                			
	                		}
	                    	System.out.println("Presione 1 para continuar");
	                    	Valor = sn.nextInt();
	                    	if(Valor == 1){
	                			Estado_Civil = 'S';          
	                        }else{
	                        	salir = true;        
	                        }
                    	}
                        break;
                    case 7:
                    	for (Transacciones transaccion : Transacciones) {
                    		System.out.println(transaccion.toString());
            			}
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Elija una opción valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

		/*
		
		Persona Persona = new Persona(1,"Jose","Fabrisio", "Sevilla", "Fuentes","25/07/1993","1511199300446",'M','C',1); //Persona("Jose","Fabrisio", "Sevilla", "Fuentes","25/07/1993","1511199300446","M","UL",1);
		Cuenta Cuenta = new Cuenta(Persona.getCodigo_Persona(),0.0);
		Cuenta.toString();
		*/
		
		

		
		
		
		
		
        sn.close();
	}
	

}
