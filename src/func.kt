fun main() {
    hello()
    println(sum(1,2))
    //ラムダ式で実行
    println(sum2(3,4))
}

//関数
fun hello(){
    println("hello world")
}

//足し算をする関数
fun sum(a: Int,b: Int): Int {
    return a + b
}

//ラムダ式で足し算をする関数
val sum2 = {a: Int,b: Int -> a + b}
