pipeline {
    agent any
    tools {
        maven 'Maven-4.0.0-rc-5'
    }
    environment {
        IMAGE_NAME = "realtime-app"
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/omkarayachit777/RealTimeApplication']])
                echo ' <<< Checkout from git is completed >>>'
            }
        }

        stage('Maven build') {
            steps {
                bat 'mvn clean package'
                echo ' <<< Maven build is completed >>>'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t realtime-app:latest .'
                echo ' <<< Docker build is completed >>>'
            }
        }

        stage('Deploy to K8s') {
            steps {
                bat 'kubectl apply -f k8s/'
                echo ' <<< Deployment to k8s is completed >>>'
            }
        }
    }
}
