package `16`.filter

/**
 * filter
 */
fun main(args: Array<String>) {
    var list = listOf(-2, -1, 0, 1,2)
    val positives = list.filter{x->x > 0}
    println(positives)
    val positives2 = list.filter { it > 0 }
    println(positives2)
    val exists: Boolean = 2 in list
    val notExists: Boolean = 2 !in list
    println(exists)
    println(notExists)
}