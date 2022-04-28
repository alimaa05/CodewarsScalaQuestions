//Very simple, given an integer or a floating-point number, find its opposite.
//  Examples:
//  1: -1
//14: -14
//-34: 34

object OppositeNumber extends App{

  def opposite(number: Double): Double = {

    if (number == 0) 0
    else if (number < 0) -number
    else (-number)

  }

  println(opposite(-3.1458))
  println(opposite(9.89605764))


}


// OTHER WAY

//def opposite(number: Double): Double = -number