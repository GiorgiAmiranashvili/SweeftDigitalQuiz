fun main() {
    var inputElement: String = "peep";
    
    fun isPalindrome(text: String) {
        
        if (text.length % 2 == 0){
            var k = text.length/2;
            var part1: String = ""
            for (i in 0..text.length-k-1){
                part1 = part1 + text[i];
        	}
      
            var part2: String = ""
            for (i in text.length-1 downTo k) {
                part2 = part2 + text[i];
            }
            if (part1 == part2) {
           
                print("The text is palindrome")
            }
            else{ print("The text is not palindrome")}
        }
        else {
            var k = text.length/2;
            var part1: String = ""
            for (i in 0..text.length-k-2){
              
                part1 = part1 + text[i];
        	}
          
            var part2: String = ""
            for (i in text.length-1 downTo k+1) {
                part2 = part2 + text[i];
            }
            if (part1 == part2) {
         
                print("The text is palindrome")
            }
            else{ print("The text is not palindrome")}
            
        }
    }
    
   isPalindrome(inputElement);
}