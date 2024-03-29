package inheritance;

import java.util.StringJoiner;

public class Restaurant {
    double stars;
    String name;
    int price;

    //Will store the reviews as a linked list. This is the head.
    Node head;

    //Restaurant Constructor
    public Restaurant(String name, int price){
        this.name = name;
        this.price = price;
    }


    class Node {
        Review data;
        Node next;

        Node(Review data){
            this(data, null);
        }

        Node(Review data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    //adds a node at the beginning
    protected void insertHeadReview(Review data) {this.head = new Node(data, this.head);}

    protected void updateStars(){
        double total = 0;
        double count = 0;

        //If there's not reviews then throw an error
        if(head == null){
            System.out.println("No reviews found");
        } else {
            Node currNode = this.head;

            //For each review updates the count and adds to total.
            while(currNode != null){
                total += currNode.data.stars;
                count++;
                currNode = currNode.next;
            }

            //Updates the stars with the average
            this.stars = total/count;
        }
    }

    //adds a review to the head of the list
    public void addReviewHead(String name, String body, int stars){
        insertHeadReview(new Review(name, body, stars));
        updateStars();
    }

    @Override
    public String toString(){
        return String.format("%s has %s stars and $%s price.",this.name, this.stars, this.price);
    }

    public String reviewsReturn(){
        StringJoiner sj = new StringJoiner("\n");
        //If there's not reviews then throw an error
        if(head == null){
            System.out.println("No reviews found");
        } else {
            Node currNode = this.head;

            //For each review updates the count and adds to total.
            while(currNode != null){
                sj.add(currNode.data.toString());
                currNode = currNode.next;
            }

            //Updates the stars with the average
        }
        return sj.toString();
    }
}
