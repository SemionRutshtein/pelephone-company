A test assignment from the company: Pelephone

Used Java with Spring Framework to develop the server side of the application.
To display it on the Front-End, I used View.Js connected to the index.html file
The user data are automatically saved in the h2 repository, from where we retrieve them later.

Just run Application class inside "src/main/java/il/pelephone/application"

Available end-points:

http://localhost:8080
Main application page with Vue.js component
Displays all employees, and their appointments for the week

http://localhost:8080/api/employers
Returns all employees saved in the database

http://localhost:8080/api/meets
The page that listens to the main page of the application - returns the list of all meetings by weeks.
