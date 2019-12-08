Scanner scan = new Scanner(System.in)
println "What do you want to print ?"
String name = scan.nextLine() as String
println "Enter a number "
Integer FirstNumber = scan.nextLine() as Integer
println "Enter another number "
Integer SecondNumber = scan.nextLine() as Integer
Integer result = FirstNumber + SecondNumber
result.times {
    println name
}