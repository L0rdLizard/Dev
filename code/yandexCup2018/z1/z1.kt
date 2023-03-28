package code.yandexCup2018.z1

class Time(hoursT: Int, minutesT: Int) {
    private var hours = 12
    private var minutes = 0
    init {
        setHours(hoursT)
        setMinutes(minutesT)
    }
    fun setHours (hours : Int){
        if ((hours > 12) || (hours < 1)){
            println("hours must be >= 1 and <= 12")
            return
        }
        this.hours = hours
    }
    fun getHours () : Int{
        return hours
    }
    fun setMinutes (minutes : Int){
        if ((minutes >= 60) || (minutes < 0)){
            println("minutes must be >= 0 and < 60")
            return
        }
        this.minutes = minutes
    }
    fun getMinutes () : Int{
        return minutes
    }

    private fun invertHours (){
        if ((hours == 12) || (hours == 6)) return
        hours = if (hours < 6) 6 + (6 - hours)
        else 6 - (hours - 6)
    }
    private fun invertMinutes (){
        if ((minutes == 0) || (minutes == 30)) return
        minutes = if (minutes < 30) 30 + (30 - minutes)
        else 30 - (minutes - 30)
    }
    fun miracle (){
        invertMinutes()
        invertHours()
    }
    override
    fun toString() : String{
        return ("$hours:$minutes")
    }
}

fun main () {
    println("Enter hours")
    val hours = readln().toInt()
    println("Enter minutes")
    val minutes = readln().toInt()

    val x = Time(hours, minutes)

    x.miracle()

    println(x)
}