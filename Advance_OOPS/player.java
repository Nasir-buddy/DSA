package DSA.Advance_OOPS;

public class player {
    private String name;
    private char symbol;

    public player(String name, char symbol) {
        setName(name);
        setSymbol(symbol);
    }
    // setting name of the player
    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }
    }

    public String getname(){
        return this.name;
    }
    // symbol that we dont want in our name 
    public void setSymbol(char symbol){
        if(symbol != '\0'){
            this.symbol = symbol;
        }
    }

    public char getSymbol(){
        return this.symbol;
    }
}
