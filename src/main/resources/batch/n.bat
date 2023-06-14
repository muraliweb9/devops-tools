@echo off
echo ================
echo NOMAD Short Cuts
echo ================
echo na        -^> set NOMAD_ADDR=%%1            -^> na http://127.0.0.1:14646
echo nrj       -^> nomad run %%1                 -^> nrj car-app-cloud-cluster.nomad
echo ns        -^> nomad agent -dev -config=%%1  -^> ns nomad-config.hcl 
echo nsj       -^> nomad stop %%1                -^> nsj car-workflow-cloud-app-job
