Minerva McGalagony megelégelte, hogy Dumbledore mennyire lazán veszi a házak pontversenyét, 
és saját kezébe vette a dolgokat. Mostantól a pontokat transzparens módon, adatbázisban fogjuk vezetni.

# Adatbázis

Az adatbázisban egyetlen tábla van house_points néven, az alábbi oszlopokkal:

- house_name varchar
- student_name varchar
- points_earned int

Egy hallgató többször is szerezhet pontot a tanév során a házának, ilyenkor az több rekordban lesz rögzítve. 
Például:

| house_name | student_name    | points_earned |
|------------|-----------------|--------------:|
| Gryffindor | Harry Potter    | 50            |
| Slytherin  | Draco Malfoy    | 10            |
| Slytherin  | Draco Malfoy    | 20            |
| Gryffindor | Harry Potter    | -15           |
| Hufflepuff | Cedric Diggory  | 25            |

# Java alkalmazás

Hozd létre a `HouseCup` osztályt, ami konstruktor paraméterben megkapja az adatbázis eléréshez szükséges
adatokat (url, user, password). Az osztályban hozd létre az alábbi metódusokat:

- `getHouseCupWinner()`: 
  adja vissza annak a háznak a nevét, aminek a diákjai a legtöbb pontot érték el a tanév során
- `getValedictorian()`: 
  adja vissza annak a diáknak a nevét, aki a legtöbb alkalommal szerzett pontot a tanévben 
  (nem biztos, hogy ő gyűjtötte a legtöbbet)

Ha senki nem szerzett pontokat, vagy hiba történik, akkor adjon vissza mindkét metódus üres `String`-et.
Ha döntetlen az állás, akkor az ABC szerint korábbi házat vagy diákot adja vissza a metódus.