fun main() {
    var n = 4; //Number of stairwells
    var startingPosition = 0;
    var a = 1;
    var b = 2;
    var stearsCount = 0;
     fun countVariants(index: Int) {
       
         if (index + a <= n){
            if (index + a == n) stearsCount++;
            countVariants(index + a); 
         } 
         if (index + b <= n){
            if (index + b == n) stearsCount++; 
            countVariants(index + b); 
         }
    
     }
    countVariants(startingPosition);
        println(stearsCount);
    }