fun main() {
    val n = readLine()!!.toInt()

    for(i in n downTo 1){
        val empty = " ".repeat(i*2-2)
        val star = "*".repeat(n-i+1)
        println(star+empty+star)
    }
    var emptyc:Int = 2
    for(i in n downTo 1){
        val empty = " ".repeat(emptyc)
        val star = "*".repeat(i-1)
        println(star+empty+star)
        emptyc = emptyc+2
    }
}