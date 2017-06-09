# RESTful-API-JAX-RS

Here developing APIs in Java using jersey.


Developed 4 Api to perform CRUD operations using GET, POST, PUT, DELETE Request Method.

For Data storage using Collection Framework and not any Database.
2 data list are added previously. New can be added by running POST request.


All Response are returned in JSON format.

It has total 5 api
1. To get all messages.
2. To get specific message by id.
3. To add a new message.
4. To update a message.
5. To delete a message.


GET Method
http://localhost:8080/REST-API-JAX-RS/crudapi/messages - To get all existing messages.

http://localhost:8080/REST-API-JAX-RS/crudapi/messages/{messageId} - To get message with given id.



POST Method
http://localhost:8080/REST-API-JAX-RS/crudapi/messages/add - To add new Data (In header set Content-Type as application/json enter body as raw with type JSON.)


PUT Method
http://localhost:8080/REST-API-JAX-RS/crudapi/messages/{messageId} - To update an existing record  (In header set Content-Type as application/json enter body as raw with type JSON.)


DELETE Method
http://localhost:8080/REST-API-JAX-RS/crudapi/messages/{messageId} - To delete a record 
