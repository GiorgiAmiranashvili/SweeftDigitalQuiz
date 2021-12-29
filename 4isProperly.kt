fun main() {
    var inputString: String = "()(())"
        var k=0;
    var stack = ArrayDeque<Char>()
      for (i in 0..inputString.length-1){
          
          if (inputString[i]==')' && stack.size == 0) {
              println("Not Properly");
              k++;
              break
          }
          if (inputString[i]=='(') {
              stack.add(inputString[i]);
          }
          if (inputString[i]==')') {
              stack.remove(stack.last());
          }
      }
      if (k==0) {
          if (stack.size == 0) {
              println("Properly");
          }
          else {
              println("Not Properly");
          }
      }
    
    }