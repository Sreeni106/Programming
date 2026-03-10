package PatternProgramming.Assesment;

public class EleventhPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            char ch=(char)(64+i);
            for(int j=1;j<=(n-i)+1;j++)
            {
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}
