fun main() {
    val n = readLine()!!.toInt()

    for (i in 0 until n) {
        val emtpy = " ".repeat(i)
        val star = "*".repeat(n - i)
        println(emtpy + star)
    }
}
