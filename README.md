# MyHealth Application

- Name: Sean Atherton
- Student Number: s3893785
- Student Email: s3893785@student.rmit.edu.au

--------------
## JDK Version

- openjdk version "11.0.18" 2023-01-17
- OpenJDK Runtime Environment Temurin-11.0.18+10 (build 11.0.18+10)
- OpenJDK 64-Bit Server VM Temurin-11.0.18+10 (build 11.0.18+10, mixed mode)

---------------
## Dependencies

- hamcrest-core-1.3
- junit-4.13.2
- sqlite-jdbc-3.41.2.1
- JavaFX-11

-------------------
## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

--------------------------
## How to Compile Program:

1. To get started, you need to extract the compressed file to a directory of your choice.
2. To compile the program, open a command prompt and navigate to the programs directory. For example, if the program is on the Desktop you would type:

    cd C:\Users\yourusername\Desktop\MyHealth

    Remember to replace C:\Users\mrsti\Desktop\MyHealth with the actual path of your program folder.
4. Now, you can compile all the Java files at once using the javac command. The -cp option is used to specify the classpath, and . means the current directory. src\*.java is a wildcard that matches all .java files in the 'src' directory.External .jar files are located in the lib folder of the program. Here's how you can compile by entering the following into the command prompt. *Navigate to your project directory

5. Generate the sources.txt file:

    dir /s /B src\*.java > sources.txt

6. Compile the Java files:

    javac -d bin -cp .;lib/* @sources.txt

7. This will compile all the source files and create class files in the bin directory.

------------------------------
## How to Run MyHealthTracker:

1. Navigate to your program directory:

   cd C:\Users\yourusername\Desktop\MyHealth

2. Set the PATH_TO_FX environment variable *The PATH_TO_FX environment variable should point to the lib directory of your installed JavaFX SDK. It is used to tell Java where to find the JavaFX modules required to run the program.:

    set PATH_TO_FX="C:\Program Files\Eclipse Adoptium\javafx-sdk-11\lib"

3. Run the MyHealth application:

    java --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml,javafx.base,javafx.graphics,javafx.media,javafx.swing,javafx.web -Dprism.order=sw -cp bin;lib/* application.MyHealthTracker

------------------------------
## How to Perform JUnit Tests:

Firstly, the JUnit test classes should be compiled. If they are not yet compiled, you can compile them in a similar way you did with the source files. Assuming they are already in the bin directory, you can run them as follows:

    java -cp bin;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore test.HealthRecordTest test.UserProfileTest test.UserTest


----------------
## TROUBLESHOOTING:

In case of any issues, confirm you're using the correct versions of JDK, JavaFX, and SQLite JDBC Driver. If the issue persists, refer to the respective software's official documentation

## RMIT University | Academic Integrity Warning


![image](https://user-images.githubusercontent.com/79836947/160737604-273c62fd-1503-4ce6-a292-a351665cc2e1.png#gh-dark-mode-only)
![image](https://user-images.githubusercontent.com/79836947/160738358-eaa88731-2a44-4004-ab9a-3d83a2268742.png#gh-light-mode-only)

Cheating is a serious offense:

> "What happens if you get caught cheating at RMIT? For serious breaches of academic integrity, students can be charged with academic misconduct. Possible penalties > include cancellation of results and expulsion resulting in the cancellation of a student's program."

Academic integrity - RMIT University

### Links:

 [RMIT Academic Integrity Awarness Micro Credential](https://www.rmit.edu.au/study-with-us/levels-of-study/short-courses/academic-integrity-awareness)
 
 [Academic Integrity at RMIT](https://www.rmit.edu.au/students/my-course/assessment-results/academic-integrity)
