fun main() {
    val n = readLine()!!.toInt()
    if (n==1) {
        print("*")
        return
    }
    for(i in 0 until  n){
        for(k in 0 until n){
            print("*")
            if(k==n-1){
                println()
            }

        }
    }
}