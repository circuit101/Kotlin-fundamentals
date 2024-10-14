fun if_condition() {
    val Number: Int = 101

    if (Number < 100) {
        println("Small number")
    } else {
        println("Big number")
    }
}

fun when_condition(number : Int = 4){
    when(number){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesady"
        4 -> "Thursday"
        5 -> "Friday"
        else -> println("No such thing")}
}

fun if_elseif_condition() {
    val Color = "Red"

    if (Color == "Blue") {
        println("In stock")
    } else if (Color == "Yellow") {
        println("In stock")
    } else if (Color == "Green") {
        println("In stock")
    } else {
        println("Not in stock")
    }

}