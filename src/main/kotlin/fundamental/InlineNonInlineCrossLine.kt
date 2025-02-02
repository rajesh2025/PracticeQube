package fundamental

class InlineNonInlineCrossLine {

}

inline fun higherOrderFunction(crossinline aLambda: () -> Unit) {

    normalFunction {
        aLambda() //must mark aLambda as crossinline to use in this context.
    }

}

fun normalFunction(aLambda: () -> Unit) {

    return

}

fun callingFunction() {

    higherOrderFunction {
        return@higherOrderFunction  //Error. Can't return from here.
    }

}

fun main() {
    callingFunction()

    println(filter<Video.Programming>(videos = videos))

    val numbers = listOf("one","two","three","four")
    val longerthan3 = numbers.filter { it.length > 3 }
    println(longerthan3)
}
inline fun <reified T> filter(videos: List<Video>): List<T> {
    return videos.filterIsInstance<T>()
}

inline fun applyTransformation(
    videos: List<Video>,
    noinline transformation: (Video) -> Video,
    crossinline onComplete: (List<Video>) -> Unit
) {
    val v = videos.map(transformation)
    onComplete.invoke(v)
}


val videos =
    listOf(
        Video.Programming("kotlin basics", "10:30"),
        Video.Cooking("kotlin cooking with", "20:30"),
        Video.Travel("kotlin for beginners", "13:30"),
    )

sealed class Video() {
    data class Programming(var titleString: String, val duration: String) : Video()
    data class Cooking(val title: String, val duration: String) : Video()
    data class Travel(val title: String, val duration: String) : Video()
}