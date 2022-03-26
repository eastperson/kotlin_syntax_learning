package `5`.expression_versus_statement

/**
 * 위의 예시에서 return 값이 없는 when은 statement에 해당하고 return 값이 있는
 * when은 expression 이라고 생각하면 된다. 그렇다면 코틀린의 함수는 expression일까?
 *
 *
 */

fun main () {

    var score : Int = 5

    println(score)
    // return 값이 없으니깐 statement 일까?
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")

        // 복수 조건 가능
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    // return 값이 있으니깐 expression 일까?
    var result : String = when(score) {
        0 -> "영"
        1 -> "일"

        // 복수 조건 가능
        2,3 -> "이 혹은 삼"
        else -> "몰라"
    }
    println(result)
}

/**
 * 코틀린의 함수는 모두 expression이다. 반환값이 없어 보이는 함수도 사실은 Unit을 반환하게
 * 되어있어서 statement가 아니다. 자바의 경우는 void 함수인 경우 statement라고 할 수 있지만,
 * 코틀린과는 다르다고 생각하면 된다.
 */