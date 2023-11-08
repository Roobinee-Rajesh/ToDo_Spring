# ToDo_Spring
Details of TodoSpringboot
 
I have created rest api called todospringboot
    First I have created model package,controller package,repository package.  
 
    I have todo pojo(Plain Old Java Object) class.  
 
    In Controller Class,I have created endpoints for GET,POST,PUT,DELETE.  
 
    I have created Todorepository in which i have done dependency injection of Jdbc template for connecting to database and used that jdbcTemplate for querying purpose.  
 
    All database related details i have kept in application.properties file.  
 
  
 
 
    GET:-For getting all todos from database.  
 
    POST:-For adding todos into database.  
 
    PUT:-For updating the todos which are in the database.  
 
    DELETE:-For Deleting the todods from the database.  
 
  
 
-------------BELOW ARE MY API'S WHICH HAVE TODO'S---------------------
 
 
    GET:-http://localhost:8080/todo/api/all  
 
    GET:-http://localhost:8080/todo/api/all/1  
 
    POST:-http://localhost:8080/todo/api/createtodo  
 
    PUT:-http://localhost:8080/todo/api/updatetodo  
 
    DELETE:-http://localhost:8080/todo/api/delete/1  
