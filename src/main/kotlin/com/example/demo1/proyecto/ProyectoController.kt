package com.example.demo1.proyecto

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProyectoController {
    @Autowired
    lateinit var proyectoService: ProyectoService

    @GetMapping(value = ["/proyectos"])
    fun obtenerProyectos(): List<Proyecto> {
        return proyectoService.listar(null)
    }

    @GetMapping(value = ["/proyecto/{id}"])
    fun obtenerProyecto(@PathVariable id: Int): Proyecto? {
        return proyectoService.obtener(id)
    }

    @PostMapping(value = ["/proyecto"])
    fun crearProyecto(@RequestBody proyecto: Proyecto): Proyecto {
        return proyectoService.crear(proyecto)
    }

    @PutMapping(value = ["/proyecto"])
    fun actualizarProyecto(@RequestBody proyecto: Proyecto): Proyecto {
        return proyectoService.actualizar(proyecto)
    }

    @DeleteMapping(value = ["/proyecto/{id}"])
    fun eliminarProyecto(@PathVariable id: Int): Proyecto {
        return proyectoService.eliminar(id)
    }
}
