class Libro(
    var titulo: String,
    var autor: String,
    var numPaginas: Int,
    var calificacion: Int
) {
    override fun toString(): String {
        return "Libro(titulo='$titulo', autor='$autor', paginas=$numPaginas, calificacion=$calificacion)"
    }
}