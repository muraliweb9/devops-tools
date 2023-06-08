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
### AWS CLI
#### ``awscc``
Desc:   Configure AWSCLI set credentials etc.<br>
Usage:  awscc<br>
Actual: aws configure<br>
#### ``awsci``
Desc:   Check the identity of caller<br>
Usage:  awsci<br>
Actual: aws sts get-caller-identity<br>
#### ``awscl``
Desc:   List lambda funstions<br>
Usage:  awscl<br>
Actual: aws lambda list-functions<br>
#### ``awsclu``
Desc:   List IAM users<br>
Usage:  awsclu<br>
Actual: aws iam list-users<br>
#### ``awscs3``
Desc:   List S3 buckets<br>
Usage:  awscs3<br>
Actual: aws s3 ls<br>
#### ``awscs3c``
Desc:   List S3 bucket contents<br>
Usage:  awscs3c car-app-cloud-storage<br>
Actual: aws s3 ls car-app-cloud-storage<br>
#### ``awscs3p``
Desc:   Copy S3 bucket<br>
Usage:  awscs3p s3://car-app-cloud-storage/springbootadmin-0.0.1-SNAPSHOT.jar s3://car-app-cloud-storage-2/<br>
Actual: aws s3 cp s3://car-app-cloud-storage/springbootadmin-0.0.1-SNAPSHOT.jar s3://car-app-cloud-storage-2/<br>
#### ``awscs3r``
Desc:   Create S3 bucket<br>
Usage:  awscs3r car-app-cloud-storage-2 eu-west-2<br>
Actual: aws s3api create-bucket --bucket car-app-cloud-storage-2 --region eu-west-2 --create-bucket-configuration LocationConstraint=eu-west-2<br>
<a name="awsconsole"></a><br>
### AWS Console
#### ``null``
Desc:   Find current user<br>
Usage:  whoami<br>
Actual: whoami<br>
#### ``null``
Desc:   Become root user<br>
Usage:  sudo -i<br>
Actual: sudo -i<br>
#### ``null``
Desc:   List all java packages available to install<br>
Usage:  yum list java*<br>
Actual: yum list java*<br>
#### ``null``
Desc:   List all java 17 packages available to install<br>
Usage:  yum list java* ^| grep 17<br>
Actual: yum list java* ^| grep 17<br>
#### ``null``
Desc:   Install Java 17<br>
Usage:  sudo yum install java-17-amazon-corretto.x86_64<br>
Actual: sudo yum install java-17-amazon-corretto.x86_64<br>
#### ``null``
Desc:   Remove Java 17<br>
Usage:  sudo yum remove java-17-amazon-corretto.x86_64<br>
Actual: sudo yum remove java-17-amazon-corretto.x86_64<br>
#### ``null``
Desc:   List (so can choose) available Java versions<br>
Usage:  alternatives --config java<br>
Actual: alternatives --config java<br>
#### ``null``
Desc:   Find ports occupied<br>
Usage:  netstat -tulpn<br>
Actual: netstat -tulpn<br>
#### ``null``
Desc:   Find ports occupied<br>
Usage:  sudo ss -lntp<br>
Actual: sudo ss -lntp<br>
#### ``null``
Desc:   Run curl on local port<br>
Usage:  curl http://localhost:8080<br>
Actual: curl http://localhost:8080<br>
<a name="consul"></a><br>
### CONSUL
#### ``cm``
Desc:   List the Consul members<br>
Usage:  cm<br>
Actual: consul members -details<br>
#### ``cs``
Desc:   Start Consul<br>
Usage:  cs machine 8501<br>
Actual: consul agent -dev -node machine -http-port=8501<br>
<a name="git"></a><br>
### GIT
#### ``gb``
Desc:   List branches<br>
Usage:  gb<br>
Actual: git branch<br>
#### ``gbm``
Desc:   Create a new branch from existing<br>
Usage:  gbm new main<br>
Actual: git branch new main<br>
#### ``gc``
Desc:   Checkout a branch<br>
Usage:  gc main<br>
Actual: git checkout main<br>
#### ``gca``
Desc:   Amend a Git Commit message<br>
Usage:  gca<br>
Actual: git commit --amend<br>
#### ``gconfig``
Desc:   List the git config<br>
Usage:  gconfig<br>
Actual: git config --list<br>
#### ``gcr``
Desc:   Amend a Git Commit rebase<br>
Usage:  gcr main<br>
Actual: git rebase -i HEAD~main<br>
#### ``glo``
Desc:   Log history<br>
Usage:  glo<br>
Actual: git log --oneline<br>
#### ``gm``
Desc:   Merge a branch to current branch<br>
Usage:  gm main<br>
Actual: git merge main<br>
#### ``gp``
Desc:   Pull origin<br>
Usage:  gp<br>
Actual: git pull<br>
#### ``gph``
Desc:   Push to origin<br>
Usage:  gph feature/FT1<br>
Actual: git push origin feature/FT1:feature/FT1<br>
#### ``gr``
Desc:   Git reset local changes<br>
Usage:  gr<br>
Actual: git reset --hard HEAD<br>
#### ``grepo``
Desc:   Show the remote repo<br>
Usage:  grepo<br>
Actual: git config --get remote.origin.url<br>
#### ``gs``
Desc:   Local status<br>
Usage:  gs<br>
Actual: git status<br>
#### ``gu``
Desc:   Setup a local branch to upstream branch<br>
Usage:  gu localbranch<br>
Actual: git branch --set-upstream-to=origin/localbranch localbranch<br>
<a name="java"></a><br>
### Java
#### ``j11``
Desc:   Set Java11<br>
Usage:  j11<br>
Actual: set JAVA_HOME=C:\Apps\jdk-11.0.17
set PATH=%JAVA_HOME%\bin;%PATH%<br>
#### ``j17``
Desc:   Set Java17<br>
Usage:  j17<br>
Actual: set JAVA_HOME=C:\Apps\jdk-17.0.6
set PATH=%JAVA_HOME%\bin;%PATH%<br>
#### ``j8``
Desc:   Set Java8<br>
Usage:  j8<br>
Actual: set JAVA_HOME=C:\Apps\jdk1.8.0_202
set PATH=%JAVA_HOME%\bin;%PATH%<br>
<a name="maven"></a><br>
### MAVEN
#### ``mc``
Desc:   maven clean install<br>
Usage:  mc<br>
Actual: mvn clean install<br>
#### ``mci``
Desc:   maven clean install (no tests)<br>
Usage:  mci<br>
Actual: mvn clean install -DskipTests=true<br>
#### ``msa``
Desc:   Maven code clean spotless<br>
Usage:  msa<br>
Actual: mvn spotless:apply<br>
<a name="terraform"></a><br>
### TERRAFORM
#### ``null``
Desc:   Build infra with placeholder vars<br>
Usage:  to<br>
Actual: terraform apply -var "instance_name=VarMyTerraformCluster4"<br>
#### ``ta``
Desc:   Build the infra<br>
Usage:  ta<br>
Actual: terraform apply<br>
#### ``td``
Desc:   Destroy the infra<br>
Usage:  td<br>
Actual: terraform destroy<br>
#### ``tf``
Desc:   Format the .tf files<br>
Usage:  tf<br>
Actual: terraform fmt<br>
#### ``ti``
Desc:   Download providers<br>
Usage:  ti<br>
Actual: terraform init<br>
#### ``to``
Desc:   Output variables<br>
Usage:  to<br>
Actual: terraform output<br>
#### ``ts``
Desc:   Show instance details<br>
Usage:  ts<br>
Actual: terraform show<br>
#### ``tsl``
Desc:   List instances<br>
Usage:  tsl<br>
Actual: terraform state list<br>
#### ``tv``
Desc:   Validate the .tf files<br>
Usage:  tv<br>
Actual: terraform validate<br>

