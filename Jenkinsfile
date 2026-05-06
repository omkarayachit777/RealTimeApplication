pipeline {
    agent any

    environment {
        IMAGE_NAME = "realtime-app"
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/omkarayachit777/RealTimeApplication.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t realtime-app .'
            }
        }

        stage('Docker Push') {
            steps {
                sh 'docker tag realtime-app your-dockerhub/my-app:latest'
                sh 'docker push your-dockerhub/realtime-app:latest'
            }
        }

        stage('Deploy to K8s') {
            steps {
                sh 'kubectl apply -f k8s/'
            }
        }
    }
}
