package `6`.array_and_list

// 6. Array and List
fun main () {
    array()
}

/**
 * Array는 기본적으로 크기를 할당해줘야 한다.
 * List는 2가지 종류가 있다.
 * 수정이 가능하지 않은 Immutable List
 * 수정이 가능한 MutableList
 */

fun array(){
    val array = arrayOf(1,2,3)
    val array2 = arrayOf(1,"d",3.4f)
    val array3 = arrayOfNulls<Int>(3)

    // array는 기본적으로 Mutable이다. 그래서 할당값이 타입만 맞으면 변경할 수 있다.
    array[0] = 3

    // 할당값이 다르면? 컴파일 에러가 발생한다.
    // array[0] = "3"

    // 기존 크기보다 크게 만들면 런타임 에러가 발생한다.
    // array[4] = 5

    // 기존 array가 단일한 타입이 아닌 경우에는 다른 타입을 넣어도 컴파일 에러가 발생하지 않는다.
    array2[0] = 0
    array2[0] = "0"

    // set을 사용할 수 있다.
    array3.set(0, 10)

    println(array.joinToString(","))
    println(array2.joinToString(","))
    println(array3.joinToString(","))

    val list = listOf(1,2,3)
    val list2 = listOf(1,"d",11L)

    // list는 기본적으로 Immutable(읽기 전용)이다. 그래서 값을 읽을 수는 있지만 변경할 수 없다.
    var result = list[0]

    // 에러!
    // list[0] = 2

    // array list의 참조값은 변하지 않는다.
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20

    println(arrayList)
}