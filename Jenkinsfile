pipeline {
    agent any

    stages {
        stage('Build docker image') {
            when {
                beforeAgent true
            }
            steps {
                script {
                    echo 'Building the project...'
                    sh 'docker build -f Dockerfile -t weather-app .'
                }
            }
        }

        stage('Deploy docker image') {
            when {
                beforeAgent true
                branch 'master'
            }
            steps {
                script {
                    echo 'Publishing Docker image locally...'
                    sh 'docker run -p 8080:8080 -d weather-app'
                }
            }
        }
    }
}