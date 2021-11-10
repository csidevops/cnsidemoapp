#!/bin/bash

# Install OpenJDK
apt update
apt install default-jdk
echo JDK installed in the linux server 

# Create Tomcat User
useradd -r -m -U -d /opt/tomcat -s /bin/false tomcat
echo Tomcat user has been created 

# Install Tomcat (********Before running the script make sure you select the latest version of the tar file********)
wget https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.54/bin/apache-tomcat-9.0.54.tar.gz -P /tmp
tar xf /tmp/apache-tomcat-9.0.54.tar.gz -C /opt/tomcat
ln -s /opt/tomcat/apache-tomcat-9.0.54 /opt/tomcat/latest
chown -RH tomcat: /opt/tomcat/latest
sh -c 'chmod +x /opt/tomcat/latest/bin/*.sh'
echo Tomcat server has been installed 

# Clone a Git repository to access tomcat xml files 
rm -rf cnsidemoapp
git clone https://github.com/csidevops/cnsidemoapp.git
echo git repoistory has been cloned 

# Copy tomcat service file to tomcat directory 
cp ./cnsidemoapp/terraform/linuxvm/tomcat.service /etc/systemd/system/tomcat.service
echo Tomcat service file has been created 

# Start the tomcat service using the above tomcat.service file 
systemctl daemon-reload
systemctl status tomcat
systemctl enable tomcat
ufw allow 8080/tcp
echo Tomcat service has been started 
