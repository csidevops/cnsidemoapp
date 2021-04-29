FROM tomcat:9-jre8-alpine
ADD example.war /usr/local/tomcat/webapps/example.war
