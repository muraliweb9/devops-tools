@echo off
echo ======================
echo AWS EC2 Putty Commands
echo ======================
echo wai   -^> whoami                                           -^> Find logged in user
echo wai   -^> sudo -i                                          -^> Become super user
echo yl    -^> yum list java*                                   -^> All available java to install
echo yl17  -^> yum list java* ^| grep 17                         -^> All available java **17** to install
echo ji    -^> sudo yum install java-17-amazon-corretto.x86_64  -^> Install Java 17
echo jr    -^> sudo yum remove java-17-amazon-corretto.x86_64   -^> Remove Java 17
echo jr    -^> alternatives --config java                       -^> List all INSTALLED java
echo ns    -^> netstat -tulpn                                   -^> Listening ports  


