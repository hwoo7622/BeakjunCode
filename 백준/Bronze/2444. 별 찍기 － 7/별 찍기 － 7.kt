fun main() {
    val n = readLine()!!.toInt()
    var starc:Int = 1
    for (i in n downTo 1) {
        val empty = " ".repeat(i-1)
        val star = "*".repeat(starc)
        starc = starc+2
        println(empty+star)
    }
    
    for (i in n downTo  1) {
        if(i==n){
            continue
        }
        val empty = " ".repeat(n-i)
        val star = "*".repeat((i*2)-1)
        println(empty+star)
    }
}