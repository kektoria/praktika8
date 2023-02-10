class Exam (var name: String, var examenataion: String, var dateExam: Int, var grade: Int)
{
    fun vvod()
    {
        print("введите имя студента: ")
        var name = readLine()
        print("введите предмет экзамена: ")
        var examenataion = readLine()
        print("введите дату проведения экзамена: ")
        var dateExam = readLine()
        print("введите полученную студентом оценку за экзамен: ")
        var grade = readLine()
    }

    fun info()
    {
        println("имя студента: " + name)
        println("предмет: " + examenataion)
        println("дата проведения экзамена: " + dateExam)
        println("оценка: "+ grade)
    }
}