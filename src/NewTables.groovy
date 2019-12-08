//Tables
Scanner scan = new Scanner(System.in)

println "Enter the Table number"
int FirstNumber = scan.nextLine() as int

int SecondNumber = 1

12.times {
    int result =  FirstNumber * SecondNumber
    println FirstNumber + " x " + SecondNumber + " = " + result
    SecondNumber = SecondNumber + 1
}

