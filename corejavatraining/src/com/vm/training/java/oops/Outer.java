package com.vm.training.java.oops;

	class Outer {
	
		static 	int i = 100;
	
		void show() {
		System.out.println(i);
		
	}


		class Inner {
			int a = 200;
			void display() {
		show();
		System.out.println(i);
		
			}
		}
	}
