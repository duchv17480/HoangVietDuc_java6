package com.ph17480.api;

        import com.ph17480.entities.Product;
        import com.ph17480.service.ProductService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/products")
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping("{id}")
    public Product getOne(@PathVariable("id") Integer id){
        return productService.findById(id);
    }
    @GetMapping
    public List<Product> getAll(){
        return productService.findAll();

    }
    @PostMapping
    public Product post(@RequestBody Product product) {
        productService.create(product);
        return product;
    }
    @PutMapping("{id}")
    public Product put(@PathVariable("id") Integer id, @RequestBody Product product) {
        return productService.update(product);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id) {
        productService.delete(id);
    }
}
