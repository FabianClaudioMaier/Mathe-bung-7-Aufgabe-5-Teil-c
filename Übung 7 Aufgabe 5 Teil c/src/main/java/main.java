import java.util.*;

public class main {
    public static void main(String[] args) {

        int[] primefactors = new int[]{2,2,3,3,5,7,11};

        HashSet<Integer> divisors = recursion(new HashSet<Integer>(),1,primefactors);

        ArrayList<Integer> output = new ArrayList<Integer>(divisors);
        Collections.sort(output);
        System.out.println(""+output);
    }

    public static HashSet<Integer> recursion(HashSet<Integer> set, int n, int[] primefactors){
        if(primefactors.length != 0){
            int currentNumber = primefactors[0];
            int exponent = 0;

            for (int p: primefactors) {
                if(p!=currentNumber)break;
                exponent++;
            }
            for (int i = 0; i <= exponent ; i++) {
                recursion(set,n*(int)Math.pow(currentNumber,i),Arrays.copyOfRange(primefactors,exponent,primefactors.length));
            }
        }
        set.add(n);
        return set;
    }

}
