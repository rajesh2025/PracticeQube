fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    main()
}
fun main()
{
    val arrayname = Array(5) { it.inc() }
    for (i in 0..arrayname.size-1)
    {
        println(arrayname[i])
    }

}
