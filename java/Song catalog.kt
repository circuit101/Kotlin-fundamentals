class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    var playCount: Int
) {
    // Property to check if the song is popular
    val isPopular: Boolean
        get() = playCount >= 1000

    // Method to print song description
    fun describe() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}


fun main() {
    val song1 = Song("Bohemian Rhapsody", "Queen", 1975, 5000)
    val song2 = Song("Imagine", "John Lennon", 1971, 900)

    song1.describe()
    println("Is popular: ${song1.isPopular}")
}

