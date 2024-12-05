# fullcycle3 desafio Event Driven Architecture

docker compose up -d

Após usar o arquivo testar.http

Abra duas abas no navegador com o endereço http://localhost:3003/balances
Mais só de o refresh na segunda aba para ver a diferença

# ADICIONADO NA CONTA DE RAFAEL 1000 VINDO DA CONTA DE MANOEL
POST http://localhost:8080/transactions HTTP/1.1
Content-Type: application/json

{
    "account_id_from": "856f52ff-b256-11ef-a024-0242ac140003",
    "account_id_to": "b9e9f067-b256-11ef-a024-0242ac140003",
    "amount": 1000
}

###
# Abra duas abas no navegador com o endereço http://localhost:3003/balances
# Mais só de o refresh na segunda aba para ver a diferença
# ou execute os itens abaixo
###

# BALANCO DA CONTA DE MANOEL
GET http://localhost:3003/balances/856f52ff-b256-11ef-a024-0242ac140003 HTTP/1.1
Content-Type: application/json

###

# BALANCO DA CONTA DE RAFAEL
GET http://localhost:3003/balances/b9e9f067-b256-11ef-a024-0242ac140003 HTTP/1.1
Content-Type: application/json


