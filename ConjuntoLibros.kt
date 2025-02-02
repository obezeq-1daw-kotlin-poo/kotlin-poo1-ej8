class ConjuntoLibros(capacidad: Int) {
    private val libros: Array<Libro?> = arrayOfNulls(capacidad)
    private var total: Int = 0

    fun agregarLibro(libro: Libro): Boolean {
        if (total >= libros.size) {
            return false
        }
        // Comprobar si ya existe un libro con el mismo título y autor
        for (i in 0 until total) {
            if (libros[i] != null) {
                if (libros[i]!!.titulo == libro.titulo && libros[i]!!.autor == libro.autor) {
                    return false
                }
            }
        }
        libros[total] = libro
        total++
        return true
    }

    fun eliminarPorTitulo(titulo: String): Boolean {
        for (i in 0 until total) {
            if (libros[i] != null && libros[i]!!.titulo == titulo) {
                eliminarElemento(i)
                return true
            }
        }
        return false
    }

    fun eliminarPorAutor(autor: String): Boolean {
        for (i in 0 until total) {
            if (libros[i] != null && libros[i]!!.autor == autor) {
                eliminarElemento(i)
                return true
            }
        }
        return false
    }

    private fun eliminarElemento(indice: Int) {
        for (i in indice until total - 1) {
            libros[i] = libros[i + 1]
        }
        libros[total - 1] = null
        total--
    }

    fun mostrarMayorYMenorCalificacion() {
        if (total == 0) {
            println("No hay libros en el conjunto.")
            return
        }
        var libroMayor: Libro = libros[0]!!
        var libroMenor: Libro = libros[0]!!
        for (i in 1 until total) {
            val libroActual = libros[i]!!
            if (libroActual.calificacion > libroMayor.calificacion) {
                libroMayor = libroActual
            }
            if (libroActual.calificacion < libroMenor.calificacion) {
                libroMenor = libroActual
            }
        }
        println("Libro con mayor calificacion: " + libroMayor)
        println("Libro con menor calificacion: " + libroMenor)
    }

    fun mostrarConjunto() {
        if (total == 0) {
            println("El conjunto esta vacio.")
        } else {
            println("Contenido del conjunto:")
            for (i in 0 until total) {
                println(libros[i])
            }
        }
    }
}