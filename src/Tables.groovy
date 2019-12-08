//Table
Scanner scan = new Scanner(System.in)
println "Enter the table number"
int Firstnumber = scan.nextLine() as Integer

int Secondnumber = 1

12.times {
    int result = Firstnumber * Secondnumber
    println Firstnumber + "x" + Secondnumber + "=" + result
    Secondnumber = Secondnumber + 1
}
