package `11`.lambda

import java.lang.reflect.Type

/**
 * 1. Lambda
 * 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
 * 타입 추론이 가능하도록 작성해야 한다.
 * val lambdaName : Type = {arguments -> codeBody}
 *
 * 1-1) 메서드의 파라미터로 넘겨줄수가 있다.
 * 1-2) return 값으로 사용할 수 있다.
 *
 *
 *
 */

//val square = {number : Int -> number*number}
val square : (Int) -> (Int) = {number -> number*number}
val nameAge : (String,Int) -> (String) = {name,age -> "my name is ${name} I'm ${age}"}

fun main(args: Array<String>) {
    val result = square(3)
    println(result)

    val ep = nameAge("ep", 30)
    println(ep)

    val lambda = {number : Double ->
        number == 5.2343
    }
    println(invokeLambda(lambda))
    // 소괄호 생략 가능
    // 파라미터가 1개일 경우 예약어 it을 써줄 수 있다.
    println(invokeLambda({it > 3.22}))

    println(calculateGrade(50))

    println(extendString("ep", 30))
    println(extendString2("ep", 30))
}

// 인자값으로 lambda 가 오면 그 lambda 의 인자값으로 5.2343을 넣는다.
fun invokeLambda(lambda : (Double) -> Boolean) : Boolean {
    return lambda(5.2343)
}

// 람다의 Return
// 람다는 마지막 표현식이 return 값을 의미한다.
val calculateGrade : (Int) -> String = {

    // 해당 람다식은 꼭 String 을 반환해줘야 하기 때문에 else를 명시해줘야 한다.
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 확장 함수
// 기존에 있는 String 클래스에 메서드를 추가하는 개념이다.
fun extendString (name:String, age:Int) : String {

    // this는 해당 메서드를 사용하는 객체이다.
    // 파라미터가 1개일 경우 예약어 it을 써줄 수 있다.
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

fun extendString2 (name:String, age:Int) : String {

    val pizzaIsGreat : String.() -> String = {
        this + "'s Pizza is the best!"
    }
    return name.pizzaIsGreat()
}