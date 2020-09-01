fun main() {
    //version 1 - en lista av strängar - kan bara innehålla ett namn
   // var name = "David"
   // var listOfNames = mutableListOf<String>()
   // listOfNames.add(name)

    // version 2 skapa en ny klass som beskriver en person
    //skapa personer utifrån klass-en
    var p1 = Person("David", "Svensson",
        "d@mail.se", "070-11111", 42)

    var p2 = Person("Susan", "Svensson",
        "s@s.se", "08124098",37)

    var p3 = Person("Lois", "Svensson")

    var p4 = Person(surname = "Andersson", name = "Laura")

    var name = p1.name
    println(name)

    val listOfPersons = mutableListOf<Person>()

    listOfPersons.add(p1)
    listOfPersons.add(p2)
    listOfPersons.add(p3)
    listOfPersons.add(p4)

    println(listOfPersons[2].age)

    p2.greeting()
    p3.greeting()

    for(person in listOfPersons) {
       // println(person.name)
        person.greeting()
    }

}