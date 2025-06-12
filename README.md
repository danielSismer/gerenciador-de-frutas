# Sistema de Gerenciamento de Frutas

Este projeto Java exemplifica o uso de **packages**, **encapsulamento** e o **princípio S do SOLID** (Responsabilidade Única), implementando um sistema simples para **cadastrar**, **listar** e **excluir** frutas.

## Estrutura de Pacotes

```
src/
└── br/
    └── com/
        └── frutas/
            ├── model/
            │     └── Fruta.java
            ├── service/
            │     └── FrutaService.java
            ├── view/
            │     └── FrutaView.java
            └── main/
                  └── Main.java
```

- **model**: Define a entidade `Fruta`, representando os dados das frutas.
- **service**: Responsável pelas regras de negócio, como cadastro, listagem e exclusão de frutas.
- **view**: Responsável pela interação com o usuário (entrada e saída de dados).
- **main**: Ponto de entrada da aplicação.

## Conceitos Aplicados

### 1. Package

O código é modularizado em pacotes, facilitando a organização, manutenção e entendimento do projeto.

### 2. Encapsulamento

A classe `Fruta` possui atributos privados e métodos públicos para acesso (getters/setters):

```java
package br.com.frutas.model;

public class Fruta {
    private String nome;
    private String cor;

    public Fruta(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
}
```

### 3. S do SOLID — Responsabilidade Única

Cada classe do sistema tem uma única responsabilidade:
- `Fruta`: representa os dados de uma fruta.
- `FrutaService`: gerencia as operações de negócio.
- `FrutaView`: cuida da interação com o usuário.
- `Main`: inicializa e executa o sistema.

Exemplo de classe de serviço:

```java
package br.com.frutas.service;

import java.util.ArrayList;
import java.util.List;
import br.com.frutas.model.Fruta;

public class FrutaService {
    private List<Fruta> frutas = new ArrayList<>();

    public void cadastrar(Fruta fruta) {
        frutas.add(fruta);
    }

    public List<Fruta> listar() {
        return new ArrayList<>(frutas);
    }

    public boolean excluir(String nome) {
        return frutas.removeIf(f -> f.getNome().equalsIgnoreCase(nome));
    }
}
```

Exemplo de classe view (resumido):

```java
package br.com.frutas.view;

import java.util.Scanner;
import br.com.frutas.model.Fruta;

public class FrutaView {
    private Scanner scanner = new Scanner(System.in);

    public Fruta lerFruta() {
        System.out.print("Nome da fruta: ");
        String nome = scanner.nextLine();
        System.out.print("Cor da fruta: ");
        String cor = scanner.nextLine();
        return new Fruta(nome, cor);
    }

    public String lerNomeFrutaParaExcluir() {
        System.out.print("Nome da fruta para excluir: ");
        return scanner.nextLine();
    }

    public void mostrarFrutas(java.util.List<Fruta> frutas) {
        frutas.forEach(f -> System.out.println(f.getNome() + " - " + f.getCor()));
    }
}
```

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/seurepositorio.git
   ```
2. Compile os arquivos Java:
   ```bash
   javac -d bin src/br/com/frutas/**/*.java
   ```
3. Execute a aplicação:
   ```bash
   java -cp bin br.com.frutas.main.Main
   ```

## Requisitos

- JDK 8 ou superior

## Licença

MIT

---

Projeto didático para demonstração de boas práticas de orientação a objetos em Java.
