#!groovy

def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    sh "echo ${config.repoUrl} ${config.branch}"
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

