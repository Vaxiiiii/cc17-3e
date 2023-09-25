	fun main() 
        {	
            //val can only be set once
            //var can be changeable
            
            var age = 20 * 365
            var name = "Ruben"
            var border = "%"
            var timesToRepeat = 23
            printBorder(border,timesToRepeat)
            print("Happy Birthday\n")
            printBorder(border,timesToRepeat)
           	print("I am ${age} days old\n")
            print("${age} days old is the best age to learn Kotlin\n")
            print("${name} is already ${age} days old!\n")
            
            println("   ,,,,,   ")
            println("   |||||   ")
            println(" =========")
            println("@@@@@@@@@@@")
            println("{~@~@~@~@~}")
            println("@@@@@@@@@@@")
            println("")
            print("Happy Birtday ${name} \n")                                          
        }
	fun printBorder(border:String,timesToRepeat:Int){
           repeat(timesToRepeat){
               print(border)
        	}
            println()
		}
