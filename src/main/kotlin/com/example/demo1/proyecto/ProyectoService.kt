package com.example.demo1.proyecto

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProyectoService {
    @Autowired
    lateinit var proyectoRepository: ProyectoRepository

    fun listar(nombre: String?): List<Proyecto> {
        return if (nombre == null) proyectoRepository.devolverTodos() else proyectoRepository.findByNombreContainingIgnoreCase(nombre)
    }

    fun obtener(id: Int): Proyecto? {
        return proyectoRepository.devolverUno(id)
    }

    fun crear(proyecto: Proyecto): Proyecto {
        return proyectoRepository.crearProyecto(proyecto)
    }

    fun actualizar(proyecto: Proyecto): Proyecto {
        return proyectoRepository.actualizarProyecto(proyecto)
    }

    fun eliminar(id: Int): Proyecto {
        val proyecto = proyectoRepository.devolverUno(id)
        return proyectoRepository.eliminarProyecto(proyecto!!)
    }
}
