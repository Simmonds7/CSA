public class ArrayMediaLib
{


    public static void main(String args[])
    {/*
        String[] sharingFriends = { "Jamal",
                                    "Emily",
                                    "Destiny",
                                    "Mateo",
                                    "Sofia"
    };
    for (int i = 0; i < sharingFriends.length; i++)
    {
        System.out.println(sharingFriends[i]);
    }

    int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
    int total = 0;
    for (int value: daysBtwnPurchase)
    {
        total = daysBtwnPurchase[value] + total;
    }

    System.out.println(total/daysBtwnPurchase.length);
    */
    Song[] topTenSongs = {  new Song("The Twist", 0),
                            new Song("Smooth", 0),
                            new Song("Mack the Knife", 0),
                            new Song("How do I Live", 0),
                            new Song("Party Rock Anthem", 0),
                            new Song("I Gotta feeling", 0),
                            new Song("Macarena", 0),
                            new Song("Physical",0),
                            new Song("You Light Up My Life",0),
                            new Song("Hey Jude",0),
                            new Song("Crab Rave",0)
    };
        /* change the array
        System.out.println("-BEFORE--");
        for (Song changeSong : topTenSongs) {
            changeSong = new Song("test");
            System.out.println(changeSong.getTitle());
        }
        // show the array
        System.out.println("-AFTER--");
        for (Song showSong : topTenSongs) {
            System.out.println(showSong.getTitle());
        } */
        int count = 1;
    for (Song s: topTenSongs)
    {
        if (count % 3 == 0 ) {
            s.setPrice(0.99);
        }
        else
        {
            s.setPrice(1.29);
        }
        count = count + 1;
            System.out.println(s.getTitle() + " | Price: $" + s.getPrice());
    }
    }

}
