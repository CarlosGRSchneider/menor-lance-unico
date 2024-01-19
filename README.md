# Menor lance unico

Este repositório tem como objetivo montar uma arquitetura MVC bem simples, que faz parte de uma arquitetura distribuida para AWS. O passo a passo para montar o projeto completo pode ser lido aqui:

https://medium.com/@carlosguilherme.schneider/aws-menor-lance-%C3%BAnico-em-uma-arquitetura-distribu%C3%ADda-f36e9c2af5e2

O código em questão é responsável por aceitar lances do usuário e persisti-los no banco de dados. A classe `LanceController` possui 2 métodos:

## (POST) `adicionaLance`
O método recebe um lance, verifica se o mesmo é válido através do Spring Validation e, caso seja válido, persiste-o no banco de dados e retorna o status code 201 para o usuário.

## (GET) `consultaLances`
Este método serve apenas para conferir quais lances estão contidos no banco de dados. Em uma aplicação produtiva, não haveria este método; porém, para fins de exemplo, ele serve para que o desenvolvedor possa validar o resultado esperado com facilidade.


----------------------------------------------------------------------------------------

# Lowest Unique Bid
Please note that this project was made in portuguese, but can be translated with little effort.
This repository aims to build a simple MVC architecture, which is part of a distributed architecture for AWS. The step by step guide on how to assemble complete project can be read here:

https://medium.com/@carlosguilherme.schneider/aws-menor-lance-%C3%BAnico-em-uma-arquitetura-distribu%C3%ADda-f36e9c2af5e2

The code in question is responsible for accepting user bids and persisting them in the database. The LanceController class has 2 methods:

## (POST) `adicionaLance`
The method could be named add bid. It receives a bid, checks if it is valid through Spring Validation, and if it is valid, persists it in the database and returns the status code 201 to the user.

## (GET) `consultaLances`
This method could be named get bids. It is only used to check which bids are contained in the database. In a production application, this method would not exist; however, for example purposes, it allows the developer to easily validate the expected results.
