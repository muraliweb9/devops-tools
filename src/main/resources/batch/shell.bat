set name=%1
for %%x in (%name:\= %) do set title=%%x
title %title%
git branch
git status