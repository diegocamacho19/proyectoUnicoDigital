package com.unicodigital.proyectounicodigital.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, Date> fecha;
	public static volatile SingularAttribute<Usuario, String> cedula;
	public static volatile SingularAttribute<Usuario, String> apellido;
	public static volatile SingularAttribute<Usuario, String> direccion;
	public static volatile SingularAttribute<Usuario, Long> id;
	public static volatile SingularAttribute<Usuario, String> telefono;
	public static volatile SingularAttribute<Usuario, String> nombre;

}

