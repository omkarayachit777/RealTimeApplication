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
                git 'https://github.com/omkarayachit777/RealTimeApplication'
            }
        }

        stage('Maven build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t realtime-app:latest .'
            }
        }

        stage('Deploy to K8s') {
            steps {
                sh 'kubectl apply -f k8s/'
            }
        }
    }
}
