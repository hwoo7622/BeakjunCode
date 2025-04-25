fun main() {
    val n = readLine()!!.toInt()
    for (i in n downTo  1) {
        val empty = " ".repeat(n-i)
        val star = "*".repeat((i*2)-1)
        println(empty+star)
    }
    var starc:Int = 1
    for (i in n downTo 1) {
        if(starc==1){
            starc = starc+2
            continue
        }
        val empty = " ".repeat(i-1)
        val star = "*".repeat(starc)
        starc = starc+2
        println(empty+star)
    }

}