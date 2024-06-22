pipeline {
    agent any
    options {
        timestamps()
    }
    stages {
        stage('Build') {
            steps {
                script {
                    library 'jsl-test'
                    // Здесь вызовите функции из вашей Shared Library
                }
            }
        }
    }
}