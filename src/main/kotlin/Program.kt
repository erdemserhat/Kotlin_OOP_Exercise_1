fun main(){
    /**
     * Write a Kotlin object-oriented program that creates a base class Shape and derives subclasses Circle, Rectangle, and Triangle.
     * Implement appropriate methods in each class and demonstrate polymorphism.
     */

    abstract class Shape{
        abstract fun area():Double
        abstract fun perimeter():Double
    }

    class Circle(private val radius:Double):Shape(){
        override fun area(): Double {
            return Math.PI*radius*radius
        }

        override fun perimeter(): Double {
            return 2*Math.PI*radius
        }
    }

    class Rectangle(private val width:Double, private val height:Double):Shape(){
        override fun area(): Double {
            return width*height
        }

        override fun perimeter(): Double {
            return (height+width)*2
        }
    }

    class Triangle(private val side1:Double, private val side2:Double, private val side3:Double): Shape(){
        override fun area(): Double {
            val semiPerimeter = perimeter()/2;
            return Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3))

        }

        override fun perimeter(): Double {
            return side1+side2+side3
        }

    }


        val circle = Circle(5.0)
        val rectangle = Rectangle(7.0, 11.0)
        val triangle = Triangle(4.0, 5.0, 6.0)

        val shapes = listOf(circle, rectangle, triangle)

        for (shape in shapes) {
            println("Area: ${shape.area()}")
            println("Perimeter: ${shape.perimeter()}")
            println()
        }
    }



