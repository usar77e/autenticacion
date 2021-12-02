package er.dan.autenticacion.service.impl;

import er.dan.autenticacion.exception.ModeloNotFoundException;
import er.dan.autenticacion.model.Libro;
import er.dan.autenticacion.repository.LibroRepository;
import er.dan.autenticacion.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImpl implements LibroService {
    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libro> findAll() {
        return libroRepository.findAll();
    }

    @Override
    public Libro findById(Integer id) {
        Optional<Libro> op = libroRepository.findById(id);
        if(op.isPresent()){
            return op.get();
        }else{
            throw new ModeloNotFoundException("Libro no encontrado");
        }
    }

    @Override
    public Libro save(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public Libro update(Libro libro) {
        return save(libro);
    }

    @Override
    public boolean delete(Integer id) {
        libroRepository.deleteById(id);
        return true;
    }
}
