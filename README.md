### Programming Assignment 1
>*by Khant Zaw Hein (652115511)*


#### 1. Compile Sorter.java with javac

```
javac Sorter.java
```

#### 2. Help text when invalid or no args are passed.

```{bash}
java Sorter      
usage: java Sorter <-f|-n|-l> <file_path>
Sort the student by student number (with argument -n)
Sort the student by first name (with argument -f)
Sort the student by last name (with argument -l)
```

#### 3. Sort roaster.csv by Student ID

```
java Sorter -n ./roaster.csv
0035 James Mason
0054 Deanna Smith
0136 Sabrina Hill
0329 Caroline Brown
0372 Adrian Hamilton
0375 Clark Brooks
1300 Daryl Wright
1363 Justin Cole
1443 Tess Harris
1656 Paul Russell
1736 Haris Campbell
1766 Brad Higgins
...
```

#### 4. Sort roaster.csv by First Name

```
java Sorter -f ./roaster.csv
4454 Adam Parker
1890 Adele Baker
3574 Adison Stewart
0372 Adrian Hamilton
8632 Adrian Phillips
8795 Adrian Taylor
2631 Adrianna Grant
3649 Alan Anderson
7939 Albert Taylor
5519 Alexander Reed
7733 Alexia Barnes
7175 Alisa Fowler
3858 Alissa Grant
3876 Amanda Howard
8477 Amelia Cameron
9812 Anna Campbell
5166 Arianna Johnston
9506 Arthur Higgins
6515 Arthur Fowler
7880 Ashton Brown
3062 Audrey Dixon
2633 Blake Bailey
1766 Brad Higgins
9136 Brianna Armstrong
3588 Briony Lloyd
6946 Briony Smith
8589 Camila Mason
6744 Carlos Allen
...
```

#### 5. Sort roaster.csv by Last Name

```
java Sorter -l ./roaster.csv
2080 Maya Alexander
6728 Eric Allen
5066 Mike Allen
6744 Carlos Allen
3649 Alan Anderson
9136 Brianna Armstrong
7739 Rebecca Armstrong
8944 Emily Bailey
2633 Blake Bailey
1890 Adele Baker
6266 Jenna Baker
6770 Natalie Baker
8456 Charlie Barnes
5323 Leonardo Barnes
7623 Lana Barnes
7733 Alexia Barnes
6208 Jared Barrett
2503 Grace Bennett
6324 Sabrina Brooks
0375 Clark Brooks
0329 Caroline Brown
7880 Ashton Brown
8477 Amelia Cameron
9974 Dexter Cameron
6885 Lucia Cameron
8309 Garry Campbell
9812 Anna Campbell
1736 Haris Campbell
4108 Kimberly Carroll
2404 Edwin Carter
6059 Vincent Casey
1813 Lyndon Casey
2694 Olivia Casey
```