package `2`.var_versus_val

/**
 * 2. val vs var
 * val: 불변(Immutable) 변수로, 값의 읽기만 허용되는 변수. 값(Value)의 약자이다.
 * var: 가변(Mutable) 변수로 값의 읽기와 쓰기가 모두 혀용되는 변수. 변수(Variable)의 약자이다.
 *
 * <심화>
 * 실제로 코틀린의 가변 변수와 불변 변수는 값이 저장된 메모리 공간을 가르키며 같은 메모리 공간내에서는
 * 값이 변할 수 있기 때문에 가변 변수와 불변 변수는 엄밀히 말하면 가변 변수와 불변 변수가 아니게 된다.
 *
 * 참고
 * - https://kotlinworld.com/173#:~:text=%EC%BD%94%ED%8B%80%EB%A6%B0%EC%97%90%EC%84%9C%20%EC%A7%80%EC%9B%90%ED%95%98%EB%8A%94%20%EB%B3%80%EC%88%98%EC%9D%98%20%EC%A2%85%EB%A5%98%EB%8A%94%20%EB%8B%A4%EC%9D%8C,%EA%B0%80%20%EB%AA%A8%EB%91%90%20%ED%97%88%EC%9A%A9%EB%90%98%EB%8A%94%20%EB%B3%80%EC%88%98.
 */
fun main(args: Array<String>) {
    // val은 변하지 않는 상수 값이다.
    val a : Int = 10

    // var은 변할 수 있는 값이다.
    var b : Int = 9

    // val 타입은 재할당 할 수 없다.
    // 에러 발생
    //a = 100

    b = 100

    // 반환 타입의 경우 코틀린이 자동으로 인식하는 경우가 많지만 var, val는 꼭 선언을 해줘야 한다.
    var name : String = "ep"
    var nickname = "ep"

    // 초기값을 할당해주지 않는 경우는 타입을 선언해줘야 한다.
    var e : String

    println(name)
}