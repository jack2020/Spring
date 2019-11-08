package com.bridgelabz.iocdemo;

public class Vodafone implements Sim{

	@Override
	public void calling() {
        System.out.println("Voda Call");
		
	}

	@Override
	public void data() {
		System.out.println("Voda Data");
		
	}
	

}
