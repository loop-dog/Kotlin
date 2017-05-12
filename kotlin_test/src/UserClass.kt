class UserClass
{
	var Id:Int = 0
	var Name:String = ""
	var Age:Int = 0
	var SpeakingLanguage: String = ""

	val IsSpeakingEnglish: Boolean
		get() = this.SpeakingLanguage.toLowerCase() == "english".toLowerCase()


}
