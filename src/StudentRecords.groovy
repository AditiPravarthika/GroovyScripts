//Student Record
Scanner scan = new Scanner (System .in)
println "Enter number of students "
Integer StudentCount = scan .nextLine() as Integer

StudentCount.times{
    println "Enter your name"
    String name = scan .nextLine() as String
    println "Enter your English marks"
    Integer English = scan .nextLine() as Integer
    println "Enter your Maths mark"
    Integer Maths = scan .nextLine() as Integer
    println "Enter your Science marks"
    Integer  Science = scan .nextLine() as Integer
    println "Enter your Computer marks"
    Integer  Computer = scan .nextLine() as Integer
     int result = English + Maths + Science + Computer
    if (result > 350) {
        println "Hi,"+name+" Your grade is A"
    }
    else if (result> 250 && result <350 ) {
        println "Hi,"+name+" Your grade is B"
    }
    else {
        println "Hi,"+name+" Your grade is C"
    }
}


