Scanner scan = new Scanner(System.in)
println "Enter a number"
int a = scan.nextLine() as int
println "Enter another number"
int b = scan.nextLine() as int
if (a > b) {
    a.times {
        println a
    }
} else {
    b.times {
        println b
    }
}