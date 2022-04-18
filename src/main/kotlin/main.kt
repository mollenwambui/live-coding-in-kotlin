fun main(){
    add()
    multiply(12,50)
    multiply(20,70)
    multiply(10,65)
    string("Mollen")
    string("Judy")
    string("Faith")
    string("Sabdio")
  var x=  substruct(50,10)
    println(x)
   var y= getfullname("Mollen","Wambui")
    println(y)
    stringIndexing()
    stringIterpolation()
    stringboolean()
    stringIndexing()
    stringreplace()
  var name=  stringArray("Mollen","Judy","Faith")
    println(name.contentToString())
  var nums=  productofArray(arrayOf(1,2,3,4,5))
    println(nums)
   var chars= arrayOfCharacter(arrayOf('a','e','c','d','o','f','g','j'))
    println(chars)

}
fun add(){
    var a=20
    var b=10
    var c =a+b
    println(c)
}
fun multiply(num1:Int,num2:Int){
    var product=num1*num2
    println(product)
}
fun string(name:String){
    println("Hello my name is " + name)
}
fun substruct(num1:Int,num2: Int):Int{
    var minus=num1-num2
    return minus
}
fun getfullname(firstname:String,secondname:String):String{
    var fullname=firstname + " "+ secondname
    return fullname
}
fun stringIndexing(){
    var fruit="banana"
    println(fruit[0])
    println(fruit[1])
    println(fruit[2])
    println(fruit[3])
    println(fruit[5])
    println(fruit[1].toString()+fruit[2]+fruit[3])

}
fun stringIterpolation(){
    var name="Lucy"
    var year=1998
    var statement="$name was born in $year"
    println(statement)

}
fun stringboolean(){
    var message1="Confirmed you have received 200"
    var message2="Confarmed you have received 200"
    if (message1==message2){
        println(true)
    } else
        println(false)
}
fun stringreplace(){
    var statement="I have been thinking about Having lots of money and a smooth life"
    println(statement.replace("money","Cash"))
}
fun stringArray(a:String,b:String,c:String):Array<String>{
    var names= arrayOf(a,b,c,)
    return names
}
fun productofArray(numbers:Array<Int>):Int{
    var product=1
    numbers.forEach { num ->
        product*=num
    }
    return  product
}
fun arrayOfCharacter(vowels:Array<Char>):Int{
    var sum=0
    vowels.forEach { letter->
        if(letter =='a'||letter=='e' ||letter=='i' ||letter=='o'||letter=='u')
            sum++
    }
    return sum
}
