#!/bin/bash

# Install OpenJDK
apt update
apt install default-jdk

# Create Tomcat User
useradd -r -m -U -d /opt/tomcat -s /bin/false tomcat

# Install Tomcat (********Before running the script make sure you select the latest version of the tar file********)
wget https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.54/bin/apache-tomcat-9.0.54.tar.gz -P /tmp
tar xf /tmp/apache-tomcat-9.0.54.tar.gz -C /opt/tomcat
ln -s /opt/tomcat/apache-tomcat-9.0.54 /opt/tomcat/latest
chown -RH tomcat: /opt/tomcat/latest
sh -c 'chmod +x /opt/tomcat/latest/bin/*.sh'
