import scala.:+
import scala.collection.mutable
//This time no story, no theory. The examples below show you how to write function accum:
//
//  Examples:
//accum("abcd") -> "A-Bb-Ccc-Dddd"
//accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//accum("cwAt") -> "C-Ww-Aaa-Tttt"
//The parameter of accum is a string which includes only letters from a..z and A..Z.


object Mumbling extends App {

  def accum(s: String): String = {

    val result = ""
    val split = s.split("-")

    for (i <- 0 until split.length) yield {
      val f = split.map(c => c.toUpperCase() + c.toLowerCase().repeat(i))
      result:+f

    }
    return result.mkString
  }

  println(accum("abed"))
}


//val result = ""
//val lowerStr = s.toLowerCase()
//
//for (i <- 0 until lowerStr.length by 1) yield {
//  var str = lowerStr(i).toUpper
//  for (j <- 0 until i by 1) {
//    str+=lowerStr(i)
//  }
//  result:+(str)
//}

//val t =
