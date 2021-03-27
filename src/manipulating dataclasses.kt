fun main() {
    var imali=Details("Okla",14662949,21,"Ugandan",60)
    println(imali.age*2)
    println(imali.name.toUpperCase())
    println(imali.weight.toFloat())
    println(imali.name[2])
var sharon=Details("AKINYI",214521,23,"kenyan",54)
    if (imali==sharon){
        println("withdraw cash")
    }
    else{
        println("cannot withdraw")
    }
    println(sharon.name+" Amondi")

}
data class Details(var name:String,var ID:Int,var age:Int,var nationality:String,var weight:Int)