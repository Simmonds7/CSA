public class Algorithms
{
    public static void main(String args[])
    {
        Song[] topTenSongs = {  new Song("The Twist", 0, 3),
                new Song("Smooth", 0, 10),
                new Song("Mack the Knife", 0, 5),
                new Song("How do I Live", 0, 8),
                new Song("Party Rock Anthem", 0, 7),
                new Song("I Gotta feeling", 0, 9),
                new Song("Macarena", 0, 10),
                new Song("Physical",0,2),
                new Song("You Light Up My Life",0,3),
                new Song("Hey Jude",0,6),
                new Song("Crab Rave",0,10)
        };
        for (Song s: topTenSongs)
        {
            System.out.println(s.getTitle() + " | Price: $" + s.getPrice() + " | Rating : " + s.getRating());
        }
    }
}
