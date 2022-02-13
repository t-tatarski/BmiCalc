package pl.codent.bmicalc

class Bmi (val mass:Int,val height:Int) {
    fun count(): Double {
        require(mass > 0 && height > 0)
        return mass / pow(height * 0.01)
    }
    fun pow(value: Double) = value * value

    fun formatString(): String {
        var state:String =""
        when(count()){
            in 16.0..17.0 -> state = " wychudzenie"
            in 17.0..18.49 -> state = " niedowaga"
            in 18.5..24.99 -> state = " optimum"
            in 25.0..29.99 -> state = " nadwaga"
            in 30.0..40.00 -> state = " otyłość"
        }
        return "BMI = %.2f  $state ".format(count())
    }
}