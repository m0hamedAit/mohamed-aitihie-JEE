package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)   //Annotations are to be recorded in the class file by the compiler and retained by the VM at runtime, so they may be read reflectively
@Target(ElementType.TYPE)
public @interface Component {
    String name() default "";
}
