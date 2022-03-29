package `12`.data_class

/**
 * 비어있는 틀 역할을 하는 클래스를 POJO 클래스라고 한다.
 * 딱히 그 안에 메서드가 있지 않는 클래스다. DTO에 가깝다고 생각하면 된다.
 * Kotlin은 이 클래스를 작성하는 것이 불필요하다고 판단했다.
 * 그래서 Data Class를 만들어줬다.
 * 자바 14에서는 이와 비슷한 record 타입을 만들어줬다.
 *
 * 코틀린의 특징은 하나의 파일안에 여러 클래스를 선언하게 되어있다는 점이다.
 * 따라서 관련이 있는 data class를 한 파일에 선언해서 관리할 수 있게 되었다.
 */
fun main(args: Array<String>) {
    val ticketA = Ticket("koreanAir","ep","2021-06-05",30)
    val ticketB = TicketNormal("koreanAir","ep","2021-06-05",30)
    println(ticketA)
    // Ticket(companyName=koreanAir, name=ep, date=2021-06-05, seatNumber=30)
    println(ticketB)
    //com.ep.kotlinpractice.TicketNormal@2acf57e3
}

// 클래스의 프로퍼티 처럼 사용할 수 있다.
// toString(), constructor(), hashcode(), equals(), copy()가 생성된다.
data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)
