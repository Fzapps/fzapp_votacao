# fzapp_votacao
OBJETIVO
No cooperativismo, cada associado possui um voto e as decisões são tomadas em assembleias, por votação. Imagine que você deve criar uma solução backend para gerenciar essas sessões de votação.

Essa solução deve ser executada na nuvem e promover as seguintes funcionalidades através de uma API REST: 

●	Cadastrar uma nova pauta
●	Abrir uma sessão de votação em uma pauta (a sessão de votação deve ficar aberta por um tempo determinado na chamada de abertura ou 1 minuto por default)
●	Receber votos dos associados em pautas (os votos são apenas 'Sim'/'Não'. Cada associado é identificado por um id único e pode votar apenas uma vez por pauta)
●	Contabilizar os votos e dar o resultado da votação na pauta

Para fins de exercício, a segurança das interfaces pode ser abstraída e qualquer chamada para as interfaces pode ser considerada como autorizada. A escolha da linguagem, frameworks e bibliotecas é livre (desde que não infrinja direitos de uso).

É importante que as pautas e os votos sejam persistidos e que não sejam perdidos com o restart da aplicação.


PROJETO

Desenvolvido Eclipse IDE 2020 no sistema operacional windows 10. 
Versões
JDK 13
 Spring Boot     (v2.1.2.RELEASE)

## Setup´s
==DOCKER + MONGO==

	...Docker (Windows) --> https://hub.docker.com/editions/community/docker-ce-desktop-windows
  		...Validar a instalação:
			docker version
			docker run hello-world
		...Subir um "Mongo", command´s:
			.docker pull mongo
				[Instalar o MongoDB]
			.docker images
				[Visualizar imagem baixada]
			.docker run --name sicrediMongo -p 27017:27017 -d mongo
				[Subir um contêiner]
			.winpty docker exec -it sicrediMongo mongo admin
				[Executar o Administrador do MongoDB]
			.docker ps -a
				[Verifica o estado atual dos contêineres]
			.docker stop sicrediMongo
				[Parar o contêiner criado]
			.docker start sicrediMongo
				[Iniciar com o comando]
			.docker rm sicrediMongo
				[Remover um contêiner]

		...MongoDB
			http://localhost:27017 --> Verificar se esta "no ar".
			...command´s:
				.show dbs
					[Verificar os bancos criados]
				.use local
					[Determinado banco]
				.show collections
					[Coleções existentes deste banco]
				.exit
					[Sair do administrador]

	
## Projeto
	Com o MongoDb rodando com sucesso...
	
	Rodar applicação: 
		Eclipse:
			.Pauta > Botão direitor em cima de "PautaApplication.java" e Selecionar: "Run As..." "Java Application"
			.Associado > Botão direitor em cima de "AssociadoApplication.java" e Selecionar: "Run As..." "Java Application"
	
		
		"No ar" em: 
			.Pauta > http://localhost:8090/
			.Associado > http://localhost:8091/

	Acessar Swagger:
		.Pauta: http://localhost:8090/swagger-ui.html
		.Associado: http://localhost:8091/swagger-ui.html
	
	Tecnologias do MVP: Docker, Mongo, Spring Boot, Spring Cloud, Java8, Rest, Maven, Junit, Mockito...
		

	
