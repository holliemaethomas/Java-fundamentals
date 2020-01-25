package inheritance;

public class Review {
    private Restaurant restaurant;
    public double reviewRating;
    private String body;
    private String author;
    private Theater theater;
    private Shop shop;

    public Review(double reviewRating, String body, String author) {
        this.reviewRating = reviewRating;
        this.body = body;
        this.author = author;
    }

    public Review(String body, double reviewRating, String author, Restaurant restaurant) {
        this.body = body;
        this.reviewRating = reviewRating;
        this.author = author;
        restaurant.addReview(this);
    }

    public Review(String body, double reviewRating, String author, Theater theater) {
        this.body = body;
        this.reviewRating = reviewRating;
        this.author = author;
        theater.addReview(this);
    }


    public Review(String body, double reviewRating, String author, Shop shop) {
        this.body = body;
        this.reviewRating = reviewRating;
        this.author = author;
        shop.addReview(this);
    }

    public double getReviewRating() {
        return reviewRating;
    }

    public String getBody(){
        return body;
    }

    public String getAuthor(){
        return author;
    }

    public void setTheatre(Theater theater) {
        this.theater = theater;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Restaurant getRestaurant(){
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant){
        this.restaurant = restaurant;
    }


    public String toString() {
        return "received "+ this.reviewRating +" stars"+"| text: "+ this.body +"| author: "+this.author+"";
    }
}

// use3d method overide from www.geeksforgeeks.org/overloading-in-java/
//Travis helped me with using getters and setters format that repeated in this lab.