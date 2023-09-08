#!/bin/bash

echo "Starting all applications ...."

echo "Starting springbootadmin8"
java -jar springbootadmin8-0.0.1-SNAPSHOT.jar &
PID=$!
echo "Started springbootadmin8 as PID $!"

echo "Starting eobao-data-analytics-app"
java -jar eobao-data-analytics-app-0.0.1-SNAPSHOT.jar &
PID=$!
echo "Started eobao-data-analytics-app as PID $!"

echo "Starting eobao-online-data-app"
java -jar eobao-online-data-app-0.0.1-SNAPSHOT.jar &
PID=$!
echo "Started eeobao-online-data-app as PID $!"

echo "Starting eobao-onboarding-app"
java -jar eobao-onboarding-app-0.0.1-SNAPSHOT.jar &
PID=$!
echo "Started eobao-onboarding-app as PID $!"

echo "Finished starting all applications ...."
