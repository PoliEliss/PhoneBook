import java.util.*

class Menu (val contact:HashMap<String,String>){

   val sc  = Scanner(System.`in`)

    fun mainMenu(){
         println("-------Контакты----------")
         println("Выберите необходимый раздел введя число")
         println("1. Добавить номер")
         println("2. Удалить номер")
         println("3. Поиск")
         println("4. Настройки интерфейса")
        println("5. выход")

         val otvet  = otvet();
         when(otvet){
             "1" -> addNomer()
             "2" -> removeNomer()
             "3" -> search()
             "4" -> setting()
             "5" -> System.exit(0)

         }

     }


    fun search (){       //поискменю

        println("1 показать все контакты от А д я")
        println("2 показать все конактты от я до А")
        println("3 показать все контакты в имени которых присутствуют буквы")
        val otvet  = otvet();
        when(otvet){
            "1" -> sortAz(contact)
            "1" -> sortZa(contact)
            "1" -> sortAddTime(contact)
        }


    }

    fun otvet() : String{
        val  otvetLine = sc.nextLine();
        return otvetLine
    }


    fun addNomer(){

    }

    fun removeNomer(){

    }

    fun setting(){

    }


}