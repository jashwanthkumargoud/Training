package com.vm.training.java.string;

public class Sbb {

	public static void main(String[] args) {
		
		String c = " We are comparing the content with a StringBuffer content ";
		StringBuffer sb = new StringBuffer(" We are comparing the content with a StringBuffer content ");
		
				
				if(c.contentEquals(sb)){
					System.out.println(" The content is Equal ");
					
				}
				else {
					System.out.println(" The content is not equal ");
					
				}
		StringBuffer asb = new StringBuffer(" You cannot compare with a String content ");
		if(c.contentEquals(asb)) {
			System.out.println(" The content is equal ");
		}
		else {
			System.out.println(" The content is not equal ");
		}

	}

}
