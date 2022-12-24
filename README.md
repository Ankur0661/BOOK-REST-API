# BOOK-REST-API

Perform crud on the following table using Spring Boot

**Book will contain this information :**

```
    Book Id : 101,
    name: "C++",
    author: "Nitesh",
    publication: "Rajput Publication",
    category: "Computer Programming",
    pages: 1500,
    price: 240
```

- Book :
    - **Get All books information**
        - To get a list of books call the following endpoint with GET Request
        - Endpoint: [http://localhost:8080/bookservice/books](http://localhost:8080/bookservice/books)
        
    - **Get the information of any particular book by id**
        - To get a particular book, use the following URL with GET request type in postman
        - Endpoint : [http://localhost:8080/bookservice/books/](http://localhost:8080/bookservice/books/)<id>
        
    - **Create a new Book**
        - To Create New Book use the following URL with POST Request
        - Endpoint: [http://localhost:8080/bookservice/books](http://localhost:8080/bookservice/books)
        
    - **Delete Book**
        - To delete a particular Book from the database
        - Endpoint: [http://localhost:8080/bookservice/books/](http://localhost:8080/bookservice/books/)<id>
        
    - **Update Book**
        - To update Book in database, use following url with PUT request type in postman
        - Endpoint : [http://localhost:8080/bookservice/books/](http://localhost:8080/bookservice/books/)<id>
