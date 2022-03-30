package `17`.map

fun main(array: Array<String>) {

    // 읽기 전용
    val immutableMap = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(immutableMap["a"])

    // key value 순회
    for ((k, v) in immutableMap) {
        println("$k -> $v")
    }

    // 변경 가능
    var mutableMap = mutableMapOf(Pair("a", 1), Pair("b", 2), Pair("c", 3))
    println(mutableMap["b"])
    mutableMap["b"] = 20
    println(mutableMap["b"])



}