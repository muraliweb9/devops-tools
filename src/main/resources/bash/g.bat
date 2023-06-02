@echo off
echo =============
echo GIT shortcuts
echo =============
echo gs      -^> git status                                -^> gs
echo gb      -^> git branch                                -^> gb
echo gp      -^> git pull                                  -^> gp
echo gr      -^> git reset --hard HEAD                     -^> gr
echo gm      -^> git merge %%1                              -^> gm master
echo gph     -^> git push origin %%1:%%1                     -^> gph feature/FRTBSV-2195-remove-unmanaged-legacy-RDL-dependency
echo gc      -^> git checkout %%1                           -^> gc feature/FRTBSV-2195-remove-unmanaged-legacy-RDL-dependency
echo gbm     -^> git branch from master                    -^> gbm feature/FRTBSV-2195-remove-unmanaged-legacy-RDL-dependency
echo gu      -^> git branch --set-upstream-to=origin/%%1 %%1 -^> gu feature/FRTBSV-2195-remove-unmanaged-legacy-RDL-dependency
echo gca     -^> git commit --amend                        -^> gca    # Change the last commit message
echo gca2    -^> git rebase -i HEAD~%%1                     -^> gca2 5 # Change the last 5 commit message
echo grepo   -^> git config --get remote.origin.url        -^> grepo
echo glo     -^> git log --oneline                         -^> glo
echo gconfig -^> git config --list                         -^> gconfig
echo =============
echo =============