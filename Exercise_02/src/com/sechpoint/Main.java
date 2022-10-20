package com.sechpoint;

public class Main {
	public static void main(String[] args) {
		AsusLaptops asusLaptops = new AsusLaptops();
		RazerLaptops razerLaptops = new RazerLaptops();
		
		asusLaptops.showInformation();
		
		Class<?> reflectedClass = asusLaptops.getClass();
		GamingLaptop annotation = reflectedClass.getAnnotation(GamingLaptop.class);
		GamingLaptop gamingLaptop = (GamingLaptop) annotation;
		System.out.println(gamingLaptop.graphicsProcessor());
		System.out.println(gamingLaptop.graphicsMemory());
		
		System.out.println();
		
		razerLaptops.showInformation();
		
		reflectedClass = razerLaptops.getClass();
		annotation = reflectedClass.getAnnotation(GamingLaptop.class);
		gamingLaptop = (GamingLaptop) annotation;
		System.out.println(gamingLaptop.graphicsProcessor());
		System.out.println(gamingLaptop.graphicsMemory());
	}
}
