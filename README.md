# Java Fundamentals
### Author: James Dansie
This directory is for the CF 401d6 Java. This will repo will go over the java fundamentals.
### Basics (Lab1)
The basics is going over the basic (big surprise bu-dump-dish). In particular it is focused on how to declare a function with return types. So far everything is static so we don't have to instanciate anything.
### Arrays, Loops (Lab2)
The lab for today is going over arrays, loops, and writing tests. Apparently inteliJ can sometimes lose connection to grandle, so to re-sync - click the "gradle" in the top left hand corner and click the circle made of arrows. Also, for float tests you need to include the amount of difference that is okay. For example a test might be 1.000000 == 1.0000001, these are pretty much the same, so the difference allows us to so "anything less than this and we'll just say these are equal".
### Lab 03: Maps, File I/O, and Testing
This lab is going over hashmaps, hashsets, and builds a linter for checking js files. We also use a lot of scanners to read files, and check the characters.
### Lab 6: Composition and Inheritance, Part 1
This lab set up two classes; reviews and restaurants. The reviews are stored as a linked list in the restaurant. The review class has the instance variables of author, body, and stars. The review has a constructor method and a toString. The restaurant has name, stars, and price. The public methods are the constructor, addReviewHead, toString, and reviewsReturn. There are some private methods that handle the hard part, but the outside world doesn't need access to them to update reviews, so they're hidden with private.
### Lab 07: Inheritance, day 2
This lab added more classes; shops and theaters. These extend the restaurant class from before. The review class has been overloaded to add a movie option. Lots of tests have been added. toStrings are mostly the same, added some changes for the movie reviews.