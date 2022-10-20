package com.sechpoint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface GamingLaptop {
	String graphicsProcessor() default "Intel Iris Graphics 540";
	String graphicsMemory() default "32GB";
}
