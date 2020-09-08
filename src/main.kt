// the difference between Class & Data Class
fun main() {
    val stu = Student("Samar", 22)
    val stu2 = Student("Hanan", 23)
    val person = Person("Asma",32)
    println("Student Name is: ${stu.name}")
    println("Student Age is:  ${stu.age}")
    println("Student Name is: ${stu2.name}")
    println("Student Age is:  ${stu2.age}")
    println("the name of person ${person.name}")
    println("the name of person ${person.age}")
}

//this is data class
data class Student(val name: String, val age: Int)
class Person(val name: String, val age: Int)


// this is normal class
fun person(s: String, i: Int): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}