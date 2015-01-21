var input = db.wiki.out.find().sort({value:-1}).limit(100)

input.forEach(function(cos) {
		print("{");		
		print("\"value\" : " + "\"" + cos._id + "\"" + ",\n" + "\"count\" : " + cos.value);
		print("},");
});