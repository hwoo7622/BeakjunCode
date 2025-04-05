fun main() {
    var (a,b,c) = readLine()!!.split(" ").map { it.toInt() }
    if(a==b && b==c){
        print(10000+a*1000)
        return
    }
    if(a!=b && b!=c && a!=c){
        if(a>b && a>c){
            print(a*100)
            return
        }
        else if(b>a && b>c){
            print(b*100)
            return
        }
        else{
            print(c*100)
            return
        }
    }
    if(a==b && b!=c){
        print(1000+a*100)
        return
    }
    else if(b==c && c!=a){
        print(1000+b*100)
        return
    }
    else{
        print(1000+c*100)
    }
}



