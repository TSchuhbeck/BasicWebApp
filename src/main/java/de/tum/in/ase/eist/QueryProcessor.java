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
            String first = query.substring(8, 1);
            String second = query.substring(13, 1);
            int result = Integer.parseInt(first) + Integer.parseInt(second);
            return String.valueOf(result);
        } else { // TODO extend the programm here
            return "";
        }
        //hello world hello world
    }
}
