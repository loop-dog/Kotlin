fun main(args: Array<String>) {
	println("hello hoge 1234567890");

	val user = UserClass()
	user.id=1
	user.name="hoge1"
	user.age=31

	val userData = UserDataClass(id = 2, name = "hoge2", age = 15)


	println(user.toString() );

	println(userData.toString());


	userData.age=21

	println(userData.toString());

}