import java.lang.Exception

class Triangle (
    private var _soleLength:Int,
    private var _high:Int):Shape() {
     var soleLength=_soleLength
        get(){return  field}
        set(value) {if (value>0) field=value else throw Exception("Sole Length must be bigger than zero")
        }

     var high:Int=_high
         get() {return  field}
         set(value) {
             if (value>0) field=value else throw Exception("high Length must be bigger than zero")
         }

    override fun calculateArea(): Float {
        return (soleLength*high).toFloat()/2
    }

    override fun calculatePerimeter(): Float {
        return soleLength.toFloat()*3
    }
}