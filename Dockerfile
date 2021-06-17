FROM tomcat:9-jre8-alpine
ADD HealthCareClinic.war /usr/local/tomcat/webapps/example.war
