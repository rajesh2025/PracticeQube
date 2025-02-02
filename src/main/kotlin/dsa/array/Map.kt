package dsa.array

data class Hero(val name:String)
data class Universe(val heros: List<Hero>)

val batman = Hero("Bruce Wayne")
val wonderWomen = Hero("Diana Prince")

val mailMan = Hero("stan Lee")
val deadpool = Hero("Wade Winston Wilson")

val marvel  = Universe(listOf( mailMan, deadpool))
val dc  = Universe(listOf(batman, wonderWomen))


val allHeros : List<Universe> = listOf(marvel, dc)

fun main() {
    println(allHeros.map { it.heros })
}