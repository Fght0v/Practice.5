class ColoredLine(Point1: Point, Point2: Point) : Line(Point1, Point2) {
    private var color: String = "Black"

    constructor(Point1: Point, Point2: Point, color: String) : this(Point1, Point2) { this.color = color }

    fun getColor() {  println("Color = ${ this.color }") }

    fun setColor(newColor: String) { color = newColor }

    override fun toString(): String { return "Colored Line($Point1, $Point2, $color)" }

    fun colLineInfo() { println("Colored Line Info:(${Point1.x1}, ${Point1.y1}; ${Point2.x1}, ${Point2.y1} ; $color)") }
}