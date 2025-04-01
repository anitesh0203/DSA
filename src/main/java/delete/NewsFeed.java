package delete;

public class NewsFeed {
    public static void main(String[] args) {
        FeedInterface feedInterface = x-> { return x*22; } ;
        FeedInterface feedInterface1 = x-> { return x/3; } ;


        System.out.println(feedInterface.calculateAge(22));
        System.out.println(feedInterface1.calculateAge(22));

    }
}
