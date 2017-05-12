fun main(args: Array<String>) {

	println("hello hoge 1234567890")

	val testbool = true;
	println(testbool)


	val user = UserClass()
	user.Id=1
	user.Name="hoge1"
	user.Age=31
	user.SpeakingLanguage = ""
	println(user.toString())

	user.SpeakingLanguage = "Japanese"
	println(user.IsSpeakingEnglish)

	user.SpeakingLanguage = "English"
	println(user.IsSpeakingEnglish)


	val userData = UserDataClass(id = 2, name = "hoge2", age = 15)
	println(userData.toString())

	userData.age=21
	println(userData.toString())

}