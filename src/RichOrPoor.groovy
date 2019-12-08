Scanner scanner = new Scanner(System.in)
println "Enter a number"
int a = scanner.nextLine() as Integer
if (a >= 0 && a <= 9) {
    println "Bad"
} else if (a >= 10 && a <= 99) {
    println "Good"
} else if (a >= 100 && a <= 999) {
    println "Super"
} else if (a >= 1000) {
    println "Brilliant"
}