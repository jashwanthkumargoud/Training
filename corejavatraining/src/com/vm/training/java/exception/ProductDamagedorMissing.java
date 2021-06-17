package com.vm.training.java.exception;

public class ProductDamagedorMissing extends Exception{

	public static void main(String[] args) {
		
		String msg1;

			ProductDamagedorMissing(String msg1){
			this.msg1 = msg1;
			
		}
		public String toString() {
			return msg1;
			
		}
		

	}

	