@echo off
echo =================
echo AWS CLI shortcuts
echo =================
echo a -^> aws configure                    -^> Login - set access key, secret and default region
echo a -^> aws iam list-users               -^> List all the users
echo a -^> aws s3 ls                        -^> List all the s3 buckets
echo a -^> aws s3 ls car-app-cloud-storage  -^> List all the items in s3 bucket (car-app-cloud-storage)
echo a -^> aws s3api create-bucket --bucket car-app-cloud-storage-2 --region eu-west-2 --create-bucket-configuration LocationConstraint=eu-west-2  -^> Create a new bucket in a region
echo a -^> aws s3 cp s3://car-app-cloud-storage/springbootadmin-0.0.1-SNAPSHOT.jar s3://car-app-cloud-storage-2/                                   -^> Copy from one bucket to another
echo a -^> aws lambda list-functions        -^> List all the lambda functions
echo a -^> aws sts get-caller-identity      -^> Test connection / get user details
echo =============
echo =============