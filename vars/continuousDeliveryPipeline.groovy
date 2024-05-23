#!groovy

def call(String repoUrl, String branch) {
    
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    sh "echo ${repoUrl} ${branch}"
                }
            }
            stage('Build') {
                steps {
                    sh "echo Build"
                }
            }
            stage('Deploy') {
                steps {
                    sh "echo Deploy"
                }
            }
        }
    }
}

