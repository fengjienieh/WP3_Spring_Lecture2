package org.example

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    println("Enter any word: ")

    val yourWord = readln()

    print("you entered the word: ")
    println(yourWord)

    print("sum of 5 and 6 is ")
    println(sum(5, 6))

}