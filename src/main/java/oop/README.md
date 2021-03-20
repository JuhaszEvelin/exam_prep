**Halak** (OOP feladatrész, 20 pont, hozzá tartozó teszt: FishTest)
Minden halnak van neve, súlya grammban és színe. 
Emellett minden hal számára elérhetőek az alábbi metódusok:

_status():_ 
adja vissza a hal adatait egy Stringben, 
pl "Dory, weight: 9, color: blue, short-term memory loss: true"

_feed():_ 
megnöveli a hal súlyát, a pontos implementáció a hal fajtájától függ.

**Clownfish**
A bohóchal 1 grammot hízik etetéskor, és van egy második színe is (a csíkok színe). 
A státusz ennek megfelelően módosuljon, 
pl "Nemo, weight: 5, color: orange-white, short-term memory loss: false".

**Tang**
A tang 1 grammot hízik etetéskor, és rövidtávú-memória zavarban szenvedhet.

**Kong**
A kong 2 grammot hízik etetéskor.
------------------------------------------------------------------------------
**Akvárium** (Collections feladatrész, 20 pont, hozzá tartozó teszt: AquariumTest)
Az Aquarium osztálynak az alábbi metódusai vannak:

_addFish()_, amivel halakat lehet hozzáadni

_feed()_, ami megeteti az összes halat az akváriumban, és ezzel megnöveli a súlyukat

_removeFish()_, eltávolít minden olyan halat az akváriumból, ami legalább 11 grammos

_getStatus()_, ami visszaadja a halak státuszát egy String listában