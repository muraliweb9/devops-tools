# DevOps Scripts
## Table of Contents
1. [AWS CLI](#awscli)
2. [AWS Console](#awsconsole)
3. [CONSUL](#consul)
4. [GIT](#git)
5. [Java](#java)
6. [MAVEN](#maven)
7. [TERRAFORM](#terraform)
<a name="awscli"></a><br>
## AWS CLI
#### ``awscc``
<b>Desc:   </b>Configure AWSCLI set credentials etc.<br>
<b>Usage:  </b>``awscc``<br>
<b>Actual: </b>``aws configure``<br>
#### ``awsci``
<b>Desc:   </b>Check the identity of caller<br>
<b>Usage:  </b>``awsci``<br>
<b>Actual: </b>``aws sts get-caller-identity``<br>
#### ``awscl``
<b>Desc:   </b>List lambda funstions<br>
<b>Usage:  </b>``awscl``<br>
<b>Actual: </b>``aws lambda list-functions``<br>
#### ``awsclu``
<b>Desc:   </b>List IAM users<br>
<b>Usage:  </b>``awsclu``<br>
<b>Actual: </b>``aws iam list-users``<br>
#### ``awscs3``
<b>Desc:   </b>List S3 buckets<br>
<b>Usage:  </b>``awscs3``<br>
<b>Actual: </b>``aws s3 ls``<br>
#### ``awscs3c``
<b>Desc:   </b>List S3 bucket contents<br>
<b>Usage:  </b>``awscs3c car-app-cloud-storage``<br>
<b>Actual: </b>``aws s3 ls car-app-cloud-storage``<br>
#### ``awscs3p``
<b>Desc:   </b>Copy S3 bucket<br>
<b>Usage:  </b>``awscs3p s3://car-app-cloud-storage/springbootadmin-0.0.1-SNAPSHOT.jar s3://car-app-cloud-storage-2/``<br>
<b>Actual: </b>``aws s3 cp s3://car-app-cloud-storage/springbootadmin-0.0.1-SNAPSHOT.jar s3://car-app-cloud-storage-2/``<br>
#### ``awscs3r``
<b>Desc:   </b>Create S3 bucket<br>
<b>Usage:  </b>``awscs3r car-app-cloud-storage-2 eu-west-2``<br>
<b>Actual: </b>``aws s3api create-bucket --bucket car-app-cloud-storage-2 --region eu-west-2 --create-bucket-configuration LocationConstraint=eu-west-2``<br>
<a name="awsconsole"></a><br>
## AWS Console
#### ``null``
<b>Desc:   </b>Find current user<br>
<b>Usage:  </b>``whoami``<br>
<b>Actual: </b>``whoami``<br>
#### ``null``
<b>Desc:   </b>Become root user<br>
<b>Usage:  </b>``sudo -i``<br>
<b>Actual: </b>``sudo -i``<br>
#### ``null``
<b>Desc:   </b>List all java packages available to install<br>
<b>Usage:  </b>``yum list java*``<br>
<b>Actual: </b>``yum list java*``<br>
#### ``null``
<b>Desc:   </b>List all java 17 packages available to install<br>
<b>Usage:  </b>``yum list java* ^| grep 17``<br>
<b>Actual: </b>``yum list java* ^| grep 17``<br>
#### ``null``
<b>Desc:   </b>Install Java 17<br>
<b>Usage:  </b>``sudo yum install java-17-amazon-corretto.x86_64``<br>
<b>Actual: </b>``sudo yum install java-17-amazon-corretto.x86_64``<br>
#### ``null``
<b>Desc:   </b>Remove Java 17<br>
<b>Usage:  </b>``sudo yum remove java-17-amazon-corretto.x86_64``<br>
<b>Actual: </b>``sudo yum remove java-17-amazon-corretto.x86_64``<br>
#### ``null``
<b>Desc:   </b>List (so can choose) available Java versions<br>
<b>Usage:  </b>``alternatives --config java``<br>
<b>Actual: </b>``alternatives --config java``<br>
#### ``null``
<b>Desc:   </b>Find ports occupied<br>
<b>Usage:  </b>``netstat -tulpn``<br>
<b>Actual: </b>``netstat -tulpn``<br>
#### ``null``
<b>Desc:   </b>Find ports occupied<br>
<b>Usage:  </b>``sudo ss -lntp``<br>
<b>Actual: </b>``sudo ss -lntp``<br>
#### ``null``
<b>Desc:   </b>Run curl on local port<br>
<b>Usage:  </b>``curl http://localhost:8080``<br>
<b>Actual: </b>``curl http://localhost:8080``<br>
<a name="consul"></a><br>
## CONSUL
#### ``cm``
<b>Desc:   </b>List the Consul members<br>
<b>Usage:  </b>``cm``<br>
<b>Actual: </b>``consul members -details``<br>
#### ``cs``
<b>Desc:   </b>Start Consul<br>
<b>Usage:  </b>``cs machine 8501``<br>
<b>Actual: </b>``consul agent -dev -node machine -http-port=8501``<br>
<a name="git"></a><br>
## GIT
#### ``gb``
<b>Desc:   </b>List branches<br>
<b>Usage:  </b>``gb``<br>
<b>Actual: </b>``git branch``<br>
#### ``gbm``
<b>Desc:   </b>Create a new branch from existing<br>
<b>Usage:  </b>``gbm new main``<br>
<b>Actual: </b>``git branch new main``<br>
#### ``gc``
<b>Desc:   </b>Checkout a branch<br>
<b>Usage:  </b>``gc main``<br>
<b>Actual: </b>``git checkout main``<br>
#### ``gca``
<b>Desc:   </b>Amend a Git Commit message<br>
<b>Usage:  </b>``gca``<br>
<b>Actual: </b>``git commit --amend``<br>
#### ``gconfig``
<b>Desc:   </b>List the git config<br>
<b>Usage:  </b>``gconfig``<br>
<b>Actual: </b>``git config --list``<br>
#### ``gcr``
<b>Desc:   </b>Amend a Git Commit rebase<br>
<b>Usage:  </b>``gcr main``<br>
<b>Actual: </b>``git rebase -i HEAD~main``<br>
#### ``glo``
<b>Desc:   </b>Log history<br>
<b>Usage:  </b>``glo``<br>
<b>Actual: </b>``git log --oneline``<br>
#### ``gm``
<b>Desc:   </b>Merge a branch to current branch<br>
<b>Usage:  </b>``gm main``<br>
<b>Actual: </b>``git merge main``<br>
#### ``gp``
<b>Desc:   </b>Pull origin<br>
<b>Usage:  </b>``gp``<br>
<b>Actual: </b>``git pull``<br>
#### ``gph``
<b>Desc:   </b>Push to origin<br>
<b>Usage:  </b>``gph feature/FT1``<br>
<b>Actual: </b>``git push origin feature/FT1:feature/FT1``<br>
#### ``gr``
<b>Desc:   </b>Git reset local changes<br>
<b>Usage:  </b>``gr``<br>
<b>Actual: </b>``git reset --hard HEAD``<br>
#### ``grepo``
<b>Desc:   </b>Show the remote repo<br>
<b>Usage:  </b>``grepo``<br>
<b>Actual: </b>``git config --get remote.origin.url``<br>
#### ``gs``
<b>Desc:   </b>Local status<br>
<b>Usage:  </b>``gs``<br>
<b>Actual: </b>``git status``<br>
#### ``gu``
<b>Desc:   </b>Setup a local branch to upstream branch<br>
<b>Usage:  </b>``gu localbranch``<br>
<b>Actual: </b>``git branch --set-upstream-to=origin/localbranch localbranch``<br>
<a name="java"></a><br>
## Java
#### ``j11``
<b>Desc:   </b>Set Java11<br>
<b>Usage:  </b>``j11``<br>
<b>Actual: </b>``set JAVA_HOME=C:\Apps\jdk-11.0.17
set PATH=%JAVA_HOME%\bin;%PATH%``<br>
#### ``j17``
<b>Desc:   </b>Set Java17<br>
<b>Usage:  </b>``j17``<br>
<b>Actual: </b>``set JAVA_HOME=C:\Apps\jdk-17.0.6
set PATH=%JAVA_HOME%\bin;%PATH%``<br>
#### ``j8``
<b>Desc:   </b>Set Java8<br>
<b>Usage:  </b>``j8``<br>
<b>Actual: </b>``set JAVA_HOME=C:\Apps\jdk1.8.0_202
set PATH=%JAVA_HOME%\bin;%PATH%``<br>
<a name="maven"></a><br>
## MAVEN
#### ``mc``
<b>Desc:   </b>maven clean install<br>
<b>Usage:  </b>``mc``<br>
<b>Actual: </b>``mvn clean install``<br>
#### ``mci``
<b>Desc:   </b>maven clean install (no tests)<br>
<b>Usage:  </b>``mci``<br>
<b>Actual: </b>``mvn clean install -DskipTests=true``<br>
#### ``msa``
<b>Desc:   </b>Maven code clean spotless<br>
<b>Usage:  </b>``msa``<br>
<b>Actual: </b>``mvn spotless:apply``<br>
<a name="terraform"></a><br>
## TERRAFORM
#### ``null``
<b>Desc:   </b>Build infra with placeholder vars<br>
<b>Usage:  </b>``to``<br>
<b>Actual: </b>``terraform apply -var "instance_name=VarMyTerraformCluster4"``<br>
#### ``ta``
<b>Desc:   </b>Build the infra<br>
<b>Usage:  </b>``ta``<br>
<b>Actual: </b>``terraform apply``<br>
#### ``td``
<b>Desc:   </b>Destroy the infra<br>
<b>Usage:  </b>``td``<br>
<b>Actual: </b>``terraform destroy``<br>
#### ``tf``
<b>Desc:   </b>Format the .tf files<br>
<b>Usage:  </b>``tf``<br>
<b>Actual: </b>``terraform fmt``<br>
#### ``ti``
<b>Desc:   </b>Download providers<br>
<b>Usage:  </b>``ti``<br>
<b>Actual: </b>``terraform init``<br>
#### ``to``
<b>Desc:   </b>Output variables<br>
<b>Usage:  </b>``to``<br>
<b>Actual: </b>``terraform output``<br>
#### ``ts``
<b>Desc:   </b>Show instance details<br>
<b>Usage:  </b>``ts``<br>
<b>Actual: </b>``terraform show``<br>
#### ``tsl``
<b>Desc:   </b>List instances<br>
<b>Usage:  </b>``tsl``<br>
<b>Actual: </b>``terraform state list``<br>
#### ``tv``
<b>Desc:   </b>Validate the .tf files<br>
<b>Usage:  </b>``tv``<br>
<b>Actual: </b>``terraform validate``<br>

