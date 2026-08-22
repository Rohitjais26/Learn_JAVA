package Constructor;

public class Movie {
    int id;
    String movieName;
    String director;

    Movie(int id , String movieName, String director){
        this.id= id;
        this.movieName=movieName;
        this.director = director;

    }

    public static void main(String[] args){
        Movie m = new Movie(101,"KGF", "Rajmoli");
        System.out.println(m.id);
        System.out.println(m.director);
        System.out.println(m.movieName);

        Movie m1 = new Movie(102,"RRR", "Tiwari");
        System.out.println(m1.id);
        System.out.println(m1.director);
        System.out.println(m1.movieName);

        Movie m2 = new Movie(102,"RR", "Tiwari");
        System.out.println(m2.id);
        System.out.println(m2.director);
        System.out.println(m2.movieName);
    }
}

// In This Program we have use parameterised Constructor .
// this is a keyword which is use to always to hold the curent object address.
//eg:- this.id = id;