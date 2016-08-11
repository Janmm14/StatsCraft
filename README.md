# StatsCraft
The main repository for the StatsCraft web project.

## Building
StatsCraft uses Maven. Simply run the main class and it will start up a web server on your local system. Navigate to http://localhost:8080 in your browser. If it worked, you're ready to start coding!
Make sure you test all your code before pushing it to the repository.

You will also need a local MongoDB instance running in order to test it properly. A simple Google search and about 10 minutes will get you up and running.

## Deployment
To deploy, run `mvn clean package` in the project's root folder (alongside pom.xml). It will create a runnable JAR file that will start the
service on port 8080.

## License
This project is licensed under the MIT License. 
