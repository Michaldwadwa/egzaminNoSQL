var map = function(){
	var words = this.egzamin.toString().split(" ");
	words.forEach(function(key){
		emit(key, key);
	});
};

var reduce = function(key, value){
	return value.length;
};

db.egzamin.mapReduce( map, reduce, {
	out: 'wynikowaBaza'
});