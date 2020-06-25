# kidsAndToysMaps

Homework
Cadouri de Craciun.
Pentru ca tot este perioada sarbatorilor de iarna, m-am gandit sa facem un programel in care sa il ajutam pe Mos Craciun sa imparta cadouri la copii.
Se dau urmatoarele:
● Cildren.cvs
● Toys.csv.
Cildren.csv
Fiecare copil are un nume, prenume, gen, varsta si daca a fost sau nu cuminte.
Ex: Popescu;Mirel;M;6;true.
Pe fiecare rand al fisierui se gaseste cate un copil, atributele sale fiind despartite prin ; ca in exemplu.
Toys.csv.
Fiecare jucarie are o denumire, tip(M/F) si un range de varsta.
Ex: papusa;F; 3;5 (3- minimAge, 5- maximAge)
Cerinte:
1. Creati o clasa Kid. Folosind citirea din fisier, fiecare rand din cildrens.txt va deveni un obiect se tipul Kid. Adaugati toti copii creati intr-un List<Kid> chosenListName = new
ArrayList<>() ; folosind metoda .add() a listului.
Afisati toate elementele din lista creeata.
2. Acelasi lucru si pentru toy.
3. Asignati fiecare jucarie unui copil.
REGULI:
Copii care nu au fost cuminti nu primesc nimic.
Nu putem da unui baiat o jucarie de tip F si nici invers ( fata cu jucarie de tip M)
Nu putem sa oferim o papusa pentru varsta(3-5)ani la o fata care are varsta 7ani
Se presupune ca o jucarie poate fi atribuita unui copil de mai multe ori.
Toate asignarile copil-jucarie vor fi tinute intr-un map. - > Map<Kid, Toy>
chosenMapName = new HashMap<>();
Pentru a alcatui map-ul, veti creea o interfata ToyInnatorInterface care va avea o singura metoda: givePresents care va avea ca parametrii lista de copii creeata la pasul1 si lista
de jucarii creeata la pasul2 si va returna Map<Kid, Toy>.
Implementarea interferei se va face in clasa ToyInnator se ofera implementare pentru metoda givePresents.
Pentru a face atribuirea Kid-> Toy, pentru fiecare copil se va verifica mai inai daca a fost sau nu cuminte. Daca a fost cuminte, se va alege o jucarie random din lista de jucarii
folosind un int randomIndex = Math.random() (genereaza un numar random intr-un interval specificat si anume 0, toyList.sixe-1.Apoi vom extrage din lista copilul care se
afla la indexul extras : Kid currentKid =listKid.get(randomIndex). Se vor face verificarile pentru currentKid (vezi regulile de mai sus). Daca regulile sunt respectate, se va adauga
o noua intrare in map. Daca regulile nu sunt respectate, se va alege alt intex random si tot asa pana gasim o jucarie potrovita pentru cirrentKid. Tip: Se va face cu while().
Apelarea metodei givePresents se va face din main prin intermediul interfetei.
Map primit de la givePresents va respecta toate regulile mentionate mai sus.
La sfarsit, afisati mapul obtinut pentru a vedea ce copii ce jucarii a primit.
Copii care nu au primit jucarie, la afisare vor avea trecut in dreptul lor "this kid was naughty"
Programul se termina cand toti copii cumimti au primit o jucarie.
