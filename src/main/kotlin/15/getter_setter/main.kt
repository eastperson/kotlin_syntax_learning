package `15`.getter_setter

/**
 * class 에
 * 변수를 정의하면 getter 와 setter 가 자동으로 정의된다.
 */
fun main(args: Array<String>) {
    val person = Person("ep", 30)
    println(person.name)
    person.name = "kim"
    println(person.name)
    // val 로 정의한 변수는 setter 가 정의되지 않는다.
    // person.age = 29
}

class Person(var name: String, val age: Int) {

}