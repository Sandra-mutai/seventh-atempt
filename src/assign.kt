fun  main() {
    numbers()
    members("jallie","brian","sandy")
    guest(age=3)
    guest(age=10)
    guest(age = 20)
    spot()

}
fun numbers(){
    for(b:Int in 1..100 step 2){

        println(b)

    }
}
fun members(name:String,name2:String,name3:String):Array<String> {
    var names= arrayOf(name,name2,name3)
    for (name in names)
        if (name.length > 5){
            println(name)
        }
    return names
}

fun guest(age :Int) {
    when (age){
        in 1..5 ->println("guest get a bottle of milk")
        in 6..14->println("guest get a bottle of fanta")
        else ->println("guest get a bottle of coca cola")


    }
}
fun spot(){
    for (numbers in 1..100){
        if (numbers %3==0 && numbers% 5==0){
            println("FizzBuzz")

        }
        else if (numbers %3==0){
            println("Fizz")
        }
        else if (numbers %5==0){
            println("Buzz")
        }
        else {
            println(numbers)
        }

    }
}