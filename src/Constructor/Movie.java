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
    }
}
