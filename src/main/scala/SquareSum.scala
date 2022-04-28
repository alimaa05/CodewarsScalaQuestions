//Complete the square sum function so that it squares each number passed into it and then sums the results together.

//For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.



object SquareSum extends App{

  def squareSum(xs: List[Int]): Int = {
    var sum = 0
    if (xs.isEmpty) 0
    else {
      for (n <- xs) sum += n*n
    }
    sum
  }

println(squareSum(List(2,3,4)))

}

//OTHER WAYS
// def squareSum(xs: List[Int]): Int =
//    xs.map(x => x*x).sum