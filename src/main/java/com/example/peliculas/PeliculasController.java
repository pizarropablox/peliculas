package com.example.peliculas;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PeliculasController {
    private List<Peliculas> peliculas = new ArrayList<>();
    
    public PeliculasController(){
        //Inicializar la lista con datos

        peliculas.add(new Peliculas(1, "mid90s", 2018, "Jonah Hill", "Drama", "La vida de un niño skater"));
        peliculas.add(new Peliculas(2, "Terminator 2", 1991, "James Cameron", "ciencia ficcion", "Un robot del futuro viene a salvar a jhon connor"));
        peliculas.add(new Peliculas(3, "El rey Leon", 1994, "Rob Minkoff Roger Allers", "Animacion", "La historia de un leon llamado mufasa y su hijo simba"));
        peliculas.add(new Peliculas(4, "the Lost Boys", 1987, "Joel Schumacher", "ciencia ficcion", "La vida y la muerte de unos jovenes vampiros punks"));
        peliculas.add(new Peliculas(5, "supreme cherry", 2014, "Wiliams Strobeck", "skateboarding", "La mejor pelicula de skate de todos los tiempos"));
    }

    @GetMapping("/peliculas")
    public List<Peliculas>getPeliculas(){
        return peliculas;
    }

    @GetMapping("/peliculas/{id}")
    public Peliculas getPeliculasById(@PathVariable int id) {
        for (Peliculas peliculas : peliculas){
            if(peliculas.getId()==id){
                return peliculas;
            }
        }
        return null;
    }
    
    

    
}
