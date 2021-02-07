import scala.io.StdIn.readLine

object CelsiusFahren extends App {
    println("This program is going to calculates Celsius to Fahrenheit.")
    val valueCelsius = readLine(s"Please enter the value of Celsius:").toFloat
    val valueFahren= valueCelsius *1.800 +32
    println(s"${valueCelsius.round} degrees of Celsius are equal to ${(valueFahren * 100).round /100.toDouble} degrees of Fahrenheit")
  }

