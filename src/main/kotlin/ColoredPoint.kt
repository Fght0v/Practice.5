class ColoredPoint(x1: Int, y1: Int) : Point(x1, y1) {
    private var color: String = "Black"

    constructor(x1: Int, y1: Int, color: String) : this(x1, y1) { this.color = color }

    fun getColor() {  println("Color = ${ this.color }") }

    fun setColor(newColor: String) { color = newColor }

    override fun toString(): String { return "ColoredPoint($x1, $y1, $color)"  }

    fun colPointInfo() { println("Colored Point Info:($x1, $y1, $color)") }
}