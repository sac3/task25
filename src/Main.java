public class Main {
    static int h=0,v=0;
    static boolean flag = true;
    public static void main(String[] args) {


    for(int i=1,j=1; i<42; i++,j++){

        System.out.print(i+" ");

        {
                if(i%2 != 0){
                    i=i+2;
                }

                if(j == 2 || j == 9|| j ==15){
                    System.out.println("\n");
                }

            }
        }



    }
}