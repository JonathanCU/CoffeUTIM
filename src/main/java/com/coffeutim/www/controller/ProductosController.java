package com.coffeutim.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffeutim.www.model.Producto;
import com.coffeutim.www.repository.ProductoRepository;

@RestController
@RequestMapping("/products")
public class ProductosController {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@GetMapping("getAll")
	public List<Producto> getAllProducts(){
		return (List<Producto>) productoRepository.findAll();
	}
}
