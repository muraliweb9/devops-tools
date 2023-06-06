@echo off
echo ===================
echo Terraform shortcuts
echo ===================
echo t      -^> terraform init       -^> Download providers
echo t      -^> terraform fmt        -^> Format .tf file(s)
echo t      -^> terraform validate   -^> Validate .tf file(s)
echo t      -^> terraform apply      -^> Build infra
echo t      -^> terraform show       -^> Show instance details
echo t      -^> terraform state list -^> List instances
echo t      -^> terraform destroy    -^> Tear down infra
echo t      -^> terraform output     -^> Output variables
echo t      -^> terraform apply -var "instance_name=VarMyTerraformCluster4"    -^> Build infra with placeholder vars
echo =============
echo =============