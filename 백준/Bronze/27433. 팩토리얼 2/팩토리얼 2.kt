fun facto(i: Int): Long {
    if(i==0 || i==1){
        return 1
    }

    return i*facto(i-1)
}
fun main() {
    val N = readLine()!!.toInt()
    println(facto(N))
}
