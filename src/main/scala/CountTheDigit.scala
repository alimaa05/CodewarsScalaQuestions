object CountTheDigit extends App {

  def nbDig(n: Int, d: Int) = {
    val myList = List.range(0, n + 1)
    var count = 0
    val squareslist = myList.flatMap(e => Math.pow(e, 2).toInt.toString)

    for {square <- squareslist
         if square.toString.map(_.asDigit).contains(d)} yield {
      count += 1
    }

    count
  }
  println (nbDig(5750, 0))

}

// THIS ALSO WORKS
//  def nbDig(n: Int, d: Int) = {
//    val myList = List.range(0, n + 1)
//    val squareslist = myList.flatMap(e => Math.pow(e, 2).toInt.toString)
//    println(squareslist)
//    val filteredlist = squareslist.filter(el => el.toString.contains(d.toString))
//    val filteredlistlength = filteredlist.length
//    filteredlistlength
//  }
//  println (nbDig(5750, 0))



