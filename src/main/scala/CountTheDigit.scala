object CountTheDigit extends App {

  def nbDig(n: Int, d: Int): Int = {
    val myList = List.range(0, n + 1)
    // List.range - creating a List from a range, starting from 0 upto n + 1 (need + 1 bec its not inclusive)
    var count = 0
    // we want to work out the count so we set a variable 'count' as 0 to start with
    val squareslist = myList.flatMap(e => Math.pow(e, 2).toInt.toString)
    // initialising a new variable 'squareList' which will use the flatMap method on the 'myList' variable
    // flatMap similar to Map method
    // it returns a new array but here the inner groupings of an item are removed and a sequence is generated
    // its a combo of Map method and flatten method
    // Map method converts one collection to another by applying a function to all elements in the first collection
    // flatten method collapses the elements of a collection to create single collenction with elements of the same type

    // the new array is called e and the function we apply to each element is Math.pow()
    // Math.pow() function accepts two variables - used when you want the power/exponent of a value
    // first the number and second the power of the number up to which data exponenet is to be found i.e. the power value
    // it returns the base raise to the power of exponent
    //.toInt converts it to an Interger
    // .toString converts it into a String
    for {square <- squareslist
         if square.toString.map(_.asDigit).contains(d)} yield {
      count += 1
    }
    // <- is used within for comparisons, on the right is the generator (its an instance of a type with a foreach method),
    // generates the elements that the for will loop over i.e. the bit on the left which is the placeholder

    // if condition, convert elements in 'square' to a String and map each element
    // _ is symbol sometimes called syntactic sugar - makes the code look better and shorter
    // _ used as a placeholder for one or more parameters
    // .asDigit method used to represent characters in the form of digit - return type is an Int
    // .contains - see if it contains the arg d
    // yield converts a statement into an expression
    // for each iteration of for loop, yield generates a value thats remembered by the for loop
    // each time we iterate over the loop want to add 1 to the count
    count
    // want to return the count
  }
  println(nbDig(5750, 0))
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



