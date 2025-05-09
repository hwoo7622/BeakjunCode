fun main() {
    val n = readLine()!!.toInt()
    for(i in 1 .. n){
        var star = "*".repeat(i)
        println(star)
    }
    for(i in n-1 downTo 1){
        var star = "*".repeat(i)
        println(star)
    }
}

