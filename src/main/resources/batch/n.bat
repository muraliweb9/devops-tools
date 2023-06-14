@echo off
echo ================
echo NOMAD Short Cuts
echo ================
echo na   -^> set NOMAD_ADDR=%%1            -^> na http://127.0.0.1:14646               -^> Set non standard Nomad address                    
echo nrj  -^> nomad run %%1                 -^> nrj car-app-cloud-cluster.nomad         -^> Run a nomad job                                   
echo ns   -^> nomad agent -dev -config=%%1  -^> ns nomad-config.hcl                     -^> Start Nomad                                       
echo nsj  -^> nomad stop %%1                -^> nsj car-workflow-cloud-app-job          -^> Stop a nomad job - pass job name as parameter     
