fun main() {
    val n = readLine()!!.toInt()
    var starc: Int = n-1
    for(i in 1 .. n-1){
        var empty = " ".repeat(starc)
        var star = "*".repeat(i)
        starc=starc-1
        println(empty+star)
    }
    for(i in 1 .. n){
        print("*")
    }
    println()
    starc=n-1
    for(i in 1 .. n-1) {
        var empty = " ".repeat(i)
        var star = "*".repeat(starc)
        starc = starc - 1
        println(empty + star)
    }
}

