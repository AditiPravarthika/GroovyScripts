Scanner scan = new Scanner(System.in)
println "Enter a number please your highness"
int a = scan.nextLine() as Integer
int remainder = a % 2
if (remainder == 0) {
    print " Your highness number $a is Even"
} else {
    print "Number $a is Odd"
}

