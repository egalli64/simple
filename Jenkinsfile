pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build Simple'
      }
    }

    stage('Test') {
      steps {
        echo 'Test Simple'
      }
    }

    stage('Stage') {
      steps {
        echo 'Deploy Simple to Stage'
      }
    }

    stage('Production') {
      steps {
        input 'Deploy in Production?'
        echo 'Deploy Simple to Production'
      }
    }

  }
}