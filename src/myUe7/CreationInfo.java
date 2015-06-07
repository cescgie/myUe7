package myUe7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CreationInfo {

	String author() default "MY AUTHOR";
	String description();
	String[] tags() default {};
	Class<?> baseclass() default Object.class;
}