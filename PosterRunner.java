public class PosterRunner {
    
    public static void main(String[] args) {
        
        Poster poster = new Poster();
        poster.PosterInfo();
        System.out.println();

        Poster poster1 = new Poster(30);
        poster1.PosterInfo();
        System.out.println();

        Poster poster2 = new Poster(30,45);
        poster2.PosterInfo();
        System.out.println();

        Poster poster3 = new Poster(30,45,"Cricekt");
        poster3.PosterInfo();
        System.out.println();

        Poster poster4 = new Poster(30,40,"cricket","paper");
        poster4.PosterInfo();
    }
}
