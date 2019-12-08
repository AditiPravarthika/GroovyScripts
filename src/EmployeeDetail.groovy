//Employee details
Scanner scan = new Scanner(System.in)
println "Enter your ID"
Integer ID = scan.nextLine() as Integer
println "Enter your name"
String name = scan.nextLine() as String
println "Enter your designation"
String designation = scan.nextLine() as String
println "Enter your CTC"
Integer CTC = scan.nextLine() as Integer
println "Enter your Tax"
Integer Tax = scan.nextLine() as Integer
Integer Salary = CTC - Tax
Integer TakeHome = Salary / 12
println "Your monthly salary is " + TakeHome
if (TakeHome > 50000) {
    5.times {
        println "*"
    }
} else {
    3.times {
        println "*"
    }
}

