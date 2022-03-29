package `13`.companion_object

/**
 * companion object
 * java의 static 대신에 사용되는 것으로 정적인 메서드나 정적인 변수를
 * 사용할 때 사용하는 것이다.
 */
fun main(){
    val book = Book.create()

    println("${book.id} : ${book.name}")
}

class Book private constructor(val id : Int, val name : String){

    companion object BookFactory : IdProvider {

        val myBook = "new book"

        fun create() = Book(getId(), myBook)
        override fun getId(): Int {
            return 444
        }
    }
}

interface  IdProvider {
    fun getId() : Int
}