package com.vm.training.service;

import java.util.Map;

import com.vm.training.bean.Product;

public interface IProductService {
	Product getByProductID(int id);
	Map<Integer,Product> getAllProducts();
}