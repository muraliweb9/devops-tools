@echo off
echo ==============
echo GIT Short Cuts
echo ==============
echo gb   -^> git branch                    -^> gb                                      -^> List branches                                     
echo gbm  -^> git branch %%1 %%2            -^> gbm new main                            -^> Create a new branch from existing                 
echo gc   -^> git checkout %%1              -^> gc main                                 -^> Checkout a branch                                 
echo gca  -^> git commit --amend            -^> gca                                     -^> Amend a Git Commit message                        
echo gconfig-^> git config --list             -^> gconfig                                 -^> List the git config                               
echo gcr  -^> git rebase -i HEAD~%%1        -^> gcr main                                -^> Amend a Git Commit rebase                         
echo glo  -^> git log --oneline             -^> glo                                     -^> Log history                                       
echo gm   -^> git merge %%1                 -^> gm main                                 -^> Merge a branch to current branch                  
echo gp   -^> git pull                      -^> gp                                      -^> Pull origin                                       
echo gph  -^> git push origin %%1:%%1       -^> gph feature/FT1                         -^> Push to origin                                    
echo gr   -^> git reset --hard HEAD         -^> gr                                      -^> Git reset local changes                           
echo grepo-^> git config --get remote.origin.url-^> grepo                                   -^> Show the remote repo                              
echo gs   -^> git status                    -^> gs                                      -^> Local status                                      
echo gu   -^> git branch --set-upstream-to=origin/%%1 %%1-^> gu localbranch                          -^> Setup a local branch to upstream branch           
