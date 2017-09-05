# EnvSpecificApplicationProperties

Spring Starter
-web
-actuator
-devtools

Envionmnet Specific Application Properties

mvn clean
mvn eclipse:eclipse
mvn -U install
mvn spring-boot:run

http://localhost:8080/health

Run the api:
from target folder: java -jar *.jar

The below command will pick application-prod.properties
java -jar -Dspring.profiles.active=prod EnvSpecificApplicationProperties-0.0.1-SNAPSHOT.jar

Hit the endpoiont 
http://localhost:8080//EnvSpecificApplicationProperties/GetCurrentEnvironment 
and see logs

We are not supplying the enviorment so application.properites will be picked
java -jar EnvSpecificApplicationProperties-0.0.1-SNAPSHOT.jar
Hit the endpoiont 
http://localhost:8080//EnvSpecificApplicationProperties/GetCurrentEnvironment 
and see logs


since QA's application-qa.properties is not there So this will pick the default (application.properties)
java -jar -Dspring.profiles.active=QA EnvSpecificApplicationProperties-0.0.1-SNAPSHOT.jar
Hit the endpoiont 
http://localhost:8080//EnvSpecificApplicationProperties/GetCurrentEnvironment 
and see logs
