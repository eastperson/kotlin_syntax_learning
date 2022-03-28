package `9`.`class`

fun main(){
    // 코틀린은 new를 사용하지 않아도 된다.
    val human = Human()
    human.eatingCake()
    println("human name is ${human.name}")
    val human6 = Human6()
    human6.eatingCake()
}

/**
 * Class 만드는 방법
 */

// 1. 기본
class Human {

    val name = "ep"

    fun eatingCake(){
        println("This is so YUMMMMY")
    }
}

// 2. constructor 활용
class Human2 constructor(name : String){

    val name = name

    fun eatingCake(){
        println("This is so YUMMMMY")
    }
}

// 3. 인스턴스 변수를 생성자에 포함
class Human3 constructor(val name: String){

    fun eatingCake(){
        println("This is so YUMMMMY")
    }
}

// 3. constructor 생략
class Human4 (val name: String){

    fun eatingCake(){
        println("This is so YUMMMMY")
    }
}

// 4. default 값을 넣어준다.
// 기존에는 필수로 변수에 값을 넣어줘야 했지만, default 값을 넣어주면 기본생성자
// 처럼 인자값없이도 생성할 수 있다.
class Human5 (val name: String = "Anonymous"){

    fun eatingCake(){
        println("This is so YUMMMMY")
    }
}

// 5. init 사용 (static block 과 유사)
class Human6 (val name: String = "Anonymous"){
    // 처음 인스턴스를 생성할 때 어떤 동작을 할 수 있는지 정의해준다.
    // 주 생성자의 일부이다.
    init{
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is so YUMMMMY")
    }
}

// 6. 생성자 오버라이딩
// arguments 오버로딩으로 여러 생성자 정의
// 주 생성자가 있을 경우  부 생성자는 주 생성자를 위임받아야 한다.
class Human7 (val name: String = "Anonymous"){

    constructor(name : String, age : Int) : this(name){
        println("my name is ${name},${age} years old")
    }

    // 처음 인스턴스를 생성할 때 어떤 동작을 할 수 있는지 정의해준다.
    // 주 생성자의 일부
    init{
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is so YUMMMMY")
    }
}