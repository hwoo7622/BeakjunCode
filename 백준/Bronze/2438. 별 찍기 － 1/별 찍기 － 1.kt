fun main() {
    var N = readLine()?.toInt()
    for (i in 1 ..N!!){
        for(j in 1.. i){
            print("*")
        }
        println()
    }
}