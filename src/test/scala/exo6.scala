class exo6 {

  def average(values : Iterator[Double]): Option[Double] = {
    val values1 = values.map(x => (x, 1))
    val pairs = values1.reduce((x, y) => (x._1 + y._1, x._2 + y._2))
    val avg = pairs._1 / pairs._2.toFloat
    return(Some(avg))
  }

}

average(Iterator(5.2, 6.3, 2.2))
