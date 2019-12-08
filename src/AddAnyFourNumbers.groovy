// add any four numbers
Scanner scan = new Scanner(System.in)
println "Enter first number please"
//Get first number from user
int a = scan.nextLine() as Integer
// Get second number from user
println "Enter second number please"
int b = scan.nextLine() as Integer
//Get third number from user
println "Enter third number please"
int c = scan.nextLine() as Integer
// Get fourth number from user
println "Enter fourth number please"
int d = scan.nextLine() as Integer
println "Enter your gender please"
String gender = scan.nextLine() as String
if (gender.equals("Male")) {
    println "Sir"
} else if (gender.equals("Female")) {
    println "Mam"
}
// Print the result
println "your answer is"
int total = a + b + c + d
println total