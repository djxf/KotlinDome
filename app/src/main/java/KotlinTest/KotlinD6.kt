package KotlinTest



fun myCalculate(a: Int, b: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(a, b)
}


fun main() {
    println(myCalculate(1, 2) {
        x, y -> x + y
    })
    println(myCalculate(2, 3) {
        a, b -> a + b
    })

    val r1 = "fdas32i324523423lkbbccf432eea3567567slfj23l3323".filter {
        !it.isDigit() && it > 'a' && it < 'f'
    }
    print(r1)
}
var result = ""
fun String.filter(predicate: (Char) -> Boolean): String {
    this.forEach {
        if (predicate(it)) {
            result += it
        }
    }
    return result
}