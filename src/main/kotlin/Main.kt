import java.io.File

//Puzzle 2015-Day01- First Try Before Cleanup
//tittade på flera andra lösningar och ingen kändes enklare än det jag precis har gjort, dom använde viss lambda men
//det blev fortf mer kod och mer komplicerat än det behövdes, vill hålla min kod kort och simpel.

class Day01{
    val a = File("src/main/resources/input.txt").readText()
    var counter1 = 0
    var position = 1
    var enteringPosition = 0


    fun part1() {
        for (i in a) {
            if (i == '(')
                counter1++
            else if (i == ')')
                counter1--
            if (counter1 < 0 && enteringPosition == 0)
                enteringPosition = position
            position++
        }
    }

    fun printPart1(){
        println(counter1)
    }

    fun part2(){
    println(enteringPosition)
    }


}

fun main(args: Array<String>) {
    val day01 = Day01()
    println(day01.part1())
    println(day01.printPart1())
    println(day01.part2())

}

