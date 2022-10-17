# JavaGUI
Template and boiler plate code for a Java GUI Application

# Commands 
./gradlew run - run the application
./gradlew build - build the jar file (jar file located under app/build/libs)

# intellij configuration argument and java -jar argument
--module-path ${PATH_TO_FX} --add-modules=javafx.controls,javafx.fxml,javafx.swing,javafx.web
java --module-path ${PATH_TO_FX} --add-modules=javafx.controls,javafx.fxml,javafx.swing,javafx.web -jar ./app.jar
Download the fx from the official website

more info on the config, https://stackoverflow.com/questions/53533486/how-to-open-javafx-jar-file-with-jdk-11