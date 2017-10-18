#imagen base con tomcat y java 8
FROM tomcat:7-jre8-alpine
MAINTAINER ojcarrillo <ojesus.carrillo@javeriana.edu.co>
#copiamos el war del ws
ADD modeladows.war /usr/local/tomcat/webapps/modeladows.war
#exponemos el puerto del tomcat
EXPOSE 8080

