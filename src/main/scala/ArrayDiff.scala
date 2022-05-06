
//Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

//It should remove all values from list a, which are present in list b keeping their order.
//
// arrayDiff(Seq(1, 2), Seq(1)) == Seq(2)
// If a value is present in b, all of its occurrences must be removed from the other:
//
//  arrayDiff(Seq(1, 2, 2, 2, 2, 2, 3), Seq(2)) == Seq(1, 3)


object ArrayDiff extends App {

  def arrayDiff(a: Seq[Int], b: Seq[Int]): Seq[Int]  = {

    if (b.isEmpty) a
    else if (a.isEmpty) a
    else for (n <- 0 until a.length) yield {
      return (a diff b) diff b
    }
  }
  println(arrayDiff(Seq(1,1,2), Seq(1)))
  }









//if (b.isEmpty) a
//else if (a.isEmpty) a
//else {
//  for (n <- 0 until b.length) yield {
//
//  }
//
//}


//BEST ONE SO FAR

//def arrayDiff(a: Seq[Int], b: Seq[Int]): Any = {
//
//
//  if (b.isEmpty) a
//  else if (a.isEmpty) a
//  else {
//    for (n <- 0 until b.length) yield
//      return a.diff(b)
//  }
//}




//def arrayDiff(a: Seq[Int], b: Seq[Int]): Any = {
//
//  val seq = a
//  val seq2 = b
//
//  if (b.isEmpty) a
//  else if (a.isEmpty) a
//  else {
//    for (seq1 <- seq if seq1.until(b)) yield {
//      a.diff(b)
//    }
//  }
//
//}