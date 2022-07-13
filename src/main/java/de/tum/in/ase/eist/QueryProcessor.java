package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "thommi";
        } else if (query.contains("plus")) {
            //what is 2 plus 0
            String[] wordlist = query.split(" ");
            int sum = 0;
            for (String word : wordlist) {
                try{
                    int intOfWord = Integer.parseInt(word);
                    sum += intOfWord;
                } catch (Exception e) {
                    //
                }

            }
            return String.valueOf(sum);
        } else if (query.contains("largest")) {
            //which of the following numbers is the largest: 141, 473, 71, 43
            String[] wordList = query.split(" ");
            int largest = 0;
            for (String word : wordList) {
                try{
                    int intOfWord = Integer.parseInt(word);
                    if (intOfWord > largest) {
                        largest = intOfWord;
                    }
                } catch (Exception e) {

                }
            }
            return String.valueOf(largest);

        } else { // TODO extend the programm here
            return "";
        }
        //hello world hello world
    }
}
