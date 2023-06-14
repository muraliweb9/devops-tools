@echo off
echo ======================
echo AWS Console Short Cuts
echo ======================
echo alternatives --config java-^> alternatives --config java    -^> alternatives --config java              -^> List (so can choose) available Java versions      
echo curl http://localhost:8080-^> curl http://localhost:8080    -^> curl http://localhost:8080              -^> Run curl on local port                            
echo netstat -tulpn-^> netstat -tulpn                -^> netstat -tulpn                          -^> Find ports occupied                               
echo sudo -i-^> sudo -i                       -^> sudo -i                                 -^> Become root user                                  
echo sudo ss -lntp-^> sudo ss -lntp                 -^> sudo ss -lntp                           -^> Find ports occupied                               
echo sudo yum install java-17-amazon-corretto.x86_64-^> sudo yum install java-17-amazon-corretto.x86_64-^> sudo yum install java-17-amazon-corretto.x86_64-^> Install Java 17                                   
echo sudo yum remove java-17-amazon-corretto.x86_64-^> sudo yum remove java-17-amazon-corretto.x86_64-^> sudo yum remove java-17-amazon-corretto.x86_64-^> Remove Java 17                                    
echo whoami-^> whoami                        -^> whoami                                  -^> Find current user                                 
echo yum list java*-^> yum list java*                -^> yum list java*                          -^> List all java packages available to install       
echo yum list java* ^| grep 17-^> yum list java* ^| grep 17     -^> yum list java* ^| grep 17               -^> List all java 17 packages available to install    
