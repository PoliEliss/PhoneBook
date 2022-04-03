import java.io.File

fun main(args: Array<String>) {




    val input = File("TelepfoneBook") // это у меня получился неизменяемый List<String>
        .readLines()
        //.withIndex()
       // .map { indexedValue -> indexedValue.index to indexedValue.value }
        //.toMap()
    println(input.get(2))

    val listPhone = input.filter { it.startsWith("8") }
    val listName = input.filter { it.length <10 }
    println(listName) // у нас есть список номеров
    println(listPhone) // и есть список имен 

    val contactIvan = Contacts("89675467", "Ivan")
    val contactOlga = Contacts("89517569876", "Olga")
    val contactBoris = Contacts("896754239", "Boris")

    val contactsTel = HashMap<String, String>() // я пока представлю номер телефона типом String
    contactsTel.put(contactOlga.phoneNumber, contactOlga.name)
    contactsTel.put(contactIvan.phoneNumber, contactIvan.name)
    contactsTel.put(contactBoris.phoneNumber, contactBoris.name)

    for (key in contactsTel.keys){
      //  println("$key = ${contactsTel[key]}")
    }


}


