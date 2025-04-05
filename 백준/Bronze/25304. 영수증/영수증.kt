fun main() {
    val X = readLine()!!.toInt()
    val N = readLine()!!.toInt()
    var totalAmount = 0
    for (i in 1..N) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        totalAmount += a * b
    }
    if (totalAmount == X) {
        println("Yes")
    } else {
        println("No")
    }
}
