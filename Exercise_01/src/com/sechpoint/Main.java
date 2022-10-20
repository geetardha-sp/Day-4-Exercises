package com.sechpoint;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer(1, "One");
		Employee employee = new Employee(2, "Two");
		
		for (Field field : customer.getClass().getDeclaredFields()) {
			if (field.isAnnotationPresent(JsonIgnore.class)) {
				JsonIgnore annotation = field.getAnnotation(JsonIgnore.class);
				System.out.println(annotation.ignoreJson());
			}
		}
		
		for (Method method : customer.getClass().getDeclaredMethods()) {
			if (method.isAnnotationPresent(JsonIgnore.class)) {
				JsonIgnore annotation = method.getAnnotation(JsonIgnore.class);
				System.out.println(annotation.ignoreJson());
			}
		}
		
		for (Field field : employee.getClass().getDeclaredFields()) {
			if (field.isAnnotationPresent(JsonIgnore.class)) {
				JsonIgnore annotation = field.getAnnotation(JsonIgnore.class);
				System.out.println(annotation.ignoreJson());
			}
		}
		
		for (Method method : employee.getClass().getDeclaredMethods()) {
			if (method.isAnnotationPresent(JsonIgnore.class)) {
				JsonIgnore annotation = method.getAnnotation(JsonIgnore.class);
				System.out.println(annotation.ignoreJson());
			}
		}
	}
}
