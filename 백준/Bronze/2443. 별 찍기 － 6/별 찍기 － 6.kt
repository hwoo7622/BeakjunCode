fun main() {
    val n = readLine()!!.toInt()
    for (i in n downTo  1) {
        val empty = " ".repeat(n-i)
        val star = "*".repeat((i*2)-1)
        println(empty+star)
    }
}