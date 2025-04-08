public class Q1 {
    public static void main(String[] args){
    int [] numbers= {15,3,25,8,30};
    int max = numbers[0];
    for(int i=0;i<numbers.length;i++){
        if(max<numbers[i]){
            max=numbers[i];
}
    }
    System.out.print("Max :"+ max);
}}