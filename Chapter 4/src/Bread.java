public class Bread {
    private String breadType;
    private int calories;
    public final String MOTTO = "The staff of Life.";   // The "public" tag was required by instructions

    public Bread(String name, int numCalories) {
        breadType = name;
        calories = numCalories;
    }

    public void display()
    {
        System.out.println(breadType + " bread is " + calories + " calories.");
        System.out.println("  " + MOTTO);
    }
}
