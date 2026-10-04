import java.util.*;

class Solution {
    public boolean checkValidString(String s) {
        // Stack to store indices of open brackets '('
        Stack<Integer> openStack = new Stack<>();
        // Stack to store indices of asterisks '*'
        Stack<Integer> asteriskStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                openStack.push(i);
            } else if (ch == '*') {
                asteriskStack.push(i);
            } else { // Current char is ')'
                // Try to balance using an open bracket first
                if (!openStack.isEmpty()) {
                    openStack.pop();
                } 
                // If no '(' available, try to use a '*' as a '('
                else if (!asteriskStack.isEmpty()) {
                    asteriskStack.pop();
                } 
                // Nothing available to balance this ')', so it's invalid
                else {
                    return false;
                }
            }
        }

        // Post-processing: Match remaining '(' with remaining '*'
        // A '*' can only balance a '(' if the '*' comes AFTER the '(' (asterisk index > open index)
        while (!openStack.isEmpty() && !asteriskStack.isEmpty()) {
            if (openStack.peek() > asteriskStack.peek()) {
                return false; // The '(' appears after the '*', so the '*' cannot balance it
            }
            openStack.pop();
            asteriskStack.pop();
        }

        // If all open brackets are successfully balanced, the string is valid
        return openStack.isEmpty();
    }
}
