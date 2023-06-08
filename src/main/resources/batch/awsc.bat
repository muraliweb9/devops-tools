@echo off
echo ==================
echo AWS CLI Short Cuts
echo ==================
echo awscc     -^> aws configure                 -^> awscc               
echo awsci     -^> aws sts get-caller-identity   -^> awsci               
echo awscl     -^> aws lambda list-functions     -^> awscl               
echo awsclu    -^> aws iam list-users            -^> awsclu              
echo awscs3    -^> aws s3 ls                     -^> awscs3              
echo awscs3c   -^> aws s3 ls %%1                 -^> awscs3c car-app-cloud-storage
echo awscs3p   -^> aws s3 cp %%1 %%2             -^> awscs3p s3://car-app-cloud-storage/springbootadmin-0.0.1-SNAPSHOT.jar s3://car-app-cloud-storage-2/
echo awscs3r   -^> aws s3api create-bucket --bucket %%1 --region %%2 --create-bucket-configuration LocationConstraint=%%2-^> awscs3r car-app-cloud-storage-2 eu-west-2
