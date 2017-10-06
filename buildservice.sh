cd /home/suryothiono_w/Documents/docker-jenkins/jenkins_home/workspace/Build-and-Deploy-Springboot-Service

# Build Docker Images
# Logout and Login
docker logout
docker login -u photondevops -p Welcome123 -e ratihnurmalasari01@gmail.com

# Build docker images
docker build -t photondevops/photon-devops:springboot-service.2.0 .

# Push docker images to docker repo
docker push photondevops/photon-devops:springboot-service.2.0

docker logout

# Deploy
docker-compose down

docker-compose pull
docker-compose up -d

docker ps
