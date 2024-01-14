fun main (args: Array<String>) {
    // 正常版
    val x = 3
    val y = 1

    if (x > y) {
        println("x大於y")
    } else {
        println(("x不大於y"))
    }

    // 簡寫版
    println(if (x > y) "x大於y" else "x不大於y")
}
