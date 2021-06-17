package com.vm;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vm.dao.IProductDao;
import com.vm.entity.Product;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner{

	@Autowired
	IProductDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("spring application");
		
		Product product = new Product(100,"laptop","electronic",67000);
		
		dao.save(product);
		
		List<Product> pro = dao.findAll();
				
				pro.forEach(System.out::println);
				
//				dao.findById(100);
				
				Optional<Product> pro1 = dao.findById(110);
				if(pro1.isPresent()) {
					System.out.println(pro1.get().getId());
					System.out.println(pro1.get().getName());
					System.out.println(pro1.get().getPrice());
				}
				
				else {
					System.out.println("no product found");
				}
				
				List<Product> productcategory = dao.findByCategory("electronics");
				
				
		
		
		
	}

}
