public class ReverseString {
    public static void main(String[] args) {
        String original = "hello world";
        char[] characters = original.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            // Swap characters
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        // Convert the character array back to a string
        String reversed = new String(characters);
        System.out.println("Reversed string: " + reversed);
    }
    
}
