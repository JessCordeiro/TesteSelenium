# TesteSelenium



Caso de teste
Preencher formulários para enviar email no site Sampleapp

Cenário:
Preenchimento de formulários e submissão de email

 Dado que entrei no site "http://sampleapp.tricentis.com/101/app.php"
 Entao selecione a aba "Enter Vehicle Data"
 E preencha o formulario Vehicle Data
 Entao pressione "next" para "Enter Insurant Data"
 E preencha o formulario Insurant Data
 Entao pressione "next" para "Enter Product Data"
 E preencha o formulario Product Data
 Entao pressione "next" para "Select Price Option"
 E preencha o formulario Price Option
 Entao pressione "next" para "Send Quote"
 E preencha o formulario Send Quote
 E pressione send
 Entao verifique na tela a mensagem "Sending e-mail success!"


Tecnologias utilizadas
Java: Linguagem de programacão para desenvolvedores orientada a objeto
Maven: Gerenciador de dependências para o Java
Cucumber: Framework responsável por traduzir uma linguagem humana em código Java utilizando algumas palavras reservadas
Selenium: Framework responsável por fazer a integracão do código Java com a linguagem Gherkin (Cucumber) e automatizando os testes

Pré-requisitos
Instalar o Java: https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
Instalar JDK: https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
Verificar se o JAVA_HOME está configurado no seu computador

Para clonar o projeto
git clone > https://github.com/mariacireno/TesteSellenium.git
