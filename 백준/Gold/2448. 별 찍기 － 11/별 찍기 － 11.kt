fun star(c: Array<CharArray>, size: Int, row: Int, col: Int) {
    if (size == 3) {
        c[row][col] = '*'
        c[row + 1][col - 1] = '*'
        c[row + 1][col + 1] = '*'
        for (i in -2..2) {
            c[row + 2][col + i] = '*'
        }
        return
    }
    val half = size / 2
    star(c, half, row, col)
    star(c, half, row + half, col - half)
    star(c, half, row + half, col + half)
}



fun main() {
    val n = readLine()!!.toInt()
    val width = 2 * n - 1
    val canvas = Array(n) { CharArray(width) { ' ' } }

    star(canvas, n, 0, n - 1)

    for (row in canvas) {
        println(row.concatToString())
    }
}

