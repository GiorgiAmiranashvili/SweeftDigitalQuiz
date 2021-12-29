fun main() {
    var n = 362; //We can insert any value! but value for 7.35$ is 735
    var k = 0;
        while (n>=50) {
           
            n=n-50;
            k++;
         
        }
        while (n>=20) {
            n=n-20;
            k++;
       
        }
        while (n>=10) {
            n=n-10;
            k++;
    
        }
        while (n>=5) {
            n=n-5;
            k++;
    
        }
    
        while (n>=1) {
            n=n-1;
            k++;
         
    
        }
        println(k);
    }