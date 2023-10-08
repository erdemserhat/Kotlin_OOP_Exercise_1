import java.lang.Exception

class Rectangle(
    private var _shortSide:Int,
    private var _longSide:Int):Shape() {

    var shortSide:Int=_shortSide
        get(){return field}
        set(value){if(value>0) field=value else throw Exception("sides should bigger than zero")
        }
    var longSide:Int=_longSide
        get(){return field}
        set(value){if(value>0) field=value else throw Exception("sides should bigger than zero")
        }

    override fun calculateArea(): Float {
        return (shortSide+longSide).toFloat()*2
    }

    override fun calculatePerimeter(): Float {
        return longSide*shortSide.toFloat()
    }
}