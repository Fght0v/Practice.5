class Polygon(var points: MutableList<Point>) {
    fun getCordinates() {
        println("Polygon Coordinates:")
        points.forEach{ println("(${it.x1}, ${it.y1})") }
    }

    fun setCordinates(points: MutableList<Point>) { this.points = points }

    override fun toString(): String { return "Polygon($points)" }

    fun polygonInfo() {
        println("Polygon Info:")
        points.forEach{ println("(${it.x1}, ${it.y1})") }
    }

    fun moveOX(x: Int) {
        points.forEach { it.x1 += x }
    }

    fun moveOY(y: Int) {
        points.forEach { it.y1 += y }
    }

    fun moveXY(x: Int, y: Int) {
        moveOX(x)
        moveOY(y)
    }
}