fun main() {
    //型は変数名の右に記入する
    val name: String = "Kotlin"
    val width = 400
    println("Hello $name!")
    println(width)

    //リスト
    val fruits = listOf("apple", "banana","orange")
    //要素を一つずつ取り出して表示
    for (fruit in fruits){
        println(fruit)
    }
    //リストの中身を全て表示
    println(fruits)
    //リストに型指定
    val items: List<String> = listOf("apple", "banana","kiwifruit")
    //filterメソッド
    //appleという要素だけを取り出す場合
    items.filter { it == "apple" }.forEach{ println(it) }

    //Set
    //重複を許さないリスト
    val fruits_set = setOf("apple","banana","orange","apple")
    println(fruits_set)

    //Map
    //キーと値のペアを保持する
    val fruits_map = mapOf("apple" to 100,"banana" to 200,"orange" to 300)
    //要素を一つ取り出す
    println(fruits_map["apple"])
    //要素を順番に取り出す
    fruits_map.forEach{ key, value ->
        println("$key is $value yen.")
    }
    //全部表示
    println(fruits_map)


    //条件分岐
    val money = 400
    if(money >= 500){
        println("500以上")
    }else{
        println("500未満")
    }
    //when文
    val obj = "ブドウ"
    when(obj){
        "りんご" -> println("りんご")
        "みかん" -> println("みかん")
        "ブドウ" -> println("ぶどう")
        else -> println("その他") //いずれを満たさない場合
    }


    //繰り返し処理
    for (i in 1..10){
        println(i)
        //break文で途中で抜け出すこともできる
    }

    var j = 0
    while (j <= 10){
        println(j)
        j++ //インクリメント・デクリメントを忘れずに
    }
}