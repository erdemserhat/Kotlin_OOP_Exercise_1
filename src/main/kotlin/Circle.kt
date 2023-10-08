import java.lang.Exception

class Circle(
    private var _radius:Float
):Shape() {
    var radius:Float=_radius
        get()=field
        set(value) = if (value>0) field=value else throw Exception("radius should  be bigger than zero")

    override fun calculateArea(): Float {
        return 2*super<Shape>.piNumber*radius
    }

    override fun calculatePerimeter(): Float {
      return super<Shape>.piNumber*radius*radius
    }

}