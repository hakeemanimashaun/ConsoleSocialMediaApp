open class Login {
    fun loginAccountDetails() {
        println("enter username")
        var username = readLine()!!
        println("enter password")
        var password = readLine()!!
        println("welcome ${username}")
    }
}