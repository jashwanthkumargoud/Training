package com.vm.training.dao;

import java.util.Map;

import com.vm.training.bean.Product;

public interface IProductDAO 
{
	Product getProductByID(int id);
	Map<Integer,Product> getAllProducts();
}