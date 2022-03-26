package `3`.string_template

// 3. String Template
fun main() {
    val name = "ep"
    val lastName = "Kim"

    println("my name is $name")

    // 대괄호를 써서 변수임을 명시할 수 있다.
    println("my last name is ${lastName}")

    // 변수간의 연산이 가능하다.
    println("my name is ${name + lastName}")

    // $는 \로 escape가 가능하다
    println("this is \$name")
}