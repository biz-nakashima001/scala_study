class User {
    val name = "my name"
    def sayHi() = println("hi!")
}

object MyApp {
    def main(arg: Array[String]): Unit = {
        val user = new User
        println(user.name)
        user.sayHi()
    }
}