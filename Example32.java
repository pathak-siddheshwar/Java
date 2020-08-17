class Example32{
    public static void main(String[] a)
    {
        Author au=new Author("bose","bose@gmail.com",'M');
        Book b=new Book("who moved my cheese",au.name,5000,50);
        au.getDetails();
        b.getDetails();
    }
}