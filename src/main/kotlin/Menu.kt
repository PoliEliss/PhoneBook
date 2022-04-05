import java.util.*

class Menu(val contact: HashMap<String, String>) {
    var color: String = "\u001B[31m";

    val sc = Scanner(System.`in`)

    fun mainMenu() {
        println(this.color + "-------Контакты----------")
        println("Выберите необходимый раздел введя число")
        println("1. Добавить номер")
        println("2. Удалить номер")
        println("3. Поиск")
        println("4. Настройки цветов")
        println("5. выход")

        val otvet = otvet();
        when (otvet) {
            "1" -> addNomer()
            "2" -> removeNomer()
            "3" -> search()
            "4" -> setting()
            "5" -> System.exit(0)

        }

    }


    fun search() {       //поискменю

        println("1 показать все контакты от А д я")
        println("2 показать все конактты от я до А")
        println("3 показать все контакты в имени которых присутствуют буквы")
        println("4 показать все контакты ")
        val otvet = otvet();
        when (otvet) {
            "1" -> {
                sortAz(contact)
                exitMenu()
            }
            "2" -> {
                sortZa(contact)
                exitMenu()
            }
            "3" -> {
                println("Введите буквы на которые начинаются контакт")
                val absd = otvet()
                sortlOnLetter(contact, absd)
                exitMenu()
            }
            "4" -> {
                printMap(contact)
                exitMenu()

            }
        }
    }

    fun exitMenu() {
        println("------------------------------------")
        println("Нажмите 0 чтоб выйти в главное меню")
        println("------------------------------------")
        val otvetLine = sc.nextLine();
        if (otvetLine == "0") {
            mainMenu()
        } else {
            exitMenu()
        }
    }


    fun otvet(): String {
        val otvetLine = sc.nextLine();
        return otvetLine
    }


    fun addNomer() {

    }

    fun removeNomer() {
        sortAz(contact)
        println("Введите имя для удаления номера")
        val sc = Scanner(System.`in`)
        val name = sc.nextLine()
        println(name)
       val mapnumber =  searchName(contact, name)
        if (mapnumber.size==1){
            mapnumber.clear()
            println("номер удален")
            println(mapnumber)
        }
        else if (mapnumber.size==0){
            println("Такого имени нет в списке")
        }
       else{
            println("Введите номер для удаления ")
            val sc = Scanner(System.`in`)
            val nomer = sc.nextLine()
            searchTelNumber(mapnumber,nomer)
        }
    }

    fun setting() {
        println(" Выберать цвет текста в главном меню")
        println(" 1 - Зеленый")
        println(" 2 - Синий")
        println(" 3 - Красный")
        var color = otvet()
        when (color) {
            "1" -> this.color = "\u001B[32m"
            "2" -> this.color = "\u001B[34m"
            "3" -> this.color = "\u001B[31m"
        }


        exitMenu()


    }


}