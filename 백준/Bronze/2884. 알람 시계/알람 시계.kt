fun main() {
    val (h,m) = readLine()!!.split(" ").map { it.toInt() }
    if((h*60+m)-45<0){
        print("23 ${15+m}");
    }
    else{
        print("${((h*60+m)-45)/60} ${((h*60+m)-45)%60}")
    }
}


