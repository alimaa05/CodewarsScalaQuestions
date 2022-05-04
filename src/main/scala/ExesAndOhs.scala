
//Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive.
// The string can contain any char.

//Examples input/output:
//XO("ooxx") => true
//XO("xooxx") => false
//XO("ooxXm") => true
//XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//XO("zzoo") => false

object ExesAndOhs extends App {

  def xo(str: String): Boolean = {

    val x = str.count(_ == 'x') | str.count(_=='X')
    val o = str.count(_ == 'o') | str.count(_ == 'O')


    if (str.isEmpty) true
    else if (x == o) true
    else (x < o)

  }
  println(xo("xxxoo"))

}



//      val countO = str.count( == 'o') | str.count( =='O')
//      val countX = str.count( == 'x') | str.count( =='X')
//      val emptyString: Boolean = str.isEmpty
//
//      countO == countX &&  str.contains("""x""") && str.contains("""o""") || str.contains("""X""") && str.contains("""O""") && emptyString



//if (str.isEmpty) true
//else {
//  for (i <- 0 until(str.length) i+1) yield {
//
//    if (x == "x") {
//      x + 1
//    } else if (o == "o") {
//      o + 1
//    }
//    //        return x == o
//  }
//}

//
//val countX = str.count(x == o)
//val countO = str.count(o)
//
//
//if (str.isEmpty) true
//else if (str.count(x==o)
//else (x != o)


//if (str.isEmpty) true
//else if ((str.toLowerCase() == "x") || (str.toLowerCase() == "o")) true
//else false