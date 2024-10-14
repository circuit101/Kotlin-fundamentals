fun null1(){
    var name: String? = null

    println(name)
}

fun null2() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor?.length)
    println(favoriteActor!!.length)


    if (favoriteActor != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
        println("You didn't input a name.")
    }


    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}