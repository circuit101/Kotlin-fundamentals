// The parent class must be open to allow inheritance
open class Person(open var name: String, open var age: Int) {

    // Custom getter and setter for age property
    var personAge: Int = age
        get() = field
        set(value) {
            field = if (value > 0) value else 0 // Ensure age is not negative
        }

    open fun introduce() {
        println("Hello, my name is $name, and I am $personAge years old.")
    }
}

// The subclass that inherits from Person
class Student(
    override var name: String,
    override var age: Int,
    var studentId: String
) : Person(name, age) {

    // Custom getter for studentId
    var id: String = studentId
        get() = "ID: $field"

    // Override the introduce method
    override fun introduce() {
        println("Hi, I'm $name, a student. I am $personAge years old, and my student ID is $studentId.")
    }

    fun displayStudentInfo() {
        println("Student Name: $name")
        println("Age: $personAge")
        println("Student ID: $id")
    }
}

fun main() {
    val student = Student("Soli Code", 20, "S12345")

    // Display initial information
    student.introduce() // Calls the overridden method in Student
    student.displayStudentInfo() // Display specific Student information

    // Modify the age using the setter
    student.personAge = -5 // This will set the age to 0 due to custom setter logic
    student.introduce()

    // Set a valid age and display information again
    student.personAge = 25
    student.introduce()
    student.displayStudentInfo()
}
