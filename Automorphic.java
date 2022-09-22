import java.util.Scanner;
 class Automorphic {
    public static void main(String[] args) {
    int n;
    Scanner in =new Scanner(System.in);
    System.out.println("enter the no.");
    n=in.nextInt();
    int temp=n;
    int sqr=n*n;
    int count=0;
    while(n!=0){
        int r=n%10;
        count++;
        n=n/10;
    }
    int z=1;
    while(count!=0){
        z=z*10;
        count--;
    }
    int ans=sqr%z;
    if(ans==temp){
        System.out.println("no. is automorphic");
    }
    else{
        System.out.println("not automorphic");
    }

} 
}
