 class PageActions {
     // assuming each post is at most 200 characters long
     //existing post
     open var picturePost: String = ""
     open var comment: String = ""
     open var picturePost2: String = ""
     open var comment2: String = ""

     //edit post funtion
     fun editPost() {
         var editPost = readLine()!!.toInt()
         println("choose the post you want to edit?, choose 1 for comment and 2 for picture post")
         if (editPost == 1) {
             println("you have posted 2 comments, select comment you want to edit, 1 or 2")
             var commentEdit = readLine()!!.toInt()
             if (commentEdit == 1) {
                 comment.replace(readLine()!!, readLine()!!, true)
             } else if (commentEdit == 2) {
                 comment2.replace(readLine()!!, readLine()!!, true)
             } else if (editPost == 2) {
                 println("you have posted 2 comments, select comment you want to edit, 1 or 2")
                 var picEdit = readLine()!!.toInt()
                 if (picEdit == 1) {
                     picturePost.replace(readLine()!!, readLine()!!, true)
                 } else if (picEdit == 2) {
                     picturePost2.replace(readLine()!!, readLine()!!, true)
                 }
             } else {
                 println("unrecognised choice")
             }

         }
     }

     //delete post function
     fun deletePost() {
         var deletePost = readLine()!!.toInt()
         println("choose the post you want to delete?, choose 1 for comment and 2 for picture post")
         if (deletePost == 1) {
             println("you have posted 2 comments, select comment you want to delete, 1 or 2")
             var commentDelete = readLine()!!.toInt()
             if (commentDelete == 1) {
                 comment.removeRange(0, 200)
             } else if (commentDelete == 2) {
                 comment2.removeRange(0, 200)
             } else if (deletePost == 2) {
                 println("you have posted 2 comments, select comment you want to edit, 1 or 2")
                 var picEdit = readLine()!!.toInt()
                 if (picEdit == 1) {
                     picturePost.removeRange(0, 200)
                 } else if (picEdit == 2) {
                     picturePost2.removeRange(0, 200)
                 }
             } else {
                 println("unrecognised choice")
             }

         }

     }
 }
     //logout class
    open class Leavepage: Login(){
     fun logOut(){
         var logOut = readLine()!!.toInt()
         println("this button logs out of your account")
         println("press 1 to log out of your account")
         if(logOut == 1){
             loginAccountDetails()
         }else{
             println("invalid selection")
         }


     }
}