fun main() {
    var (a,b) = readLine()!!.split(" ").map { it.toInt() }
    val c = readLine()!!.toInt()
    a += c / 60;
    b += c % 60;

    if(b >= 60){
        a += 1;
        b -= 60;
    }
    if(a >= 24){
        a -= 24;
    }

    print("${a} ${b}");

}



