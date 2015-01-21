var input = db.wynikowaBaza.find().sort({value:-1} )

input.forEach(function(cos) {
	if (cos.value.count !== undefined) {
		print("{");		
		print("\"value\" : " + "\""+cos.value.name[0]+"\"" + ",\n" + "\"count\" : " + (cos.value.count - 1));
		print("},");
	}
});

// mongo test.js > dupa.json
