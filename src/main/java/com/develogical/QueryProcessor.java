package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        System.out.println("query = "+query);
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("marlowe")){
            return "Christopher Marlowe, (baptised 26 February 1564 – 30 May 1593), " +
                    "was an English playwright, poet and translator of the Elizabethan era." +
                    " Marlowe is among the most famous of the Elizabethan playwrights.";
        }

        if (query.toLowerCase().contains("what is your name")){
            return "Sue & Ece";
        }

        if (query.toLowerCase().contains("numbers is the largest")){
            String[] v = query.split(":");
            System.out.println("v = "+v[2]);
            NumberComparer numberComparer = new NumberComparer();
            return ""+numberComparer.getMax(v[2]);
        }
        if (query.toLowerCase().contains("plus")){
            NumberComparer numberComparer = new NumberComparer();
            return ""+numberComparer.add(query);
        }
        if (query.toLowerCase().contains("minus")){
            NumberComparer numberComparer = new NumberComparer();
            return ""+numberComparer.minus(query);
        }



            return "";
    }
}


