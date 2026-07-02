FROM tomcat:11.0

RUN rm -rf /usr/local/tomcat/webapps/*

COPY target/*.war /usr/local/tomcat/webapps/webapp.war

EXPOSE 8080