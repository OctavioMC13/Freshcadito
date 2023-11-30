package com.example.landsoft.CategoriaBack.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.landsoft.CategoriaBack.model.Compra;
import com.example.landsoft.CategoriaBack.model.Producto;
import com.example.landsoft.CategoriaBack.service.CompraService;
import com.example.landsoft.CategoriaBack.service.ProductoService;

public class CompraRest {
	
	private ResponseEntity<List<Producto>> getAllProductosByCategoria(int idCategoria){
		return null;
		
	}
	
	public double calcularTotalVenta(Compra compra) {
        double precioPorKilo = compra.getPrecio_kilo();
        double kilos = compra.getPeso();

        double total = precioPorKilo * kilos;

        return total;
    }

}
