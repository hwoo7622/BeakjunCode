fun main() {
    val (A,B) = readLine()!!.split(" ").map { it.toInt() }
    if(A>B){
        print(">")
    }
    else if(A<B){
        print("<")
    }
    else if(A==B){
        print("==")
    }
}

