# Micronaut Web

## Installation
```bash
gradlew clean
gradlew build
```

## Build Docker Image
```bash
docker build . -t <dockerhub_username>/micronaut-web
```

## Run Docker Image (Create Container)
```bash
docker run --rm --name micronaut-web-container -p 8090:8090 <dockerhub_username>/micronaut-web:latest
```

## Login to Dockerhub
```bash
docker login --username=<dockerhub_username>
```

## Push Image to Dockerhub
```bash
docker push <dockerhub_username>/micronaut-web
```

## Deploy Docker Image from Dockerhub to Kubernetes Cluster
```bash
kubectl apply -f k8s-deployment.yml
```

## Access Kubernetes Service from Browser
```bash
minikube service micronaut-web-service
```