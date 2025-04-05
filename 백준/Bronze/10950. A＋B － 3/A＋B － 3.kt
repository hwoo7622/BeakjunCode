fun main() {
    val a = readLine()!!.toInt()
    for(i in 1 .. a step(1)){
        var (b,c) = readLine()!!.split(" ").map { it.toInt() }
        println(b+c)
    }
}