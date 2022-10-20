package com.ies.genericos;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Esta anotacion pasa el valor al método para ejecutarse
 * @author usuario
 *
 */

//Creando la anotación
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
public @interface MiAnotacion{  
	int valor();  
}  
