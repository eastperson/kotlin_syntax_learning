package `14`.object_class

/**
 * Singleton Pattern
 *
 * 자바에서는 싱글톤 패턴을 구사하기 위해 꽤나 불필요한 코드를 많이 작성하고 있다.
 * 하지만 코틀린은 단순하게 제작할 수 있다.
 *
 */
fun main(args: Array<String>) {
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)
    println(CarFactory.cars)
}

/**
 * car factory 라는 객체는 car 를 만들때만 사용하기 위해서 딱 1번만 생성된다.
 * 따라서 불필요한 메모리 소비를 줄일 수 있다.
 */
object CarFactory{
    init {
        println("create car factory")
    }
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car {
        println("make car : ${horsePower}")
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int){}