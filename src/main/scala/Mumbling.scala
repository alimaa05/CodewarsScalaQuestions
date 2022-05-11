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

    def accum(s: String) = {
      val sArr = s.toLowerCase.split("")
      var result = ""
      var substring = ""
      for (i <- sArr.indices) yield {
        substring = (s"${sArr(i)}" * (i+1)).capitalize
        //      if (i < sArr.length - 1) result += s"${substring}-"
        //      else if (i == sArr.length - 1) result += s"${substring}"
        result += substring + "-"
      }
      result.substring(0, result.length-1)
    }
  println(accum("abcd"))
  }


//for (i <- 0 until s.length by 1) yield {
//  s.split("-").map(c => c.toUpperCase() + c.toLowerCase().repeat(i)).mkString
//}


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



//    val result = ""
//    val split = s.split("-")
//
//    for (i <- 0 until split.length) yield {
//      val a = split.map(s => s.toUpperCase() + s.toLowerCase().repeat(1))
//      result:+a
//
//    }
//    return result.mkString