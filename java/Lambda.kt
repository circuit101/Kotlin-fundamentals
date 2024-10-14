fun main() {
    // Basic Lambda: Adding two numbers
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    println("Sum of 3 and 5: ${sum(3, 5)}") // Output: 8

    // Lambda as a Parameter: Performing different operations
    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    val additionResult = calculate(4, 2) { x, y -> x + y }
    println("Addition of 4 and 2: $additionResult") // Output: 6

    val multiplicationResult = calculate(4, 2) { x, y -> x * y }
    println("Multiplication of 4 and 2: $multiplicationResult") // Output: 8

    // Using Implicit `it` Parameter: Squaring a number
    val square: (Int) -> Int = { it * it }
    println("Square of 4: ${square(4)}") // Output: 16

    // Lambda with Receiver: Greeting a String
    val greet: String.() -> String = { "Hello, $this!" }
    println("Kotlin".greet()) // Output: Hello, Kotlin!
}
