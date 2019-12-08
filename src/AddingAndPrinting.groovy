Scanner scan = new Scanner (System.in)
println "Enter your name"
String name = scan . nextLine()as String
println "Enter a number"
int a = scan . nextLine()as int
println "Enter another number"
int b = scan . nextLine()as int
println "Your answer is"
int result = a + b
result.times {
    println name
}