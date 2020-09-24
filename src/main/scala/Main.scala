import scala.io.StdIn._

// https://atcoder.jp/contests/practice/tasks/practice_1
object Main extends App{
  val a = readInt
  val num = readLine
  val s = readLine
  val sum = a + num.split(" ")(0).toInt + num.split(" ")(1).toInt
  println(sum + " " + s)
}
