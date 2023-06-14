@echo off
set name=%1
for %%a in (%name:\= %) do set title1=%%a
for /f "tokens=1 delims=\" %%b in ("%name%") do set title2=%%b
title %title2% - %title1%
git branch
git status