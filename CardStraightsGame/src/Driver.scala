

object Driver {
  def main(args: Array[String]): Unit = {
    val sample1 = Array(0, 6, 5, 10, 3, 0, 11)
    val sample2 = Array(100, 100, 100, 101, 100, 99, 97, 103)
    val sample3 = Array(0, 0, 0, 1, 2, 6, 8, 1000)
    val sample4 = Array(1, 9, 5, 7, 3, 4, 0, 0, 0, 10)

    println(CardStraights.longestStraight(sample1))
    println(CardStraights.longestStraight(sample2))
    println(CardStraights.longestStraight(sample3))
    println(CardStraights.longestStraight(sample4))
  }
}