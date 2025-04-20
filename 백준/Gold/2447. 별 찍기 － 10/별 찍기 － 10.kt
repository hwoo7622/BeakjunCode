//문자열 최적화 StringBuilder 사용
fun main() {
    val n = readLine()!!.toInt()
    val sb = StringBuilder()

    for (i in 0 until n) {
        for (j in 0 until n) {
            var x = i
            var y = j
            var check = false
            while (x > 0 || y > 0) {
                if (x % 3 == 1 && y % 3 == 1) {
                    check = true
                    break
                }
                x /= 3
                y /= 3
            }
            if (check) {
                sb.append(' ')
            } else {
                sb.append('*')
            }
        }
        sb.append('\n')
    }

    print(sb)
}
