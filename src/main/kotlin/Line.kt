open class Line(var Point1: Point,var Point2: Point) {

    open fun getCordinates() { println("Line Coordinates:(${Point1.x1}, ${Point1.y1}; ${Point2.x1}, ${Point2.y1})") }

    fun setCordinates(Point1: Point, Point2: Point) { this.Point1 = Point1; this.Point2 = Point2 }

    override fun toString(): String { return "Line($Point1, $Point2)" }

    fun lineInfo() { println("Line Info:(${Point1.x1}, ${Point1.y1}; ${Point2.x1}, ${Point2.y1})") }
}