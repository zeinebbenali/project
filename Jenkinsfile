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