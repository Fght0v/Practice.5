fun main() {
    //Point
    val p = Point(1, 2)
    println(p)
    p.getCordinates()
    p.setCordinates(3, 4)
    p.pointInfo()
    println(p)
    println()

    //Colored Point
    val p1 = ColoredPoint(1, 2, "Red")
    println(p1)
    p1.getCordinates()
    p1.setCordinates(3, 4)
    p1.getColor()
    p1.setColor("Green")
    p1.getColor()
    p1.colPointInfo()
    println(p1)
    println()

    //Line
    val l = Line(Point(1, 2), Point(3, 4))
    println(l)
    l.getCordinates()
    l.setCordinates(Point(5, 6), Point(7, 8))
    l.getCordinates()
    l.lineInfo()
    println()

    //Colored Line
    val l1 = ColoredLine(Point(1, 2), Point(3, 4), "Red")
    println(l1)
    l1.getCordinates()
    l1.setCordinates(Point(5, 6), Point(7, 8))
    l1.getCordinates()
    l1.getColor()
    l1.setColor("Green")
    l1.getColor()
    l1.colLineInfo()
    println(l1)
    println()

    //Polygon
    val pointSex: MutableList<Point> = mutableListOf<Point>(
        Point(1,2), Point(3,4),
        Point(5,6), Point(7,8),
        Point(9,10), Point(11,12))

    val pointSexi: MutableList<Point> = mutableListOf<Point>(
        Point(1,1), Point(1,1),
        Point(1,1), Point(7,8),
        Point(9,10), Point(11,12))

    val polygon = Polygon(pointSex)
    polygon.polygonInfo()
    polygon.moveOX(2)
    polygon.moveOY(10)
    polygon.polygonInfo()
    polygon.moveXY(5, 5)
    polygon.polygonInfo()
    polygon.setCordinates(pointSexi)
    polygon.polygonInfo()
    polygon.getCordinates()
}