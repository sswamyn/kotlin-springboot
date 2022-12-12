package basics

fun main() {
    //exploreBreak()
   // exploreLabel()
    exploreLabelContinue()
}

fun exploreLabelContinue() {
    // Use of Labels
    //      format text@
    loop@ for(i in 1..5){
        println(" i is $i")
        if(i==3) break@loop
        innerLoop@ for (j in 1..5){
            println("\t j is $j")
            //if (j==2) break@innerLoop
            if (j==2) continue@loop
        }
    }
    println("All done! from Label")
}

fun exploreLabel() {
    // Use of Labels
    //      format text@
    loop@ for(i in 1..5){
        println(" i is $i")
        if(i==3) break@loop
        innerLoop@ for (j in 1..5){
            println("\t j is $j")
            if (j==2) break@innerLoop
        }
    }
    println("All done! from Label")
    /* Output:
     i is 1
         j is 1
         j is 2
     i is 2
         j is 1
         j is 2
     i is 3
    All done! from Label
    */
}

fun exploreBreak() {
    // Break is used to break out of a loop or logic
    for (i in 1..5){
        println(" i is $i")
        if(i==3) break // Could use '''return''' ; In that case, the print will not be executed
    }
    println("All done! from Break")
}
