object SumofPositive extends App{


  //  You get an array of numbers, return the sum of all of the positives ones.
  //
  //  Example [1,-4,7,12] => 1 + 7 + 12 = 20
  //
  //  Note: if there is nothing to sum, the sum is default to 0.
  def sumOfNum(num: Array[Int]): Int = {

    var sum = 0
    if (num.isEmpty) 0
    else {
      for (n <- num) if (n > 0) sum += n
    }
    sum

  }
  println(sumOfNum(Array(1,2,-3,4)))

}
