pipeline {
    agent any

    tools {
        // Assume que você tem uma ferramenta Maven configurada no Jenkins chamada 'Maven_Local'
        maven 'Maven_Local'
    }

    stages {
        stage('Clonar Repositorio') {
            steps {
                // Aqui você colocaria o URL do seu repositório GitHub
                // Exemplo: git url: 'https://github.com/seu-usuario/projeto-jenkins-junit.git', branch: 'main'
                echo 'Clonando o repositório do GitHub...'
                checkout scm
            }
        }

        stage('Compilar e Testar') {
            steps {
                // Executa os testes unitários via Maven
                echo 'Iniciando testes com JUnit...'
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            // Coleta os relatórios de teste do JUnit para exibição no Jenkins
            junit 'target/surefire-reports/*.xml'
        }
        success {
            echo 'Todos os testes passaram com sucesso! Bom trabalho, Antigravity.'
        }
        failure {
            echo 'Alguns testes falharam. Verifique os relatórios.'
        }
    }
}
