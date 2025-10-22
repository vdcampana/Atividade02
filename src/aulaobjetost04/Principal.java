package aulaobjetost04;

import java.util.Scanner;

public class Principal {

    static class ContaBancaria {
        private String titular;
        private double saldo;

        public ContaBancaria(String titular, double saldo) {
            setTitular(titular);
            setSaldo(saldo);
        }

        public ContaBancaria() {}

        public void setTitular(String titular) {
            if (titular != null && !titular.equals("")) {
                this.titular = titular;
            }
        }

        public void setSaldo(double saldo) {
            if (saldo >= 0) {
                this.saldo = saldo;
            }
        }

        public double getSaldo() {
            return saldo;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                saldo = saldo + valor;
            }
        }

        public void sacar(double valor) {
            if (valor > 0 && saldo - valor >= 0) {
                saldo = saldo - valor;
            }
        }
    }

    static class Filme {
        private String titulo;
        private double avaliacao;

        public Filme(String titulo, double avaliacao) {
            setTitulo(titulo);
            setAvaliacao(avaliacao);
        }

        public Filme() {}

        public void setTitulo(String titulo) {
            if (titulo != null && !titulo.equals("")) {
                this.titulo = titulo;
            }
        }

        public void setAvaliacao(double avaliacao) {
            if (avaliacao >= 0 && avaliacao <= 5) {
                this.avaliacao = avaliacao;
            }
        }

        public void exibir() {
            System.out.println("Filme: " + titulo + " | Avaliação: " + avaliacao + " estrelas");
        }
    }

    static class Funcionario {
        private String nome;
        private double salario;

        public Funcionario(String nome, double salario) {
            setNome(nome);
            setSalario(salario);
        }

        public Funcionario() {}

        public void setNome(String nome) {
            if (nome != null && !nome.equals("")) {
                this.nome = nome;
            }
        }

        public void setSalario(double salario) {
            if (salario >= 0) {
                this.salario = salario;
            }
        }

        public double getSalario() {
            return salario;
        }

        public void aumentarSalario(double percentual) {
            if (percentual > 0) {
                salario = salario + (salario * percentual / 100);
            }
        }
    }

    static class Retangulo {
        private double largura;
        private double altura;

        public Retangulo(double largura, double altura) {
            setLargura(largura);
            setAltura(altura);
        }

        public Retangulo() {}

        public void setLargura(double largura) {
            if (largura > 0) {
                this.largura = largura;
            }
        }

        public void setAltura(double altura) {
            if (altura > 0) {
                this.altura = altura;
            }
        }

        public double area() {
            return largura * altura;
        }

        public double perimetro() {
            return 2 * (largura + altura);
        }
    }

    static class Musica {
        private String titulo;
        private int duracaoSegundos;

        public Musica(String titulo, int duracaoSegundos) {
            setTitulo(titulo);
            setDuracaoSegundos(duracaoSegundos);
        }

        public Musica() {}

        public void setTitulo(String titulo) {
            if (titulo != null && !titulo.equals("")) {
                this.titulo = titulo;
            }
        }

        public void setDuracaoSegundos(int duracaoSegundos) {
            if (duracaoSegundos > 0) {
                this.duracaoSegundos = duracaoSegundos;
            }
        }

        public String getTitulo() {
            return titulo;
        }

        public String formatarDuracao() {
            int minutos = duracaoSegundos / 60;
            int segundos = duracaoSegundos % 60;
            return String.format("%d:%02d", minutos, segundos);
        }
    }

    static class Pessoa {
        private String nome;
        private double peso;
        private double altura;

        public Pessoa(String nome, double peso, double altura) {
            setNome(nome);
            setPeso(peso);
            setAltura(altura);
        }

        public Pessoa() {}

        public void setNome(String nome) {
            if (nome != null && !nome.equals("")) {
                this.nome = nome;
            }
        }

        public void setPeso(double peso) {
            if (peso > 0) {
                this.peso = peso;
            }
        }

        public void setAltura(double altura) {
            if (altura > 0) {
                this.altura = altura;
            }
        }

        public double calcularIMC() {
            return peso / (altura * altura);
        }

        public String classificacaoIMC() {
            double imc = calcularIMC();
            if (imc < 18.5) {
                return "Abaixo do peso";
            } else if (imc < 25) {
                return "Normal";
            } else if (imc < 30) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
        }
    }

    static class ContaLuz {
        private double consumoKwh;
        private double valorKwh;

        public ContaLuz(double consumoKwh, double valorKwh) {
            setConsumoKwh(consumoKwh);
            setValorKwh(valorKwh);
        }

        public ContaLuz() {}

        public void setConsumoKwh(double consumoKwh) {
            if (consumoKwh > 0) {
                this.consumoKwh = consumoKwh;
            }
        }

        public void setValorKwh(double valorKwh) {
            if (valorKwh > 0) {
                this.valorKwh = valorKwh;
            }
        }

        public double calcularValorTotal() {
            return consumoKwh * valorKwh;
        }
    }

    static class BicicletaAlugada {
        private int horas;
        private double valorHora;

        public BicicletaAlugada(int horas, double valorHora) {
            setHoras(horas);
            setValorHora(valorHora);
        }

        public BicicletaAlugada() {}

        public void setHoras(int horas) {
            if (horas >= 1) {
                this.horas = horas;
            }
        }

        public void setValorHora(double valorHora) {
            if (valorHora > 0) {
                this.valorHora = valorHora;
            }
        }

        public double calcularValor() {
            return horas * valorHora;
        }
    }

    static class ProdutoEstoque {
        private String nome;
        private int quantidade;

        public ProdutoEstoque(String nome, int quantidade) {
            setNome(nome);
            setQuantidade(quantidade);
        }

        public ProdutoEstoque() {}

        public void setNome(String nome) {
            if (nome != null && !nome.equals("")) {
                this.nome = nome;
            }
        }

        public void setQuantidade(int quantidade) {
            if (quantidade >= 0) {
                this.quantidade = quantidade;
            }
        }

        public void adicionarEstoque(int qtd) {
            if (qtd > 0) {
                quantidade = quantidade + qtd;
            }
        }

        public void removerEstoque(int qtd) {
            if (qtd > 0 && quantidade - qtd >= 0) {
                quantidade = quantidade - qtd;
            }
        }

        public int getQuantidade() {
            return quantidade;
        }
    }

    static class Temperatura {
        private double celsius;

        public Temperatura(double celsius) {
            setCelsius(celsius);
        }

        public Temperatura() {}

        public void setCelsius(double celsius) {
            if (celsius >= -273.15) {
                this.celsius = celsius;
            }
        }

        public double paraFahrenheit() {
            return (celsius * 9 / 5) + 32;
        }

        public double paraKelvin() {
            return celsius + 273.15;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.println("Conta Bancária");
        System.out.print("Nome do titular: ");
        String titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldoInicial = sc.nextDouble();
        ContaBancaria conta = new ContaBancaria(titular, saldoInicial);
        System.out.print("Depósito: ");
        conta.depositar(sc.nextDouble());
        System.out.print("Saque: ");
        conta.sacar(sc.nextDouble());
        System.out.println("Saldo final: " + conta.getSaldo());
        System.out.println("");
        sc.nextLine(); 

        System.out.println("Filmes");
        System.out.print("Título do filme 1: ");
        String titulo1 = sc.nextLine();
        System.out.print("Avaliação do filme 1: ");
        double avaliacao1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Título do filme 2: ");
        String titulo2 = sc.nextLine();
        System.out.print("Avaliação do filme 2: ");
        double avaliacao2 = sc.nextDouble();
        Filme f1 = new Filme(titulo1, avaliacao1);
        Filme f2 = new Filme(titulo2, avaliacao2);
        f1.exibir();
        f2.exibir();
        System.out.println("");
        sc.nextLine();

        System.out.println("Funcionário");
        System.out.print("Nome: ");
        String nomeFunc = sc.nextLine();
        System.out.print("Salário: ");
        double salario = sc.nextDouble();
        Funcionario func = new Funcionario(nomeFunc, salario);
        System.out.print("Percentual de aumento: ");
        double perc = sc.nextDouble();
        func.aumentarSalario(perc);
        System.out.println("Salário final: " + func.getSalario());
        System.out.println("");

        System.out.println("Retângulo");
        System.out.print("Largura: ");
        double largura = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        Retangulo r = new Retangulo(largura, altura);
        System.out.println("Área: " + r.area());
        System.out.println("Perímetro: " + r.perimetro());
        System.out.println("");

        sc.nextLine();
        System.out.println("Música");
        System.out.print("Título música 1: ");
        String mus1 = sc.nextLine();
        System.out.print("Duração segundos: ");
        int dur1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Título música 2: ");
        String mus2 = sc.nextLine();
        System.out.print("Duração segundos: ");
        int dur2 = sc.nextInt();
        Musica m1 = new Musica(mus1, dur1);
        Musica m2 = new Musica(mus2, dur2);
        System.out.println(m1.getTitulo() + " - " + m1.formatarDuracao());
        System.out.println(m2.getTitulo() + " - " + m2.formatarDuracao());
        System.out.println("");

        sc.nextLine();
        System.out.println("Pessoa");
        System.out.print("Nome: ");
        String nomePessoa = sc.nextLine();
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Altura: ");
        double alt = sc.nextDouble();
        Pessoa p = new Pessoa(nomePessoa, peso, alt);
        System.out.println("IMC: " + p.calcularIMC());
        System.out.println("Classificação: " + p.classificacaoIMC());
        System.out.println("");

        System.out.println("Conta de Luz");
        System.out.print("Consumo KWh: ");
        double consumo = sc.nextDouble();
        System.out.print("Valor por KWh: ");
        double valorKwh = sc.nextDouble();
        ContaLuz contaLuz = new ContaLuz(consumo, valorKwh);
        System.out.println("Valor total: " + contaLuz.calcularValorTotal());
        System.out.println("");

        System.out.println("Bicicleta Alugada");
        System.out.print("Horas: ");
        int horas = sc.nextInt();
        System.out.print("Valor por hora: ");
        double valorHora = sc.nextDouble();
        BicicletaAlugada b = new BicicletaAlugada(horas, valorHora);
        System.out.println("Valor do aluguel: " + b.calcularValor());
        System.out.println("");

        sc.nextLine();
        System.out.println("Produto Estoque");
        System.out.print("Nome do produto: ");
        String nomeProd = sc.nextLine();
        System.out.print("Quantidade inicial: ");
        int qtd = sc.nextInt();
        ProdutoEstoque prod = new ProdutoEstoque(nomeProd, qtd);
        System.out.print("Adicionar quantidade: ");
        prod.adicionarEstoque(sc.nextInt());
        System.out.print("Remover quantidade: ");
        prod.removerEstoque(sc.nextInt());
        System.out.println("Quantidade final: " + prod.getQuantidade());
        System.out.println("");

        System.out.println("Temperatura");
        System.out.print("Celsius: ");
        double celsius = sc.nextDouble();
        Temperatura t = new Temperatura(celsius);
        System.out.println("Fahrenheit: " + t.paraFahrenheit());
        System.out.println("Kelvin: " + t.paraKelvin());
sc.close();
}
}