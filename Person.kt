class Person(var name: String = "NN",
             var surname: String,
             var email: String = "",
             var phone: String = "",
             var age: Int = 0) {

    fun greeting() {
        println("Hej, Jag heter $name")
    }
}

