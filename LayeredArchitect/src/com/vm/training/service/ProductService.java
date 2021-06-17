package com.vm.training.service;

import java.util.Map;

import com.vm.training.bean.Product;
import com.vm.training.dao.IProductDAO;
import com.vm.training.dao.ProductDAO;

public class ProductService implements IProductService {

		IProductDAO productDao=new ProductDAO();
		@Override
		public Product getByProductID(int id) 
		{
			
			return productDao.getProductByID(id);
		}
		@Override
		public Map<Integer, Product> getAllProducts() {
			// TODO Auto-generated method stub
			return productDao.getAllProducts();
		}

	}

