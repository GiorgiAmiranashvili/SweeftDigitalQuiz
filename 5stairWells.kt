fun main() {
    var n = 4; //Number of stairwells
    var startingPosition = 0;
    var a = 1;
    var b = 2;
    var answer = 0;
     fun countWays(index: Int) {
       
         if (index + a <= n){
            if (index + a == n) answer++;
            countWays(index + a); 
         } 
         if (index + b <= n){
            if (index + b == n) answer++; 
            countWays(index + b); 
         }
    
     }
    countWays(startingPosition);
        println(answer);
    }