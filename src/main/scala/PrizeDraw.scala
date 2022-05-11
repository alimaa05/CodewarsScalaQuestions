object PrizeDraw extends App{

    def nthRank(st: String, we: Array[Int], n: Int): String = {
      val alphabet = " abcdefghijklmnopqrstuvwxyz"
      val nameArr = st.split(",")
      var sumList = List[Int]()

      if (st.isEmpty) return "No participants"
      else if (n > nameArr.length) return "Not enough participants"
      else {

        for {
          i <- nameArr.indices
        } yield {
          var sum = 0
          for (individualLetter <- nameArr(i).toLowerCase) yield {
            sum += alphabet.indexOf(individualLetter)
          }
          sum += nameArr(i).length
          sum = sum * we(i)
          sumList = sumList.appended(sum)
        }
        val sumListSorted = sumList.sorted.reverse
        val winningNum = sumListSorted(n - 1)
        val winningIndex = sumList.indexOf(winningNum)
        val winningIndexSorted = sumListSorted.indexOf(winningNum)

        var winningIndices = List[Int]()
        var winningNames = List[String]()
        val actualWinnerIndex = n - 1 - winningIndexSorted
        for (x <- sumList.indices) yield {
          if (sumList(x) == winningNum) winningIndices = winningIndices.appended(x)
        }
        for (y <- winningIndices) yield {
          winningNames = winningNames.appended(nameArr(y))
        }
        winningNames = winningNames.sorted
        winningNames(actualWinnerIndex)
      }
    }

    //  println(nthRank("Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden", Array(1, 3, 5, 5, 3, 6), 2))
    println(nthRank("Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", Array(4, 2, 1, 4, 3, 1, 2), 4))
  }

// SIMPLER SOLUTIONS

//object PrizeDraw {
//
//  val alphabet = ('a' to 'z').zipWithIndex.toMap.mapValues(_+1)
//
//  def nthRank(str: String, we: Array[Int], n: Int): String =
//    str match {
//      case "" => "No participants"
//      case _ =>
//        str
//          .split(",")
//          .zip(we)
//          .sortBy { case (name, weight) => (-weight * (name.size + name.toLowerCase.map(alphabet).sum), name) }
//          .map(_._1)
//          .lift(n-1)
//          .getOrElse("Not enough participants")
//    }
//}


//object PrizeDraw {
//  def nthRank(st: String, we: Array[Int], n: Int): String = {
//    if (st.isEmpty) return "No participants"
//    val names = st.split(",")
//    if (n > names.length) return "Not enough participants"
//    names
//      .zip(we)
//      .map { case (name, weight) => (name, (name.length + name.toLowerCase.map(_.toInt - 96).sum) * weight) }
//      .sortWith { case ((n1, w1), (n2, w2)) => if (w1 == w2) n2 > n1 else w1 > w2 }
//      .apply(n - 1)
//      ._1
//  }
//}