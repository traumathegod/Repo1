object Esempio1 {



    def max(interi: Array[Int]): Int = {
      var massimo : Int = interi(0)
      interi.foreach(intero => if (intero > massimo) massimo = intero)
      massimo
    }

    def main(args: Array[String]): Unit = {
      args.foreach(arg => println(arg))
      println("Max is " + max(args.map(_.toInt)))
    }

}
