package `7`.loop

// 6. Array and List
fun main () {
    forAndWhile()
}

fun forAndWhile(){
    val students = arrayListOf("ep","owen","henry","maggie")

    // in 구문
    for(name in students) {
        println("${name}")
    }

    var sum = 0
    // 1부터 10까지 더하기
    // 1 3 6 10 15 21 28 36 45 55
    for(i in 1..10){
        sum += i
        println("${sum}")
    }

    sum = 0
    // 1부터 10까지 홀수만
    // 1 4 9 16 25
    for(i in 1..10 step 2){
        sum += i
        println("${sum}")
    }

    sum = 0
    // 1부터 10까지 홀수만
    // 10 19 27 34 40 45 49 52 54 55
    for(i in 10 downTo 1){
        sum += i
        println("${sum}")
    }

    sum = 0
    // 1부터 99까지 (100을 포함하지 않음)
    // 1 ..
    for(i in 1 until 100){
        sum += i
        println("${sum}")
    }

    // 인덱스랑 같이 쓸 수 있다.
    for((index,name) in students.withIndex()){
        println("${index+1}번 학생 : ${name}")
    }

    // 컬렉션의 인덱스만 사용할 수 있다.
    for (i in students.indices) {
        print("${i + 1} + : ")
        println(students[i])
    }

    // while 문은 똑같다.
    var idx = 0
    while(idx < 10) {
        println("current index : ${idx}")
        idx++
    }
}