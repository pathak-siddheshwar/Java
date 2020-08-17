class Book{
    String name,author;
    double price;
    int quantity;
    Book(String name,String author,double price,int quantity){
        this.name=name;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
   }
   void getDetails(){
       System.out.println("the book details are as follows:");
       System.out.println(name);
       System.out.println(author);
       System.out.println(price);
       System.out.println(quantity);
   }
}