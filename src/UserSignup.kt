

open class UserSignUp: Login(){
    fun accountValidation(){
      println("Are you old enough to open an account with us? \n" +
              "how old are you?")
        var age:Int  = readLine()!!.toInt()
        if (age >= 18){
     println("what is your account type")
     println("type 1 for admin, 2 to open and adult account")
      var accounttype = readLine()!!.toInt()
     var admin = AdminAccount()
      var adult = AdultAccount()
            when (accounttype) {
                1 -> admin.createAccount()
                2 -> adult.createAccount()
                else ->{
                    println("you have entered and invalid response")
                }
            }
    }else{
            var child = ChildAccount()
            child.createAccount()
    }
 }
   protected var password:String = ""
    lateinit var name:String
    lateinit var location:String

    open fun createAccount() {
        println("please enter your name")
         name = readLine()!!
        println("where are you from?")
         location = readLine()!!
        println("enter password")
        password = readLine()!!
    }
    companion object{
        var userList = mutableListOf<UserSignUp>()
    }
}
//adminaccount
 class AdminAccount:UserSignUp(){
    override fun createAccount() {
        super.createAccount()
        userList.add(this)
        println("your account details username:${this.name},and pasword:${this.password}")
        var newUserLogin = Login()
        newUserLogin.loginAccountDetails()
        }
    }

//adultaccount
open class AdultAccount:UserSignUp(){
    override fun createAccount() {
        super.createAccount()
            userList.add(this)
        println("your account details username:${this.name},and pasword:${this.password}")
            var newUserLogin = Login()
           newUserLogin.loginAccountDetails()
         }
    }

//childaccount
class ChildAccount:UserSignUp(){
    override fun createAccount() {
println("you will need a guardians permission to create account.\n " +
        "do you have a guardian that is over the age of 18? \n " +
        "If yes press 1 to continue")
        var isThereGuardian = readLine()!!.toInt()
            if (isThereGuardian == 1){
                println("open the account with the child details")
                super.createAccount()
                println("enter guardian details")
                println("if you already have an account press 1 to login or 2 to create and adult account with us")
                var guardianAccountPresent = readLine()!!.toInt()
                var guardianAccount = Login()
                if (guardianAccountPresent == 1){
                    guardianAccount.loginAccountDetails()
                }else{
                    var newGuardianAccount = AdultAccount()
                    newGuardianAccount.createAccount()
                    println("your account details username:${this.name},and pasword:${this.password}")
                    guardianAccount.loginAccountDetails()
                }

            }else{
                println("please find a guardian for your account, we would love to have you with us")
            }

        }

}


