//Import that StdIN module to read the users input.
import scala.io.StdIn

object RepaymentCalculator {
    def main(args: Array[String]): Unit = {
        //Application Title
        println("Welcome to my Mortgage Repayment Calculator")
        
        //Enter the total mortgage amount
        println("Enter the mortgage amount: (E.g 140000)")
        val mortgage = stdIn.readInt()

        //Enter the annual Interest %
        println("Enter the annual interest %: (E.g 4.5)")
        val annualInterest = stdIn.readDouble()

        //Enter the duration of the mortgage
        println("What is the duration in years? (E.g 20)")
        val duration =stdIn.readInt()

        val monthlyInterest = mortgage * (annualInterest / 100)

        //1 - math.pow? 1+ monthlyInterest ? Unsure, will come back later.
        val durationMonths = duration * 12
        val interestDue = annualInterest / durationMonths
        val monthlyPayment = durationMonths + interestDue

        println(s"Initial Amount Borrowed: $mortgage")
        println(s"Annual Interest: $annualInterest")
        println(s"Monthly Payment Amount: $monthlyPayment")

    }
}