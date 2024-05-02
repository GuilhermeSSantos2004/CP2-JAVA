# CP2-JAVA

## Links
- [Canal no Youtube](link_para_o_canal)

## Integrante
- 2ESPX - Guilherme Silva Dos Santos RM551168

## Introdução
Este é um simulador de veículos simples em Java. Ele permite simular o comportamento básico de diferentes tipos de veículos, como carros, motos e caminhões.

## Como usar
1. Certifique-se de ter o Java JDK instalado na sua máquina.
2. Clone este repositório para o seu ambiente local.
3. Abra o terminal e navegue até o diretório onde o repositório foi clonado.
4. Compile o código-fonte usando o seguinte comando:

5. Execute o programa compilado com o seguinte comando:


java Main


## Documentação do Código

### Veiculo.java
Classe base que representa um veículo. Ela possui os seguintes atributos:

- Marca: representa a marca do veículo.
- Modelo: representa o modelo do veículo.
- Ano: representa o ano de fabricação do veículo.
- Velocidade Máxima: representa a velocidade máxima permitida para o veículo.
- Velocidade Atual: representa a velocidade atual do veículo.

Além disso, a classe Veiculo pode realizar as seguintes ações:

1. Aceleração e redução de velocidade.
2. Verificação do status do veículo, incluindo nome, modelo, ano, velocidade máxima e velocidade atual.

### Carro.java
Representa um carro de passeio. Esta classe herda da classe Veiculo e adiciona a funcionalidade de controle de ar condicionado. 

### Moto.java
Representa uma motocicleta. Esta classe herda da classe Veiculo e adiciona a funcionalidade de empinar a moto quando a velocidade está entre 20 km/h e 50 km/h.

### Caminhao.java
Representa um caminhão para transporte de cargas. Esta classe herda da classe Veiculo e adiciona a funcionalidade de controle de carga.
