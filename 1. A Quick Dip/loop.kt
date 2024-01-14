fun main (args: Array<String>) {
    var x = 1
    println("Before the loop. x =  $x.")

    while (x < 4) {
        println("In the loop. x = $x.")
        x = x + 1
    }

    println("After the loop. x = $x.")
}

//Result:
//Before the loop. x =  1.
//In the loop. x = 1.
//In the loop. x = 2.
//In the loop. x = 3.
//After the loop. x = 4.
