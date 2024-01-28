pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    echo 'Building the project...'
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    echo 'Running tests...'
                    sh 'mvn test'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    echo 'Building Docker image...'
                    sh 'docker build -t my-spring-app .'
                }
            }
        }

        stage('Publish Docker Image Locally') {
            steps {
                script {
                    echo 'Publishing Docker image locally...'
                    sh 'docker run -p 8080:8080 -d my-spring-app'
                }
            }
        }
    }
}
