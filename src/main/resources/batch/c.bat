@echo off
echo =================
echo CONSUL Short Cuts
echo =================
echo cm   -^> consul members -details       -^> cm                                      -^> List the Consul members                           
echo cs   -^> consul agent -dev -node %%1 -http-port=%%2-^> cs machine 8501                         -^> Start Consul                                      
