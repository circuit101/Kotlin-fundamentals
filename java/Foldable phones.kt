open class Phone(var isScreenLightOn: Boolean = false) {
    fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

// Child FoldablePhone class
class FoldablePhone(var isFolded: Boolean = false) : Phone() {

    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
        println("The phone is now folded.")
    }

    fun unfold() {
        isFolded = false
        println("The phone is now unfolded.")
    }
}

fun main() {
    // Example usage
    val myFoldablePhone = FoldablePhone()

    myFoldablePhone.checkPhoneScreenLight()

    myFoldablePhone.unfold()
    myFoldablePhone.switchOn()
    myFoldablePhone.checkPhoneScreenLight()

    myFoldablePhone.fold()
    myFoldablePhone.switchOn()
    myFoldablePhone.checkPhoneScreenLight()

    myFoldablePhone.unfold()
    myFoldablePhone.switchOn()
    myFoldablePhone.checkPhoneScreenLight()
}