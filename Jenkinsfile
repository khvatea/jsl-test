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
                    
                    deployStage();
                }
            }
        }
    }
}