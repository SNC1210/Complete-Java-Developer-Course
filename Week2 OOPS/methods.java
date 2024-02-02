class computer 
{
    public void playMusic()
    {
        System.out.println("Music is playing...");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)
            return "pen";
        
        return "Nothing";
    }
}

public class methods {

    public static void main(String args[])
    {
        computer obj = new computer();
        obj.playMusic();

        String str = obj.getMeAPen(12);
        System.out.println(str);
    }
}