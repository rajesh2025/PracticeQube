package subjectknowledge

enum class DAYS {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,

}

fun main() {
println(DAYS.values().forEach { println("${it.ordinal} = ${it.name}") })
}