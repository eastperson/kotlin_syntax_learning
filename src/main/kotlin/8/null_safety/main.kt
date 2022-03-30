package `8`.null_safety

fun main(args: Array<String>) {
    ignoreNulls("ep")
    printHashCode(null)
    // printHashCode2(null)
}

/**
 *  코틀린과 null
 *  - 코틀린에서는 명시적으로 null을 인자로 넣을 수 없다.
 * ? : Nullable
 * ?. : Null 인 객체의 필드 or 메서드를 사용했을 경우 NPE 이 아니라 null 반환
 * ?: : Null 일 경우 default 값 혹은 로직
 * !! : 강제 NotNull 처리
 * let : nullable 일 경우 null 이 아닐 경우에만 로직 실행시키는 구문
 *
 */
fun ignoreNulls(str : String?) {

    /**
     * nullable
     * ? : type 뒤에 ?를 붙이면 null이 가능한 변수임을 명시적으로 표현하는 것이다.
     */
    // str이 사실 null일 수 있어서 아래의 구문은 에러가난다.
    // val nullable : String = str

    // ?으로 null이 올 수 있음을 표현하면 에러가나지 않는다.
    val nullable : String? = str

    /**
     * null safe operator
     */
    // nullable한 변수의 필드나 메서드를 사용하면 에러가 발생한다.
    // val len = nullable.length

    // nullable한 변수는 ?.을 사용하면 왼쪽항이 null 일 때 뒤에 무슨 필드나 함수가 오던 null을 반환한다.
    val len = nullable?.length

    // 프로퍼티 중간에 사용할 수도 있다. 연속으로도 사용 가능
    len.toString()?.length
    len?.toString()?.length

    /**
     * Elvis operator
     * ?: 엘비스 머리 닮아서 엘비스 연산자
     * 삽입하는 변수가 null 일 경우 default 값을 제공한다.
     */
    val name = str ?: "Unknown"

    // 예외를 발생시키는 로직으로 만들 수도 있다.
    val name2 = str ?: throw IllegalArgumentException("Null")

    /**
     * Not Null
     * !! null 일리 절대 없다고 컴파일러에게 알려주는 것이다.
     */
    val mNotNull : String = str!!

    // 따라서 String 클래스의 메서드를 사용할 수 있다.
    // 하지만 !!는 지양하는 것이 옳다.
    //val upper = mNotNull.toUpperCase()

    /**
     * not null일 경우에만 지정된 구문을 실행해주는 let 함수
     */
    // nullable 변수를 사용할 때, null이 아닌 경우에만 실행하는 로직을 사용할 때 let을 쓴다.
    val email : String? = "ep@email.com"
    email?.let {
        println("my email is ${email}")
    }
}

/**
 * Generic 을 사용하면 무조건 nullable 로 인식
 */
fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

/**
 * upper bound 에 대한 제한을 명시적으로 넣으면
 * not null 이다.
 */
fun <T: Any> printHashCode2(t: T) {
    println(t.hashCode())
}