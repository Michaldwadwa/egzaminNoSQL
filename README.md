# Michał Skałkowski MongoDB

Zadania wykonane na ProBook 4520s<br />
Pamięć: 4GB RAM<br />
Procesor: intel i3<br />
System: Mint 17

## Zad 1

Import pliku a następnie wykonanie map i reduce

Import
~~~
time mongoimport --type csv -c egzamin1 --file word_list.txt --headerline

czas: poniżej sekundy


~~~

Map Reduce
~~~
time mongo egzaminMapReduce.js 

czas: poniżej sekundy


~~~

## Zad2
Parsowanie pliku za pomoca Parser.java i usuwanie pustych linii za pomocą Cleaner.java
~~~
czas: 52:30
~~~

Import
~~~
time mongoimport --type csv -c egzamin --file wikipoParsowaniu.txt --headerline
~~~
![img](img/import.png)

Map Reduce
~~~
mongo egzamin2MapReduce.js

czas: 12:20:03
~~~
![img](img/mapReduce.png)

####Najczęstrze słowa
~~~
> db.wynikowaBaza.find().sort({value:-1}).limit(3)
{ "_id" : "w", "value" : 20292468 }
{ "_id" : "i", "value" : 5780516 }
{ "_id" : "a", "value" : 5407771 }
~~~