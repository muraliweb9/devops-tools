@echo off
echo ==============
echo GIT Short Cuts
echo ==============
echo gb        -^> git branch                    -^> gb                  
echo gbm       -^> git branch %%1 %%2            -^> gbm new main        
echo gc        -^> git checkout %%1              -^> gc main             
echo gca       -^> git commit --amend            -^> gca                 
echo gconfig   -^> git config --list             -^> gconfig             
echo gcr       -^> git rebase -i HEAD~%%1        -^> gcr main            
echo glo       -^> git log --oneline             -^> glo                 
echo gm        -^> git merge %%1                 -^> gm main             
echo gp        -^> git pull                      -^> gp                  
echo gph       -^> git push origin %%1:%%1       -^> gph feature/FT1     
echo gr        -^> git reset --hard HEAD         -^> gr                  
echo grepo     -^> git config --get remote.origin.url-^> grepo               
echo gs        -^> git status                    -^> gs                  
echo gu        -^> git branch --set-upstream-to=origin/%%1 %%1-^> gu localbranch      
