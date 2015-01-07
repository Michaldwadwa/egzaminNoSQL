var map = function() {
	emit(this.egzamin.split("").sort().join(""), this.egzamin);
}
var reduce = function(key, values) {
	var res = 0;
	values.forEach(function(v) {
		res += 1
	});
	return {
		count : res,
		name: values 
	};
}

db.egzamin1.mapReduce(map, reduce, {
	out : "wynikowaBaza"
}); 