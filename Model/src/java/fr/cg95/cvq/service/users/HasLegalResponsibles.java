package fr.cg95.cvq.service.users;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.sf.oval.configuration.annotation.Constraint;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Constraint(checkWith = HasLegalResponsiblesCheck.class)
public @interface HasLegalResponsibles {

    String message() default "legalResponsibles";

    String[] profiles() default {};

    String when() default "";
}
