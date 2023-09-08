pipeline {
	agent any
	environment {
		mavenHome = tool 'jenkins-maven'
	}
	tools {
	 jdk 'java-17'
	}
	
	stages {
		stage('Build'){
			steps {
				sh "mvn clean install -DskipTests"
			}
		}
		stage('Test'){
			steps {
				sh "mvn test"
			}
		}
		stage('Deploy'){
			steps {
				sh "nohup java  -jar target/employee-0.0.1-SNAPSHOT.jar >> server.log 2>&1 &"
			}
		}

	}
}