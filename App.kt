/*fun = means it is a function
main = the name odf this function
args:Array<String> = the  function parameters enclosed in parentheses. the function is given an array
 of a Strings and the array is named args
 println("pow!") = this say to print to the standard output

   */


/*

fun main (args:Array<String>)
{
   // println("pow!")


/*

    var x = 3
    val name = "pankaj"
    //val is immutable its value never change
    x = x*10


    println("x  is $x.")

    //$ return the value of variable

    while (x>20)
    {
        x= x-1
        println(" X is now $x.")

    }

    for(i in 1..10)
    {
        x= x+1

        println("x is now $x.")
    }

*/

    /*

    //Exercise

    println("Now Exercise is started")

    var x1 = 1

    println("Before the loop. X = $x1.")

    while (x1< 4)
    {
        println("In the the loop. X = $x1.")
        x1 = x1+1


    }

    println("After the loop. X = $x1.")


    val x2 = 3
    val y = 1
    println(if (x2 > y) "x2 is  greater than y" else "x is not greater than y")


*/

    /*

 //Code Magnets

    var x= 1
    while (x < 4 )
    {
        println(if (x === 3) "Yab " else "Dab")
        print("ba")
        x =x +1

    }
    if(x ==4 )
        println("Do")


    */
}

*/



//It’s exercise time

/*
fun main(args: Array<String>)
{
    var  x = 1
    while (x<10)
    {

        if (x>3)
        {
            println("big X")
        }
    }
}

  // Summary /cause :x is smaller then 10 it enters the loop but there  is not any increment method there so
        //print() statement is unreachable x = x+1

 */

/*

fun main(args: Array<String>)
{
    val  x = 10
    while (x>1)
    {
        x = x-1

        if (x<3)
        {
            println("small X")
        }
    }
}



// Summary /cause : val  is immutable it never reassigned  change  val in to var



 */


/*
fun main(args: Array<String>)
{
    var  x = 10
    while (x>1)
    {
        x = x-1

        print( if (x<3)"small X")

    }
// if and else both are required  add else statement



 */



fun main(args: Array<String>) {
    var x = 0
    var y = 0
    while (x < 5) {
    //    y = x - y                   = 00 11 21 32 42
     //   y = y+x                     = 00 11 23 36 410

//       y = y+3
//        if(y >4) y = y-1            = 03 15 27 39 411

//        x = x+2
//        y = y+x                      = 22 57

//        if ( y <5)
//        {
//            x = x+1
//            if (y<3) x= x-1
//        }
//        y = y+3                      =03 26 39 412

        print("$x$y ")
        x = x + 1

    }
}