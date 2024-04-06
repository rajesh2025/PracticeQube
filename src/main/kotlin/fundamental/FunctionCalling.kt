package fundamental

import fundamental.Pet.*

fun foo() = 0


fun main() {

    val pet = getMyFavouritePet(DOG)

    val des = getDescription(Color.RED)
    when(val  weather  = getWeatherDetails(month = "March")){
        is Weather.Summer-> println(weather.toString())
        is Weather.Winter->  weather.tempratureInC()
        is Weather.Spring->  weather.festivalName()
        is Weather.PreWinter->  println(weather.toString())
        is Weather.Autumn->  println(weather.toString())
        is Weather.Mansoon->  println(weather.toString())
    }

}

fun getWeatherDetails(month: String): Weather = when(month.lowercase()) {
     "february","march"-> Weather.Spring()
    "april","may","june"-> Weather.Summer
    "july","august","september"-> Weather.Mansoon()
    "october","november"-> Weather.Autumn()
    "december","january"-> Weather.PreWinter
    else -> Weather.Winter()
}

fun getMyFavouritePet(pet: Pet): String =
    when (pet) {
        CAT -> ""
        DOG -> ""
    }

enum class Pet {
    DOG, CAT
}


fun getDescription(color: Color): String =
    when (color) {
        Color.BLUE -> "cold"
        Color.RED -> "mild"
        Color.YELLOW -> "hot"
    }


enum class Color {
    BLUE, YELLOW, RED
}

sealed class Weather{
     class Autumn : Weather(){
         override fun toString(): String {
             return "Autumn"
         }
     }

    object PreWinter : Weather() {
        override fun toString(): String {
            return "Pre_Winter"
        }
    }
    class Spring : Weather(){
        override fun toString(): String {
            return "Spring"
        }

        fun festivalName(){
            println("Basant Panchami, holi, shiv ratri")
        }
    }
    class Mansoon : Weather(){
        override fun toString(): String {
            return "Mansoon"
        }


    }
     class Winter : Weather(){
         override fun toString(): String {
             return "Winter"
         }

         fun tempratureInC(){
             println("it is 5 degree ")
         }
     }
    object Summer : Weather(){
        override fun toString(): String {
            return "Summer"
        }
    }
}

fun respondToInput(input:String) = when(input){
    "y","yes"->"I'm glad you agree"
        "n","no"->"Sorry to hear that"
            else->"I do not understand you"
}