fun main() {
    val n = readLine()!!.toInt()

    for (i in n downTo 1) {
        println("*".repeat(i))
    }
}
