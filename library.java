//import javax.swing.plaf.synth.SynthOptionPaneUI;

class library1{
    String [] books;
    int no_of_books;

    library1(){
        this.books=new String[100];
        this.no_of_books=0;
    }

    void addBooks(String b){
        this.books[no_of_books]=b;
        no_of_books++;
        System.out.println(b + " is added to the library");
    }

    void showAvalablebooks(){
        System.out.println("The books available in the library are : ");
        for(String b : this.books){
            if(b == null){
                continue;
            }
            System.out.println(" *"+b);
        }
    }

    void issuebooks(String b){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(b)){
                System.out.println(b+" is issued to you");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book is not available in the library");
    }

    void returnbooks(String b){
        addBooks(b);
    }
}




public class library {
    public static void main(String[] args) {
        library1 lib=new library1();
        lib.addBooks("C++");
        lib.addBooks("Java");
        lib.addBooks("Python");
        lib.showAvalablebooks();
        lib.issuebooks("Java");
        lib.showAvalablebooks();
        lib.returnbooks("Java");
        lib.showAvalablebooks();
    }
}
