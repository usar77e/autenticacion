package er.dan.autenticacion.controller;

import er.dan.autenticacion.model.Libro;
import er.dan.autenticacion.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("")
    public List<Libro> findAll(){
        return libroService.findAll();
    }

    @GetMapping("/{id}")
    public Libro findById(@PathVariable("id") Integer id){
        return libroService.findById(id);
    }

    @PostMapping
    public @ResponseBody Libro save(@RequestBody Libro libro){
        return libroService.save(libro);
    }

}
