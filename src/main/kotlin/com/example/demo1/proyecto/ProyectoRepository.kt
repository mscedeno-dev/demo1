package com.example.demo1.proyecto

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProyectoRepository : JpaRepository<Proyecto, Int> {
    fun findByNombreContainingIgnoreCase(nombre: String): List<Proyecto>

    fun devolverTodos(): List<Proyecto> = findAll()

    fun devolverUno(id: Int): Proyecto? = findById(id).orElse(null)

    fun crearProyecto(proyecto: Proyecto): Proyecto = save(proyecto)

    fun actualizarProyecto(proyecto: Proyecto): Proyecto = save(proyecto)

    fun eliminarProyecto(proyecto: Proyecto): Proyecto {
        deleteById(proyecto.id!!)
        return proyecto
    }
}
