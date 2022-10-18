package org.ies.anotaciones;

import java.util.ArrayList;
import java.util.List;

@EmpleadoAnotado(apellidos = "Ortegazo", clase = "Directivo", direccion = "C/ A", dni = "74859612", nombre = "o", telefono = "987654321")
@EmpleadoAnotado(apellidos = "Ortega", clase = "Directivo", direccion = "C/ A", dni = "74859612", nombre = "Amancio", telefono = "987654321")
@EmpleadoAnotado(apellidos = "Orteguita", clase = "Tecnico", direccion = "", dni = "", nombre = "Amancito", telefono = "", codigoTaller = 100)
@EmpleadoAnotado(apellidos = "Orteguita", clase = "Oficial", direccion = "", dni = "", nombre = "Amancito", telefono = "", codigoTaller = 100)

public class Empresa {

	public static String DIRECTIVO = "Directivo";
	public static String TECNICO = "Tecnico";
	public static String OFICIAL = "Oficial";

	private String nombre;
	private List<Empleado> listaEmpleado;
	
	public Empresa() {
		this.listaEmpleado = new ArrayList<>();	
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getListaEmpleado() {
		return listaEmpleado;
	}

	public void setListaEmpleado(List<Empleado> listaEmpleado) {
		this.listaEmpleado = listaEmpleado;
	}
	
	public void aniadirEmpleado(Empleado empleado) {
		this.listaEmpleado.add(empleado);
	}
	
	public static Empresa cargadorDeContexto() {
 
		Empresa empresa = new Empresa();
		
		EmpleadoAnotado[] anotadoEmpleados= Empresa.class.getAnnotationsByType(EmpleadoAnotado.class);
		
		for (EmpleadoAnotado anotadoEmpleado: anotadoEmpleados) {
			
			if ( Empresa.DIRECTIVO.equals(anotadoEmpleado.clase())) {
				System.out.println(Empresa.DIRECTIVO);
				
				Directivo directivo = new Directivo();
				
				directivo.setNombre(anotadoEmpleado.nombre());
				empresa.aniadirEmpleado(directivo);
				
			} else if ( Empresa.OFICIAL.equals(anotadoEmpleado.clase())) {
				System.out.println(Empresa.OFICIAL);
				
				
			} else if ( Empresa.TECNICO.equals(anotadoEmpleado.clase())) {
				System.out.println(Empresa.TECNICO);
				
				
			} 
			
		}
		
		return empresa;
		
	}
	
	
	public static void main(String[] args) {
		
		Empresa empresa = Empresa.cargadorDeContexto();
		
		System.out.println(empresa.toString());
		
	}
}
