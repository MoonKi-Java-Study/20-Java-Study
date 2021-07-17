class SharpPencil extends Pen {
    private int amount;

    public SharpPencil() { }
}

class BallPen extends Pen {
    private int amount;
    private String color;

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}

class FountainPen extends BallPen {
    private int amount;
    private String color;

    public void refill(int n){
        amount = n;
    }
}

public class Pen {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public static void main(String[] args) {
        SharpPencil sharpPencil = new SharpPencil();
        sharpPencil.setAmount(4);

        BallPen ballPen = new BallPen();
        ballPen.setAmount(7);
        ballPen.setColor("yellow");

        FountainPen fountainPen = new FountainPen();
        fountainPen.setAmount(9);
        fountainPen.setColor("red");

        System.out.println("Sharp pencil remains : " + sharpPencil.getAmount());

        System.out.println("\nBall pen remains : " + ballPen.getAmount());
        System.out.println("Color of ball pen : " + ballPen.getColor());

        System.out.println("\nFountain pen remains : " + fountainPen.getAmount());
        System.out.println("Color of fountain pen : " + fountainPen.getColor());
    }
}
