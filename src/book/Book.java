package book;
public class Book {
    private  int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    private String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    private String author;
    
    public String getAuthor(){
        return author;

    }
    public  void setAuthor(String author){
        this.author=author;
    }
    private boolean isIssued;

        public void setIssued(boolean isIssued){
            this.isIssued=isIssued;
        }

            public boolean isIssued1() {
                return isIssued;
            } 
         }