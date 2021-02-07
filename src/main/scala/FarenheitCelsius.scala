import scala.io.StdIn.readLine

object FarenheitCelsius extends App {
println("This program is going to calculates Fahrenheit to Celsius.")
  val valueFaren = readLine(s"Please enter the value of Fahrenheit:").toFloat
  val valueCels= (valueFaren -32)*5/9
  println(s"${valueFaren.round} degrees of Fahrenheit are equal to ${valueCels.round} degrees of Celsius ")
}
