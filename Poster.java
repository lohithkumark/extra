

public class Poster {
    

    int width;
    int length;
    String content;
    String material;

    public Poster(){

    }

    public Poster(int width )   {
        this.width=width;
    }

    public Poster(int width ,int length)   {
        this.width=width;
        this.length=length;
    }
    
    public Poster(int width ,int length,String content)   {
        this.width=width;
        this.length=length;
        this.content=content;
    }

    public Poster(int width ,int length,String content,String material)   {
        this.width=width;
        this.length=length;
        this.content=content;
        this.material=material;
    }

    public void PosterInfo(){
       
        {

        System.out.println("INFORMATION ABOUT POSTER IS:");
        System.out.println("Poster width is:" + this.width);
        System.out.println("Poster length is:" + this.length);
        System.out.println("Poster content is:" + this.content);
        System.out.println("Poster material is:" + this.material);

       
        
    }
  

    }
}

    
    

