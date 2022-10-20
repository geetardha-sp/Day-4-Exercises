package com.sechpoint;

@GamingLaptop(graphicsProcessor="Core X eGPU", graphicsMemory="64GB")
public class RazerLaptops implements Laptops {
	@Override
	public void showInformation() {
		System.out.println("I am a powerful gaming laptop (Razer)");
	}
}
