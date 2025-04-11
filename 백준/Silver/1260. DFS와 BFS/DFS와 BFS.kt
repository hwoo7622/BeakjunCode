import java.util.*

val MAX = 1001
val graph = Array(MAX) { IntArray(MAX) }
val visited = BooleanArray(MAX)
val queue = LinkedList<Int>()

fun DFS(N: Int, V: Int) {
    visited[V] = true
    print("$V ")
    for (i in 1..N) {
        if (!visited[i] && graph[V][i] == 1) {
            DFS(N, i)
        }
    }
}

fun BFS(N: Int, V: Int) {
    queue.add(V)
    visited[V] = true
    print("$V ")

    while (queue.isNotEmpty()) {
        val pop = queue.poll()
        for (i in 1..N) {
            if (!visited[i] && graph[pop][i] == 1) {
                print("$i ")
                visited[i] = true
                queue.add(i)
            }
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val (N, M, V) = scanner.nextLine().split(" ").map { it.toInt() }

    for (i in 0 until M) {
        val (x, y) = scanner.nextLine().split(" ").map { it.toInt() }
        graph[x][y] = 1
        graph[y][x] = 1
    }

    DFS(N, V)
    println()

    visited.fill(false)
    BFS(N, V)
}
