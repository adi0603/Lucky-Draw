import java.io.*;
class Lucky_Draw
{
    public static void main(String args[])throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        char c=0x2746;
        char w=0x2747;
        System.out.println(c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" ");
        System.out.println("                            Hi!");
        System.out.println(c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" ");
        Thread.sleep(2500);
        System.out.println("\f");
        System.out.println(c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" ");
        System.out.println("                Welcome to Lucky Draw");
        System.out.println(c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" ");
        Thread.sleep(2500);
        System.out.println("\f");
        System.out.println(c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" ");
        System.out.println("You can now enter the required formalities.");
        System.out.println(c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" ");
        Thread.sleep(2500);
        System.out.println("\f");
        System.out.println(c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" ");
        System.out.println("How many names for Lucky Draw you want to enter.");
        int n=Integer.parseInt(br.readLine());
        System.out.println("How many Lucky names you want to know.");
        int b=Integer.parseInt(br.readLine());
        System.out.println(c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" ");
        Thread.sleep(1500);
        System.out.println("\f");
        System.out.println(c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" ");
        String na[]=new String[n];
        for(int x=0;x<n;x++)
        {
            System.out.println("Enter name "+(x+1)+" for Lucky Draw.");
            na[x]=br.readLine();
        }
        System.out.println(c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" ");
        System.out.println("\f");
        System.out.println(c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" ");
        System.out.println("No.\tNames");
        int count=0;
        int x=0;
        while(x<b)
        {
            int r=(int)((n-1+1)*Math.random()+1);
            if(na[r-1].length()>0)
            {
                Thread.sleep(2000);
                System.out.println((c)+"\t"+na[r-1]);
                na[r-1]="";
                x++;
                count++;
            }
        }
        System.out.println("Congratulation to "+(count==1?("you.........."):("all "+count+" of you..........")));
        System.out.println(c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" "+w+" "+c+" ");
    }
}