package LibraryDemo;

// a class for transaction of books

public class BookBiz {

    //basic transaction methods
    //add new books, in and out, search, sort

    //*
    // get count of book object in Data.bookStore
    // */
    public int getBookCount() {

        int count = 0;
        for (Book book : Data.BookStore) {
            if (book == null) break;
            count++;
        }
        return count;
    }

    //put the object into the array
    //return if the adding operation is successful
    public boolean addBook(Book book) {

        int bookCount = getBookCount();
        if (Data.BookStore.length == bookCount) {
            return false;
        }
        Data.BookStore[bookCount] = book;
        return true;

    }

    //delete the book object
    public boolean delBook(Book book) {

        int bookCount = getBookCount();
        int delIndex = -1;
        for (int i = 0; i < bookCount; i++) {
            if (book.equals(Data.BookStore[i])) {

                delIndex = i;
                break;

            }
        }

        if(delIndex == -1){
            return false; //element not found, method ends
        }
            //proceed to delete
            for (int j = delIndex; j < bookCount - 1; j++) {
                Data.BookStore[j] = Data.BookStore[j + 1];
            }
            //empty the last element
            Data.BookStore[bookCount - 1] = null;
            return true;
        }

        //find books by book ID

        public Book findByID(String bookID){

        int bookCount = getBookCount();
            for (int i = 0; i < bookCount; i++) {
                if(bookID.equals(Data.BookStore[i].getBookID())){

                    return Data.BookStore[i];

                }
            }

            return null;
        }

        //add storage for existing books

        public boolean inStore(String bookID, int count){

             Book book = findByID(bookID);
             if(book == null)//this book does not exist
             {
                 return false;
             }
             // when the book exists, add the count
            book.setCount(book.getCount() + count);
             return true;

        }

        //subtract storage
        public boolean outStore(String bookID, int count){

        Book book = findByID(bookID);
        if(book == null){
            return false;
        }

        if(book.getCount() < count){
            return false;
        }

        book.setCount(book.getCount() - count);
        return true;

        }


    }



