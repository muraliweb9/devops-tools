@echo off
echo ====================
echo TERRAFORM Short Cuts
echo ====================
echo ta   -^> terraform apply               -^> ta                                      -^> Build the infra                                   
echo td   -^> terraform destroy             -^> td                                      -^> Destroy the infra                                 
echo terraform apply -var "instance_name=VarMyTerraformCluster4"-^> terraform apply -var "instance_name=VarMyTerraformCluster4"-^> to                                      -^> Build infra with placeholder vars                 
echo tf   -^> terraform fmt                 -^> tf                                      -^> Format the .tf files                              
echo ti   -^> terraform init                -^> ti                                      -^> Download providers                                
echo to   -^> terraform output              -^> to                                      -^> Output variables                                  
echo ts   -^> terraform show                -^> ts                                      -^> Show instance details                             
echo tsl  -^> terraform state list          -^> tsl                                     -^> List instances                                    
echo tv   -^> terraform validate            -^> tv                                      -^> Validate the .tf files                            
