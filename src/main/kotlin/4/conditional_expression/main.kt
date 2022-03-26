package `4`.conditional_expression

// 4. 조건식
fun main () {
    println(maxBy(3, 8))
    println(maxBy2(3, 8))
    for (i in 1..6) {
        checkNum(i)
    }
}


fun maxBy(a : Int, b : Int) : Int {
    if(a >b) {
        return a
    } else {
        return b
    }
}

// 코틀린에서는 3항 연산자가 없어서 아래와 같은 식이 자주 쓰인다.
// 반환타입은 자동으로 int로 설정이 되었다.
fun maxBy2(a : Int, b : Int) = if (a > b) a else b

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")

        // 복수 조건 가능
        2,3 -> println("this is 2 or 3")
        4 -> println("this is 4")
        else -> println("I don't know")
    }

    // return 값을 조건으로 받을 수 있다.
    // 이런 경우에는 else를 꼭 써줘야 한다.
    var b = when(score){
        1 -> 1
        2 -> 2
        3 -> 3
        4 -> 4
        5 -> 5
        else -> null
    }

    println("number is ${b}")

    // 범위를 정해줄 때 in을 사용할 수 있다.
    when (score) {
        in 4..6 -> println("You are genius")
        in 2..3 -> println("not bad")
        else -> println("stupid")
    }
    println("--------------------")
}