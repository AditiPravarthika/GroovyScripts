Scanner scan = new Scanner(System.in)
println "What do you want to print ?"
String name = scan.nextLine() as String
println "How many times you want to print ?"
Integer n = scan.nextLine() as Integer

n.times {
    println name
}
