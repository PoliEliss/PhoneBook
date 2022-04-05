import java.io.File

fun main(args: Array<String>) {

    val input = File("TelepfoneBook")           // это у меня получился неизменяемый List<String>
        .readLines()

    val listPhone = input.filter { it.startsWith("8") }// у нас есть список номеров
    val listName = input.filter { !it.startsWith("8") }// и есть список имен

    val contactsTel = hashMapOf<String, String>()           // я пока представлю номер телефона типом String
    var count = 0
    while (count < listName.size && count < listPhone.size) {
        contactsTel.put(listPhone[count], listName[count])
        count++
    }
    val menu = Menu(contactsTel)
    menu.mainMenu()

//    contactsTel.put("89675456786456", "Владимир")
//    contactsTel.put("897646787557856", "Аня")
println()

}


