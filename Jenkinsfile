pipeline {
    agent any
    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'apache-maven-3.3.9') {
                    bat 'mvn clean compile'
                }
            }
        }
              stage("build & SonarQube analysis") {
                  steps {
                      withSonarQubeEnv('My SonarQube Server') {
                         sh 'mvn clean package sonar:sonar'
                      }
                  }
              }
                stage("Quality Gate"){
                     steps(time: 1, unit: 'HOURS') {
                         def qg = waitForQualityGate()
                         if (qg.status != 'OK') {
                             error "Pipeline aborted due to quality gate failure: ${qg.status}"
                         }
                     }
                 }
        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'apache-maven-3.3.9') {
                    bat 'mvn test'
                }
            }
        }
        stage ('Install Stage') {
            steps {
                withMaven(maven : 'apache-maven-3.3.9') {
                    bat 'mvn install'
                }
            }
        }
    }
}