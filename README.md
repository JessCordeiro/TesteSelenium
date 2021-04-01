# TesteSelenium



Caso de teste
Preencher formulários para enviar email no site Sampleapp

<b>Cenário:</b><br>
Preenchimento de formulários e submissão de email

 Dado que entrei no site "http://sampleapp.tricentis.com/101/app.php"<br>
 Entao selecione a aba "Enter Vehicle Data"<br>
 E preencha o formulario Vehicle Data<br>
 Entao pressione "next" para "Enter Insurant Data"<br>
 E preencha o formulario Insurant Data<br>
 Entao pressione "next" para "Enter Product Data"<br>
 E preencha o formulario Product Data<br>
 Entao pressione "next" para "Select Price Option"<br>
 E preencha o formulario Price Option<br>
 Entao pressione "next" para "Send Quote"<br>
 E preencha o formulario Send Quote<br>
 E pressione send<br>
 Entao verifique na tela a mensagem "Sending e-mail success!"<br>


<b>Tecnologias utilizadas</b>
Java: Linguagem de programacão para desenvolvedores orientada a objeto<br>
Maven: Gerenciador de dependências para o Java<br>
Cucumber: Framework responsável por traduzir uma linguagem humana em código Java utilizando algumas palavras reservadas<br>
Selenium: Framework responsável por fazer a integracão do código Java com a linguagem Gherkin (Cucumber) e automatizando os testes<br>

<b>Pré-requisitos</b>
Instalar o Java: https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR<br>
Instalar JDK: https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html<br>
Verificar se o JAVA_HOME está configurado no seu computador<br>


<b>Instruções para rodar</b><br>
Entrar no diretório onde foi clonado o projeto (exemplo):
cd ~/workspace/projects/TesteSellenium
Executando teste no Unix:<br>
./test.sh
Executando teste no Windows:<br>
test.bat
Instruções para limpar e validar o Maven<br>
Executar o seguinte comando no Windows:<br>
mvnw.cmd clean<br>
Executar o seguinte comando no Unix:<br>
./mvnw clean


