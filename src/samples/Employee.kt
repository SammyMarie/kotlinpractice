package samples

data class Employee(private val firstName: String, private val lastName: String) {
    val fullName: String
        get() = "$firstName $lastName"
}