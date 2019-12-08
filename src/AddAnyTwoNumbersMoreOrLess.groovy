Scanner scan = new Scanner(System.in)
println "Enter a number"
int a = scan.nextLine() as Integer
println "Enter another number"
int b = scan.nextLine() as Integer
int result = a + b
if (result < 10) {
    10.times {
        println " 10"
    }

} else if (result < 5) {
    5.times {
        println "5"
    }

} else {
    100.times {
        println "100"
    }
}