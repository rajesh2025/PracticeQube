package subjectknowledge


data class DataClasses(val name: User) {
    var age: Int = 0
}
fun main() {
    val person1 = DataClasses(User(name = "Jack", age = 1))
    val person2 = DataClasses(User(name = "Jack", age = 1))
    person1.age = 10
    person2.age = 20
    println("person1 == person2: ${person1 == person2}")
    println(" person1 hash  == person2 hash : ${person1.hashCode() == person2.hashCode()}")
    println("person1 with age ${person1.age}: ${person1}")
    println("person2 with age ${person2.age}: ${person2}")

    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)
    println("jack == olderJack: ${jack == olderJack}")
}