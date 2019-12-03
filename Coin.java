public class Coin{
    private String heads;
    private String tails;
    private int result;

    public Coin(){
        Flip();
    }

    public void Flip(){
        result = (int)(Math.random()*2);
    }


    public String getResult(){
        if(result == 2){
            return heads;
        }
        else{
            return tails;
        }
    }


    public String toString(){
        String faceName = "";
        faceName += "Result: " + result;
        return faceName;
    }
}