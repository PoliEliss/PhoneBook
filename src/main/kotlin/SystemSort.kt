import java.util.*
import kotlin.Comparator
import kotlin.collections.HashMap

fun <T> comparatorZa(): Comparator<String> {
    val comapratorZa: Comparator<String> = Comparator { o1: String, o2: String -> (o1.compareTo(o2)) }
    return comapratorZa
}


fun sortAz(contactsTel: HashMap<String, String>): Map<String, String> {
    val result = contactsTel.toList().sortedBy { (key, value) -> value }.toMap()
    println(result)
    return result
}

fun searchName(contactsTel: HashMap<String, String>, name: String): HashMap<String, String> {

    val nameHasMap = hashMapOf<String, String>()
    for ((key, value) in contactsTel) {
        if (value == name) {
            nameHasMap.put(key, value)
        }
    }
    println(nameHasMap)
    return nameHasMap

}

fun searchTelNumber(contactsTel: HashMap<String, String>, number: String): HashMap<String, String> {
    for ((key, value) in contactsTel) {
        if (key == number) {
            contactsTel.remove(key)
        }
    }
    println("Номер удален")
    println(contactsTel)
    return contactsTel

}


fun sortZa(contactsTel: HashMap<String, String>): Map<String, String> {
    val result = contactsTel.toList().sortedBy { (key, value) -> value }.reversed().toMap()
    println(result)
    return result

}

fun sortlOnLetter(v: HashMap<String, String>, name: String): HashMap<String, String> { // поиск по буквам
    val count: Int = name.length

    val namecCharValue: CharArray = name.toCharArray()
    var j: Boolean = false;
    for (s: String in v.values) {
        var countfor = count;
        val namecChar: CharArray = s.toCharArray()
        var nomer = 0;
        var sovpadeniy = 0
        while (nomer < countfor) {
            if (namecChar[nomer].equals(namecCharValue[nomer])) {
                nomer++
                sovpadeniy++
            } else {
                nomer++
            }
        }

        if (sovpadeniy == count) {
            println(s)
            j = true;
        }
    }
    if (!j) {
        println("Не найденно")

    }
    return v
}


fun printMap(v: HashMap<String, String>) {
    for (key in v.keys) {
        println("$key = ${v[key]}")
    }


}


