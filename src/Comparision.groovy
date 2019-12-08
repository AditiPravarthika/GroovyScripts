//Comparing 2 numbers and string Scanner scan = new Scanner(System.in)
Scanner scan = new Scanner(System.in)
println "Enter a number"
int a = scan.nextLine() as Integer
println "Enter another number"
int b = scan.nextLine() as Integer

if (a == b) {
    println "The numbers are equal"
} else {
    println "The numbers are not equal"
}

println "Enter a string"
String String1 = scan.nextLine() as String
println "Enter another string"
String String2 = scan.nextLine() as String

if (String1.equals(String2)) {
    println "The Strings are equal"
} else {
    println "The Strings are not equal"
}