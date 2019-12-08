//Compare by ignoring case
Scanner scan = new Scanner(System.in)
println "Enter a string"
String String1 = scan.nextLine() as String
println "Enter another string"
String String2 = scan.nextLine() as String

if (String1.equalsIgnoreCase(String2)) {
    println "The Strings are equal"
} else {
    println "The Strings are not equal"
}
