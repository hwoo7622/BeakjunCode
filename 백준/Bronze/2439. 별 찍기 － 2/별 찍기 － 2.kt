fun main() {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        val empty = " ".repeat(n - i)
        val star = "*".repeat(i)
        println(empty + star)
    }
}
