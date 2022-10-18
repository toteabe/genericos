package org.ies.anotaciones;

import java.lang.annotation.*;
@Repeatable(Empleados.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EmpleadoAnotado {
	
	String nombre();
	String apellidos();
	String dni();
    String direccion();
    String telefono();
    String clase();
    
    int codigoDespacho() default -1;
    int codigoTaller() default -1;
    String perfil() default "";
    String categoria() default "";

}