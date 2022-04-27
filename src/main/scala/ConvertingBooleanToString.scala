object ConvertingBooleanToString extends App{

  def boolToWord(boolean: Boolean): String =
  // 'boolean' in parenthesis bec thats the name which has type Boolean
  // default for boolean is true
    if (boolean) return("Yes")
    // if its not true then its false and will return 'No'
    else return ("No")

  println(boolToWord(boolean = true))
  println(boolToWord(boolean = false))



}


