package com.api.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.example.models.Cart;
import com.api.example.models.Product;

import io.swagger.annotations.ApiOperation;

/**
 * Endpoints da API REST para manipular a classe Product
 * 
 *  1 - POST: criar um novo produto
 *  2 - GET: buscar um produto
 *  3 - GET: listar produtos
 *  4 - PUT: atualizar um produto
 *  5 - DELETE: remover um produto
 */

@RestController
@CrossOrigin(origins = "*")
public class ProductServiceController {
    
    private static List<Product> products = new ArrayList<Product>();

    private static Cart cart;

    static {

        products.add(new Product(0, "Shampoo Canino", 35.00, "Shampoo para cachorro gourmet"));
        products.add(new Product(1, "Shampoo Felino", 38.00, "Shampoo para gato gourmet"));
        products.add(new Product(2, "Bolinha de borracha", 15.00, "Brinquedo para cachorro"));
        products.add(new Product(3, "Remédio Canino", 30.00, "Remédio para cachorro nutella"));
        products.add(new Product(4, "Roupinha de cachorro", 105.00, "Roupinha de cachorro friorento"));

    }


    //Pesquisando um produto por Id
    @ApiOperation(value = "Buscando um produto por Id")
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getProduct(@PathVariable("id") int id){

        return new ResponseEntity<>(products.get(id), HttpStatus.OK);

    }

    @ApiOperation(value = "Adicionar um novo produto")
    @RequestMapping(value = "/products", method = RequestMethod.POST, produces="application/json", consumes="application/json")
    public ResponseEntity<Object> createProduct(@RequestBody Product product){

        System.out.println("-------->> Product:");
        System.out.println(product);

        products.add(product);
        return new ResponseEntity<>("Produto inserido com sucesso!", HttpStatus.OK);

    }

    //Pesquisando um produto por Id
    // @RequestMapping(value = "/products/{id}")
    // public ResponseEntity<Object> getProduct(@PathVariable("id") int id){

    //     return new ResponseEntity<>(products.get(id), HttpStatus.OK);

    // }

    //Listando todos os produtos
    @ApiOperation(value="Listar todos os produtos")
    @RequestMapping(value = "/products",method = RequestMethod.GET, produces="application/json")
    public ResponseEntity<Object> getProducts(){
        return new ResponseEntity<>(products,HttpStatus.OK);
    }

    //Atualizando um produto por Id
    @ApiOperation(value = "Atualizar informações de um produto")
    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT, produces="application/json", consumes="application/json")
    public ResponseEntity<Object> updateProduct(@PathVariable("id") int id, @RequestBody Product product){

        products.remove(id);
        product.setId(id);
        products.add(product);

        return new ResponseEntity<>("Produto atualizado com sucesso!", HttpStatus.OK);

    }

    //Removendo um produto por Id
    @ApiOperation(value = "Excluir um produto")
    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE, produces="application/json")
    public ResponseEntity<Object> deleteProduct(@PathVariable("id") int id){

        products.remove(id);
        return new ResponseEntity<>("Produto removido com sucesso!", HttpStatus.OK);

    }

    @ApiOperation(value = "Criar novo carrinho")
    @RequestMapping(value = "/cart", method = RequestMethod.POST, produces="application/json")
    public ResponseEntity<Object> createCart(@RequestBody int id){
        cart = new Cart(id);
        return new ResponseEntity<>("Carrinho criado com sucesso!", HttpStatus.OK);
    }

}
