package Day12;


class Player {
    String name;
    int age;
    String MOM;        
    int bestScore;
    String country;
    String team;

   
    Player(String name, int age, String MOM, int bestScore, String country, String team) {
        this.name = name;
        this.age = age;
        this.MOM = MOM;
        this.bestScore = bestScore;
        this.country = country;
        this.team = team;
    }

    void displayPlayer() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("MOM: " + MOM);
        System.out.println("Best Score: " + bestScore);
        System.out.println("Country: " + country);
        System.out.println("Team: " + team);
    }
}


class Football extends Player {
    int goals;
    int assists;
    int highestScore;

    Football(String name, int age, String MOM, int bestScore, String country, String team,
             int goals, int assists, int highestScore) {

        super(name, age, MOM, bestScore, country, team);
        this.goals = goals;
        this.assists = assists;
        this.highestScore = highestScore;
    }

    void displayFootball() {
        displayPlayer();
        System.out.println("Goals: " + goals);
        System.out.println("Assists: " + assists);
        System.out.println("Highest Score: " + highestScore);
    }
}


class Cricket extends Player {
    int century;
    int halfCentury;
    int strikeRate;

    Cricket(String name, int age, String MOM, int bestScore, String country, String team,
            int century, int halfCentury, int strikeRate) {

        super(name, age, MOM, bestScore, country, team); 
        this.century = century;
        this.halfCentury = halfCentury;
        this.strikeRate = strikeRate;
    }

    void displayCricket() {
        displayPlayer();
        System.out.println("Centuries: " + century);
        System.out.println("Half Centuries: " + halfCentury);
        System.out.println("Strike Rate: " + strikeRate);
    }
}


public class Game {
    public static void main(String[] args) {
    	Cricket c = new Cricket("Virat Kohli",35,"Yes",183,"India","RCB",46,50,138);

        System.out.println("---- Cricket Player Details ----");
        c.displayCricket();
        
    }}
