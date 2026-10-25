package com.example.demo1.proyecto

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.PositiveOrZero

@Entity
@Table(name = "projects")
class Proyecto(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @field:NotBlank
    var nombre: String = "",

    var descripcion: String? = null,

    @field:PositiveOrZero
    var precio: Double = 0.0,
)
