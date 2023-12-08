pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                bat 'mvn clean package -DskipTests=true'
            }
        }
        stage('Tests'){
            steps{
                bat 'mvn test'
            }
        }
        stage('Tests'){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'TomcatLogin', path: '', url: 'http://localhost:9000/')], contextPath: 'calculadora', war: 'target/calculadora.war'
            }
        }
    }
}