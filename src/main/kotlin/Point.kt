open class Point(var x1: Int, var y1: Int) {
    open fun getCordinates() { println("Point Coordinates:($x1, $y1)") }

    open fun setCordinates(x1: Int, y1: Int) { this.x1 = x1; this.y1 = y1 }

    override fun toString(): String { return "Point($x1, $y1)" }

    fun pointInfo() { println("Point Info:($x1, $y1)") }
}