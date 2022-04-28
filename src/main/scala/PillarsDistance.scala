// There are pillars near the road. The distance between the pillars is the same and the width of the pillars is the same. Your function accepts three arguments:
//
// number of pillars (≥ 1);
// distance between pillars (10 - 30 meters);
// width of the pillar (10 - 50 centimeters).
// Calculate the distance between the first and the last pillar in centimeters (without the width of the first and last pillar).

object PillarsDistance extends App{
  def distance(num_pill: Int, dist: Int, width: Int ): Int = {



    val pillarsDistance = (num_pill -1) * 100 * dist
    val pillarWidth = (num_pill -2) * width
    val totalDistance = pillarsDistance + pillarWidth

    if (num_pill <=1)0
    else totalDistance

  }


  println(distance(2,20,25))
}
