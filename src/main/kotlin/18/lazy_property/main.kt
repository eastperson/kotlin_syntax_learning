package `18`.lazy_property

/**
 *  lateinit 은 필요한 경우 언제든 초기화가 가능한 프로퍼티이다.
 *  - var(mutable)에서만 사용이 가능하다
 *  - var이기 때문에 언제든 초기화를 변경할 수 있다.
 *  - null을 통한 초기화를 할 수 없다.
 *  - 초기화를 하기 전에는 변수에 접근할 수 없다.
 *  - lateinit property subject has not been initialized
 *  - 변수에 대한 setter/getter properties 정의가 불가능하다.
 *  - lateinit은 모든 변수가 가능한 건 아니고, primitive type에서는 활용이 불가능하다(Int, Double 등)
 */
fun lateInitFun() {

}

class Person {
    lateinit var name: String
}

/**
 * lazy
 * - 호출 시점에 by lazy 정의에 의해서 초기화를 진행한다.
 * - val(immutable)에서만 사용이 가능하다.
 * - val이므로 값을 교체하는 건 불가능하다.
 * - 초기화를 위해서는 함수명이라도 한번 적어줘야 한다.
 * - lazy을 사용하는 경우 기본 Synchronized로 동작한다.
 * https://thdev.tech/kotlin/2018/03/25/Kotlin-lateinit-lazy/
 */
fun main(array: Array<String>) {

    val p: String by lazy {
        println("init by lazy")
        "Subject Initialized"
    }
    println("before init")
    println("one: $p")
    println("two: $p")
    println("three: $p")
}