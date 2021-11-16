fun isPalindrome(text: String): Boolean {
    if(text.length==0)
    return false

    var i = 0
    while (i < (text.length / 2) + 1) 
    if (text[i] != text[text.length - 1 - i++]) 
    return false
    return true
}

fun minSplit(value: Int): Int {
    if(value<0)
    return -1

    var amount=value
    var coins = intArrayOf(1, 5, 10, 20, 50)
    var i = 0
    var coinCounter = 0

    while (amount!=0) {
        var item = coins[coins.size - 1 - i]
        if (amount >= item) {
            coinCounter++
            amount -= item
            continue
        }
        i++
    }

    return coinCounter
}

fun notContains(array:IntArray):Int
{
    var i = 1
    var isUnic=true
    while(true){
    for(item in array){
    if(item==i){
        isUnic=false
    i++
    break
    }
    }
    if(isUnic)
    return i
    isUnic=true
    }
}

fun isProperly(sequence:String):Boolean{
    var sum = 0

    for(item in sequence){
    if(item=='('){
    sum++
    continue
    }
    sum--
    }
    return sum==0
}

fun countVariants(countStears:Int):Int
{
    var comboCount = 1
    val variants = 2
    var i = 0

    while(i++<countStears)
    comboCount*=variants

    return comboCount
}