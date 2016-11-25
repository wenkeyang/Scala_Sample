

object AdditionGame {
  def getMaximumPoints(cards: Array[Int], times: Int): Int = {

    var tempArray = cards
    var tempTimes = times

    var finalScore = 0

    while (tempTimes > 0 && !tempArray.isEmpty) {

      tempArray = tempArray.sortWith((_ > _))

      finalScore += tempArray.head

      tempArray.update(0, tempArray.head - 1)

      tempTimes -= 1

      tempArray = tempArray.dropWhile(_ == 0)

    }

    finalScore
  }
}