object ValidPalindrome extends App{
  def isPalindrome(s: String): Boolean = {

    val stringReplace = (s.replaceAll("""\p{Punct}""", "").filterNot(_.isWhitespace).toLowerCase())

    println(stringReplace)
    if (stringReplace.reverse == stringReplace) true
    else false

  }
  println(isPalindrome("A man, a plan, a canal: Panama"))
}
