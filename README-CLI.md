# DevOps Scripts
## Table of Contents
1. [AWS CLI](#awscli) [awsc] 
2. [AWS Console](#awsconsole) [awsn] 
3. [CONSUL](#consul) [c] 
4. [GIT](#git) [g] 
5. [Java](#java) [j] 
6. [MAVEN](#maven) [m] 
7. [NOMAD](#nomad) [n] 
8. [TERRAFORM](#terraform) [t] 
9. [VAULT](#vault) [v] 
<a name="awscli"></a><br>
## AWS CLI
### <ins>awscc</ins>
<b>Desc:   </b>Configure AWSCLI set credentials etc.<br>
<b>Usage:  </b>``awscc``<br>
<b>Actual: </b>``aws configure``<br>
### <ins>awsci</ins>
<b>Desc:   </b>Check the identity of caller<br>
<b>Usage:  </b>``awsci``<br>
<b>Actual: </b>``aws sts get-caller-identity``<br>
### <ins>awscl</ins>
<b>Desc:   </b>List lambda funstions<br>
<b>Usage:  </b>``awscl``<br>
<b>Actual: </b>``aws lambda list-functions``<br>
### <ins>awsclu</ins>
<b>Desc:   </b>List IAM users<br>
<b>Usage:  </b>``awsclu``<br>
<b>Actual: </b>``aws iam list-users``<br>
### <ins>awscs3</ins>
<b>Desc:   </b>List S3 buckets<br>
<b>Usage:  </b>``awscs3``<br>
<b>Actual: </b>``aws s3 ls``<br>
### <ins>awscs3c</ins>
<b>Desc:   </b>List S3 bucket contents<br>
<b>Usage:  </b>``awscs3c car-app-cloud-storage``<br>
<b>Actual: </b>``aws s3 ls car-app-cloud-storage``<br>
### <ins>awscs3p</ins>
<b>Desc:   </b>Copy S3 bucket<br>
<b>Usage:  </b>``awscs3p s3://car-app-cloud-storage/springbootadmin-0.0.1-SNAPSHOT.jar s3://car-app-cloud-storage-2/``<br>
<b>Actual: </b>``aws s3 cp s3://car-app-cloud-storage/springbootadmin-0.0.1-SNAPSHOT.jar s3://car-app-cloud-storage-2/``<br>
### <ins>awscs3r</ins>
<b>Desc:   </b>Create S3 bucket<br>
<b>Usage:  </b>``awscs3r car-app-cloud-storage-2 eu-west-2``<br>
<b>Actual: </b>``aws s3api create-bucket --bucket car-app-cloud-storage-2 --region eu-west-2 --create-bucket-configuration LocationConstraint=eu-west-2``<br>
<a name="awsconsole"></a><br>
## AWS Console
### <ins>alternatives --config java</ins>
<b>Desc:   </b>List (so can choose) available Java versions<br>
<b>Usage:  </b>``alternatives --config java``<br>
<b>Actual: </b>``alternatives --config java``<br>
### <ins>curl http://localhost:8080</ins>
<b>Desc:   </b>Run curl on local port<br>
<b>Usage:  </b>``curl http://localhost:8080``<br>
<b>Actual: </b>``curl http://localhost:8080``<br>
### <ins>netstat -tulpn</ins>
<b>Desc:   </b>Find ports occupied<br>
<b>Usage:  </b>``netstat -tulpn``<br>
<b>Actual: </b>``netstat -tulpn``<br>
### <ins>puttygen golden-tick.ppk -O private-openssh -o golden-tick.pem</ins>
<b>Desc:   </b>Convert PPK to PEM security key<br>
<b>Usage:  </b>``puttygen golden-tick.ppk -O private-openssh -o golden-tick.pem``<br>
<b>Actual: </b>``puttygen golden-tick.ppk -O private-openssh -o golden-tick.pem``<br>
### <ins>ssh -i "golden-tick.pem" ec2-user@ec2-3-10-21-100.eu-west-2.compute.amazonaws.com</ins>
<b>Desc:   </b>SSH into an EC2 instance<br>
<b>Usage:  </b>``ssh -i "golden-tick.pem" ec2-user@ec2-3-10-21-100.eu-west-2.compute.amazonaws.com``<br>
<b>Actual: </b>``ssh -i "golden-tick.pem" ec2-user@ec2-3-10-21-100.eu-west-2.compute.amazonaws.com``<br>
### <ins>sudo -i</ins>
<b>Desc:   </b>Become root user<br>
<b>Usage:  </b>``sudo -i``<br>
<b>Actual: </b>``sudo -i``<br>
### <ins>sudo def install java-1.8.0-amazon-corretto</ins>
<b>Desc:   </b>Install Java 8 JRE<br>
<b>Usage:  </b>``sudo def install java-1.8.0-amazon-corretto``<br>
<b>Actual: </b>``sudo def install java-1.8.0-amazon-corretto``<br>
### <ins>sudo def install java-1.8.0-amazon-corretto-devel</ins>
<b>Desc:   </b>Install Java 8 JDK<br>
<b>Usage:  </b>``sudo def install java-1.8.0-amazon-corretto-devel``<br>
<b>Actual: </b>``sudo def install java-1.8.0-amazon-corretto-devel``<br>
### <ins>sudo ss -lntp</ins>
<b>Desc:   </b>Find ports occupied<br>
<b>Usage:  </b>``sudo ss -lntp``<br>
<b>Actual: </b>``sudo ss -lntp``<br>
### <ins>sudo yum install java-17-amazon-corretto.x86_64</ins>
<b>Desc:   </b>Install Java 17<br>
<b>Usage:  </b>``sudo yum install java-17-amazon-corretto.x86_64``<br>
<b>Actual: </b>``sudo yum install java-17-amazon-corretto.x86_64``<br>
### <ins>sudo yum remove java-17-amazon-corretto.x86_64</ins>
<b>Desc:   </b>Remove Java 17<br>
<b>Usage:  </b>``sudo yum remove java-17-amazon-corretto.x86_64``<br>
<b>Actual: </b>``sudo yum remove java-17-amazon-corretto.x86_64``<br>
### <ins>whoami</ins>
<b>Desc:   </b>Find current user<br>
<b>Usage:  </b>``whoami``<br>
<b>Actual: </b>``whoami``<br>
### <ins>yum list java*</ins>
<b>Desc:   </b>List all java packages available to install<br>
<b>Usage:  </b>``yum list java*``<br>
<b>Actual: </b>``yum list java*``<br>
### <ins>yum list java* ^| grep 17</ins>
<b>Desc:   </b>List all java 17 packages available to install<br>
<b>Usage:  </b>``yum list java* ^| grep 17``<br>
<b>Actual: </b>``yum list java* ^| grep 17``<br>
<a name="consul"></a><br>
## CONSUL
### <ins>cm</ins>
<b>Desc:   </b>List the Consul members<br>
<b>Usage:  </b>``cm``<br>
<b>Actual: </b>``consul members -details``<br>
### <ins>cs</ins>
<b>Desc:   </b>Start Consul<br>
<b>Usage:  </b>``cs machine 8501``<br>
<b>Actual: </b>``consul agent -dev -node machine -http-port=8501``<br>
<a name="git"></a><br>
## GIT
### <ins>gb</ins>
<b>Desc:   </b>List branches<br>
<b>Usage:  </b>``gb``<br>
<b>Actual: </b>``git branch``<br>
### <ins>gbm</ins>
<b>Desc:   </b>Create a new branch from existing<br>
<b>Usage:  </b>``gbm new main``<br>
<b>Actual: </b>``git branch new main``<br>
### <ins>gc</ins>
<b>Desc:   </b>Checkout a branch<br>
<b>Usage:  </b>``gc main``<br>
<b>Actual: </b>``git checkout main``<br>
### <ins>gca</ins>
<b>Desc:   </b>Amend a Git Commit message<br>
<b>Usage:  </b>``gca``<br>
<b>Actual: </b>``git commit --amend``<br>
### <ins>gconfig</ins>
<b>Desc:   </b>List the git config<br>
<b>Usage:  </b>``gconfig``<br>
<b>Actual: </b>``git config --list``<br>
### <ins>gcr</ins>
<b>Desc:   </b>Amend a Git Commit rebase<br>
<b>Usage:  </b>``gcr main``<br>
<b>Actual: </b>``git rebase -i HEAD~main``<br>
### <ins>glo</ins>
<b>Desc:   </b>Log history<br>
<b>Usage:  </b>``glo``<br>
<b>Actual: </b>``git log --oneline``<br>
### <ins>gm</ins>
<b>Desc:   </b>Merge a branch to current branch<br>
<b>Usage:  </b>``gm main``<br>
<b>Actual: </b>``git merge main``<br>
### <ins>gp</ins>
<b>Desc:   </b>Pull origin<br>
<b>Usage:  </b>``gp``<br>
<b>Actual: </b>``git pull``<br>
### <ins>gph</ins>
<b>Desc:   </b>Push to origin<br>
<b>Usage:  </b>``gph feature/FT1``<br>
<b>Actual: </b>``git push origin feature/FT1:feature/FT1``<br>
### <ins>gr</ins>
<b>Desc:   </b>Git reset local changes<br>
<b>Usage:  </b>``gr``<br>
<b>Actual: </b>``git reset --hard HEAD``<br>
### <ins>grepo</ins>
<b>Desc:   </b>Show the remote repo<br>
<b>Usage:  </b>``grepo``<br>
<b>Actual: </b>``git config --get remote.origin.url``<br>
### <ins>gs</ins>
<b>Desc:   </b>Local status<br>
<b>Usage:  </b>``gs``<br>
<b>Actual: </b>``git status``<br>
### <ins>gu</ins>
<b>Desc:   </b>Setup a local branch to upstream branch<br>
<b>Usage:  </b>``gu localbranch``<br>
<b>Actual: </b>``git branch --set-upstream-to=origin/localbranch localbranch``<br>
<a name="java"></a><br>
## Java
### <ins>j11</ins>
<b>Desc:   </b>Set Java11<br>
<b>Usage:  </b>``j11``<br>
<b>Actual: </b>``set JAVA_HOME=C:\Apps\jdk-11.0.17
set PATH=%JAVA_HOME%\bin;%PATH%``<br>
### <ins>j17</ins>
<b>Desc:   </b>Set Java17<br>
<b>Usage:  </b>``j17``<br>
<b>Actual: </b>``set JAVA_HOME=C:\Apps\jdk-17.0.6
set PATH=%JAVA_HOME%\bin;%PATH%``<br>
### <ins>j20</ins>
<b>Desc:   </b>Set Java20<br>
<b>Usage:  </b>``j20``<br>
<b>Actual: </b>``set JAVA_HOME=C:\Apps\jdk-20.0.1
set PATH=%JAVA_HOME%\bin;%PATH%``<br>
### <ins>j8</ins>
<b>Desc:   </b>Set Java8<br>
<b>Usage:  </b>``j8``<br>
<b>Actual: </b>``set JAVA_HOME=C:\Apps\jdk1.8.0_202
set PATH=%JAVA_HOME%\bin;%PATH%``<br>
### <ins>jv</ins>
<b>Desc:   </b>Get Java version<br>
<b>Usage:  </b>``jv``<br>
<b>Actual: </b>``java -version``<br>
<a name="maven"></a><br>
## MAVEN
### <ins>mc</ins>
<b>Desc:   </b>maven clean install<br>
<b>Usage:  </b>``mc``<br>
<b>Actual: </b>``mvn clean install``<br>
### <ins>mci</ins>
<b>Desc:   </b>maven clean install (no tests)<br>
<b>Usage:  </b>``mci``<br>
<b>Actual: </b>``mvn clean install -DskipTests=true``<br>
### <ins>msa</ins>
<b>Desc:   </b>Maven code clean spotless<br>
<b>Usage:  </b>``msa``<br>
<b>Actual: </b>``mvn spotless:apply``<br>
<a name="nomad"></a><br>
## NOMAD
### <ins>na</ins>
<b>Desc:   </b>Set non standard Nomad address<br>
<b>Usage:  </b>``na http://127.0.0.1:14646``<br>
<b>Actual: </b>``set NOMAD_ADDR=http://127.0.0.1:14646``<br>
### <ins>nrj</ins>
<b>Desc:   </b>Run a nomad job<br>
<b>Usage:  </b>``nrj car-app-cloud-cluster.nomad``<br>
<b>Actual: </b>``nomad run car-app-cloud-cluster.nomad``<br>
### <ins>ns</ins>
<b>Desc:   </b>Start Nomad<br>
<b>Usage:  </b>``ns nomad-config.hcl``<br>
<b>Actual: </b>``nomad agent -dev -config=nomad-config.hcl``<br>
### <ins>nsj</ins>
<b>Desc:   </b>Stop a nomad job - pass job name as parameter<br>
<b>Usage:  </b>``nsj car-workflow-cloud-app-job``<br>
<b>Actual: </b>``nomad stop car-workflow-cloud-app-job``<br>
<a name="terraform"></a><br>
## TERRAFORM
### <ins>ta</ins>
<b>Desc:   </b>Build the infra<br>
<b>Usage:  </b>``ta``<br>
<b>Actual: </b>``terraform apply``<br>
### <ins>td</ins>
<b>Desc:   </b>Destroy the infra<br>
<b>Usage:  </b>``td``<br>
<b>Actual: </b>``terraform destroy``<br>
### <ins>terraform apply -var "instance_name=VarMyTerraformCluster4"</ins>
<b>Desc:   </b>Build infra with placeholder vars<br>
<b>Usage:  </b>``to``<br>
<b>Actual: </b>``terraform apply -var "instance_name=VarMyTerraformCluster4"``<br>
### <ins>tf</ins>
<b>Desc:   </b>Format the .tf files<br>
<b>Usage:  </b>``tf``<br>
<b>Actual: </b>``terraform fmt``<br>
### <ins>ti</ins>
<b>Desc:   </b>Download providers<br>
<b>Usage:  </b>``ti``<br>
<b>Actual: </b>``terraform init``<br>
### <ins>to</ins>
<b>Desc:   </b>Output variables<br>
<b>Usage:  </b>``to``<br>
<b>Actual: </b>``terraform output``<br>
### <ins>ts</ins>
<b>Desc:   </b>Show instance details<br>
<b>Usage:  </b>``ts``<br>
<b>Actual: </b>``terraform show``<br>
### <ins>tsl</ins>
<b>Desc:   </b>List instances<br>
<b>Usage:  </b>``tsl``<br>
<b>Actual: </b>``terraform state list``<br>
### <ins>tv</ins>
<b>Desc:   </b>Validate the .tf files<br>
<b>Usage:  </b>``tv``<br>
<b>Actual: </b>``terraform validate``<br>
<a name="vault"></a><br>
## VAULT
### <ins>va</ins>
<b>Desc:   </b>Set the vault address<br>
<b>Usage:  </b>``va https://127.0.0.1:8200``<br>
<b>Actual: </b>``set VAULT_ADDR=https://127.0.0.1:8200``<br>
### <ins>vault kv get secret/kv/murali</ins>
<b>Desc:   </b>Get key value pairs from a secret<br>
<b>Usage:  </b>``vault kv get secret/kv/murali``<br>
<b>Actual: </b>``vault kv get secret/kv/murali``<br>
### <ins>vault kv put secret/kv/murali First=Mura Last=Karu Country=UK Location=London</ins>
<b>Desc:   </b>Put key value pairs in a secret<br>
<b>Usage:  </b>``vault kv put secret/kv/murali First=Mura Last=Karu Country=UK Location=London``<br>
<b>Actual: </b>``vault kv put secret/kv/murali First=Mura Last=Karu Country=UK Location=London``<br>
### <ins>vault token revoke <new_token></ins>
<b>Desc:   </b>Revoke a token<br>
<b>Usage:  </b>``vault token revoke <new_token>``<br>
<b>Actual: </b>``vault token revoke <new_token>``<br>
### <ins>vc</ins>
<b>Desc:   </b>Set the vault cacerts<br>
<b>Usage:  </b>``vc my-vault-cert.pem``<br>
<b>Actual: </b>``set VAULT_CACERT=my-vault-cert.pem``<br>
### <ins>vi</ins>
<b>Desc:   </b>Initialize the vault<br>
<b>Usage:  </b>``vi``<br>
<b>Actual: </b>``vault operator init``<br>
### <ins>vpd</ins>
<b>Desc:   </b>Delete a policy in Vault<br>
<b>Usage:  </b>``vpd admin-policy``<br>
<b>Actual: </b>``vault policy delete admin-policy``<br>
### <ins>vpf</ins>
<b>Desc:   </b>Format and validate a Vault policy<br>
<b>Usage:  </b>``vpf admin-policy.hcl``<br>
<b>Actual: </b>``vault policy fmt admin-policy.hcl``<br>
### <ins>vpl</ins>
<b>Desc:   </b>List the vault policy list<br>
<b>Usage:  </b>``vpl``<br>
<b>Actual: </b>``vault policy list``<br>
### <ins>vpr</ins>
<b>Desc:   </b>Read a vault policy<br>
<b>Usage:  </b>``vpr admin-policy``<br>
<b>Actual: </b>``vault policy read admin-policy``<br>
### <ins>vpw</ins>
<b>Desc:   </b>Write the policy to vault<br>
<b>Usage:  </b>``vpw admin-policy admin-policy.hcl``<br>
<b>Actual: </b>``vault policy write admin-policy admin-policy.hcl``<br>
### <ins>vr</ins>
<b>Desc:   </b>Set the vault root token<br>
<b>Usage:  </b>``vr hvs.zENkM2BW1IENXB0Mg7NK``<br>
<b>Actual: </b>``set VAULT_TOKEN=%s``<br>
### <ins>vs</ins>
<b>Desc:   </b>Display the vault status<br>
<b>Usage:  </b>``vs``<br>
<b>Actual: </b>``vault status``<br>
### <ins>vsd</ins>
<b>Desc:   </b>Disable a secret<br>
<b>Usage:  </b>``vsd secret/``<br>
<b>Actual: </b>``vault secrets disable secret/``<br>
### <ins>vse</ins>
<b>Desc:   </b>Create a secret in a vault<br>
<b>Usage:  </b>``vse secret/ kv-v2``<br>
<b>Actual: </b>``vault secrets enable -path=secret/ kv-v2``<br>
### <ins>vser</ins>
<b>Desc:   </b>Start Vault<br>
<b>Usage:  </b>``vser vault-config.hcl``<br>
<b>Actual: </b>``vault server -config vault-config.hcl``<br>
### <ins>vsl</ins>
<b>Desc:   </b>List the secrets in a vault<br>
<b>Usage:  </b>``vsl``<br>
<b>Actual: </b>``vault secrets list``<br>
### <ins>vtc</ins>
<b>Desc:   </b>Create a token in vault for a policy<br>
<b>Usage:  </b>``vtc admin-policy``<br>
<b>Actual: </b>``vault token create -policy=admin-policy``<br>
### <ins>vtl</ins>
<b>Desc:   </b>Login to Vault with a token<br>
<b>Usage:  </b>``vtl RLkSejNEWPvHQ0hKBSsSSlql``<br>
<b>Actual: </b>``vault login RLkSejNEWPvHQ0hKBSsSSlql``<br>
### <ins>vu</ins>
<b>Desc:   </b>Unseal the Vault<br>
<b>Usage:  </b>``vu hvs.zENkM2BW1IENXB0Mg7NK``<br>
<b>Actual: </b>``vault operator unseal hvs.zENkM2BW1IENXB0Mg7NK``<br>

