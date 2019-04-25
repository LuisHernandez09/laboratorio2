package gt.edu.umg.ingenieria.sistemas.parcial2.inventario.controller;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.ProductoEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.inventario.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/buscarTodos")
    public List<ProductoEntity> buscarTodos() {
        
        return this.productoService.buscarTodos();
    }
    
    @PostMapping("/registrarProducto")
    public ProductoEntity registrar(@RequestBody(required=true)ProductoEntity productovar)
    {
         String name=productovar.getName();
        String description=productovar.getDescription();
        
        name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        description=description.substring(0,1).toUpperCase()+description.substring(1).toLowerCase();
        productovar.setName(name);
        productovar.setDescription(description);
        return this.productoService.registrar(productovar);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id){
   return this.productoService.eliminar(id);
    }
    
    @PutMapping("/actualizar/{id}")
    public ProductoEntity actualizar(@RequestBody(required=true)ProductoEntity productovar, @PathVariable Long id){
        return this.productoService.actualizar(productovar, id);
    }
    
    @GetMapping("/buscarId")
    public ProductoEntity buscarid(@RequestParam Long id){
    return this.productoService.buscarid(id);
    }
    
    
    
    
    
    
    
}
