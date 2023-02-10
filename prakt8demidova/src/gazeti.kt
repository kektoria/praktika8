class gazeti(var name: String, var number: Int, var date: Int)
{
    fun vvod()
{
    print("введите название газеты: ")
    var name = readLine()
    print("введите номер газеты: ")
    var number = readLine()
    print("введите дату выпуска: ")
    var date = readLine()
}

    fun info()
    {
        println("название газеты: " + name)
        println("номер газеты: " + number)
        println("дата выпуска: " + date)
    }
}