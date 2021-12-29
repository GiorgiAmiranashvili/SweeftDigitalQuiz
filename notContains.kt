fun main() {
    val Numbers = intArrayOf(2, 10, 13, 15, 18)
    
    Numbers.sort();
    fun notContains (Values: IntArray){
        var k = 0;
        for (i in 0..Values.size-1) {
            if (Values[0] > 1 ) {
                    println(1);
                    k++;
                    break
                    
                }
            if (Values[i] > 1 && Values[i] != Values[i-1]+1) {
                    println(Values[i-1]+1);
                    k++;
                    break
                    
                }
             
            }
           if (k==0){
      
                   println((Values[Values.size-1])+1);}
            
            }
    notContains(Numbers);
    }