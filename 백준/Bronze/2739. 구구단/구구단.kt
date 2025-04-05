fun main() {
    val a = readLine()!!.toInt()
    for(i in 1 .. 9 step(1)){
        println("${a} * ${i} = ${a*i}")
    }
}