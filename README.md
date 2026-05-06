# RealTimeApplication
Spring Boot + Swagger+ Docker + Kubernetes +Jenkins


**Important Commands**

minikube delete === If misconfigured minikube is there remove it with command 

minikube version === To check version of successfully installed minikube

minikube start --driver=docker === To start minikube with docker drivers

minikube status == to check what is status of minikube

kubectl cluster-info === Information about the cluster

kubectl get po -A



kubectl port-forward svc/realtime-service 8080:8080 == Stick with port-forward (recommended for dev)

minikube service realtime-service == Use Minikube’s helper. It will open the correct working URL (usually 127.0.0.1:<random-port>).

If you make any code change and redploy use below steps ===>>>>

🔧 Step-by-step redeployment workflow


create jar - maven clean install
minikube start --driver=docker
minikube status
& minikube -p minikube docker-env | Invoke-Expression
docker build -t realtime-app:latest .
docker pull eclipse-temurin:21
docker images
kubectl delete pod -l app=realtime-app
kubectl apply -f k8s/deployment.yaml
kubectl apply -f k8s/service.yaml
kubectl get pods
kubectl get endpoints realtime-service
kubectl port-forward svc/realtime-service 8080:8080
minikube service realtime-service

 


