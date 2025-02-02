fun main() {
    val conjunto = ConjuntoLibros(10)

    val libro1 = Libro("El Quijote", "Cervantes", 500, 9)
    val libro2 = Libro("Cien Años de Soledad", "García Márquez", 400, 8)

    if (conjunto.agregarLibro(libro1)) {
        println("Libro1 añadido.")
    } else {
        println("No se pudo añadir Libro1.")
    }
    if (conjunto.agregarLibro(libro2)) {
        println("Libro2 añadido.")
    } else {
        println("No se pudo añadir Libro2.")
    }

    conjunto.mostrarConjunto()

    if (conjunto.eliminarPorTitulo("El Quijote")) {
        println("Libro eliminado por título.")
    } else {
        println("No se encontro libro con ese título.")
    }

    conjunto.mostrarConjunto()

    if (conjunto.eliminarPorAutor("García Márquez")) {
        println("Libro eliminado por autor.")
    } else {
        println("No se encontro libro con ese autor.")
    }

    conjunto.mostrarConjunto()

    val libro3 = Libro("Rayuela", "Cortázar", 300, 10)
    if (conjunto.agregarLibro(libro3)) {
        println("Libro3 añadido.")
    } else {
        println("No se pudo añadir Libro3.")
    }

    conjunto.mostrarConjunto()
    conjunto.mostrarMayorYMenorCalificacion()
}