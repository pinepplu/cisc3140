# LAB 2 REFLECTIONS AND WRITEUPS

## Part 1
I was not successful in creating the same features as before (java) because I am not very familiar with bash and i feel it is very different from java. In java I could import the localdate class and chronounit to calculate the difference between two dates which makes things very easy. However on bash, there are no libraries to import, at least not that i know of. The convenient thing about bash however is that it lets you format the date with its date class(?). User input is also easier because you only have to call read which is like the scanner object and output is just echo like system.out.print in java. Overall, i prefer java better because i am more familiar and comfortable with it. 

## Part 2
I am very lost doing this step. I wasn't sure how to compile from build.sh so i just comiled in my script.sh. I also wasn't sure how to go about the makefile i set my target to dates and dates.class. i wanted it so that dates.class will depend on dates.java and compile it. It didn't work. 

## Part 3
My group decided to use the dataset on the 2015 street tree census. We each decided on the qusestions we were going to do. For my part I sorted the file by searching for the keyword "good" and printed the area affiliated with the keyword. Then i sorted the file and used the uniq -c (count duplicates) and sort -nr (sort in descending numeric order) commands to output the data to another file ( > trees_output.csv) trees_output.csv. Then i used the comman NR==1, NR==5 to print lines 1-5 (the relevant info of my findings)of the output file. I'd say generally everything worked out pretty good. Communication within the group was good; we had a group chat. We originally had 4 members but one decided to withdraw in the end. 