package org.example.lessons.challenges;

public class TeenagerReply {

    public static void main(String[] args) {

        Bob bob = new Bob();
        System.out.println(bob.hey("Tom-ay-to, tom-aaaah-to."));//Whatever.",
        System.out.println(bob.hey("WATCH OUT!")); // Whoa, chill out!
        System.out.println(bob.hey("FCECDFCAAB")); // Whoa, chill out!
        System.out.println(bob.hey("Does this cryogenic chamber make me look fat?")); // Sure.
        System.out.println(bob.hey("You are, what, like 15?")); // Sure.
        System.out.println(bob.hey("fffbbcbeab?")); // Sure.
        System.out.println(bob.hey("WHAT'S GOING ON?")); // Calm down, I know what I'm doing!
        System.out.println(bob.hey("")); // Fine. Be that way!.


    }

    public static class Bob {

        private String angryQuestion = "Calm down, I know what I'm doing!";
        private String happyQuestion = "Sure.";
        private String shouting = "Whoa, chill out!";
        private String empty = "Fine. Be that way!";
        private String other = "Whatever.";

        public String hey(String input) {

            // remove white space from beginning and end
            String noWhiteSpace = input.strip();

            // check to see that stripped string contains something
            if (noWhiteSpace.length() == 0) {
                return empty;
            }

            // check if all letters are uppercase
            if (containsOnlyUppercaseLetters(noWhiteSpace)) {
                // check if last character is ?
                if (noWhiteSpace.charAt(noWhiteSpace.length()-1) == '?') {
                    return angryQuestion;
                }
                // if not, just shouting
                return shouting;
            }

            // check for non angry question
            if (noWhiteSpace.charAt(noWhiteSpace.length()-1) == '?') return happyQuestion;

            return other;


            //
        }

        public static boolean containsOnlyUppercaseLetters(String input) {
            boolean hasLetter = false;

            for (char ch : input.toCharArray()) {
                if (Character.isLetter(ch)) {
                    hasLetter = true;
                    if (!Character.isUpperCase(ch)) {
                        return false;
                    }
                }
            }

            return hasLetter;
        }



    }

}