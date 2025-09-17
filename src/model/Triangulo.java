package model;

import java.util.Scanner;
import java.util.Arrays; // Importa a classe Arrays para ordenar os lados

public class Triangulo {
    // Atributos
    double base, lado1, lado2, altura, area, perimetro;
    String nome;

    Scanner scanner = new Scanner(System.in);

    // Cadastrar Triangulo
    public void cadastrarTriangulo() {
        System.out.println("/***************************/");
        System.out.println("/* Triângulo       */");
        System.out.println("/***************************/");
        System.out.print("/* Informe a base:         */");
        base = scanner.nextDouble();
        System.out.print("/* Informe o lado 1:       */");
        lado1 = scanner.nextDouble();
        System.out.print("/* Informe o lado 2:       */");
        lado2 = scanner.nextDouble();
        System.out.print("/* Informe a altura:       */");
        altura = scanner.nextDouble(); // Adicionado para calcular a área
        scanner.nextLine();
        System.out.print("/* Informe o nome:         */");
        nome = scanner.nextLine();
        System.out.println("/* Cadastrado com Sucesso */");
        System.out.println("/***************************/");
    }

    // Calcular Area
    public void calcularArea() {
        System.out.println("/************************/");
        System.out.println("/* Calcular Area     */");
        System.out.println("/************************/");
        if (altura > 0 && base > 0) {
            area = (base * altura) / 2;
            System.out.println("Área calculada com sucesso!");
        } else {
            System.out.println("Erro: Altura ou base inválida para o cálculo.");
        }
        System.out.println("/************************/");
    }

    // Calcular Perimetro
    public void calcularPerimetro() {
        System.out.println("/************************/");
        System.out.println("/* Calcular Perimetro   */");
        System.out.println("/************************/");
        perimetro = base + lado1 + lado2;
        System.out.println("Perímetro calculado com sucesso!");
        System.out.println("/************************/");
    }

    // Métodos que faltavam
    public boolean validarTriangulo() {
        if ((lado1 + lado2 > base) && (lado1 + base > lado2) && (lado2 + base > lado1)) {
            System.out.println("É um triângulo válido!");
            return true;
        } else {
            System.out.println("Não é um triângulo válido!");
            return false;
        }
    }

    public void tipoTriangulo() {
        System.out.println("/************************/");
        System.out.println("/* Verificar Tipo    */");
        System.out.println("/************************/");
        if (validarTriangulo()) {
            if (base == lado1 && base == lado2) {
                System.out.println("É um triângulo Equilátero!");
            } else if (base != lado1 && base != lado2 && lado1 != lado2) {
                System.out.println("É um triângulo Escaleno!");
            } else {
                System.out.println("É um triângulo Isósceles!");
            }
        }
    }

    public void verificarRetangulo() {
        System.out.println("/***************************/");
        System.out.println("/* Verificando Retângulo  */");
        System.out.println("/***************************/");
        if (validarTriangulo()) {
            double[] lados = {base, lado1, lado2};
            Arrays.sort(lados);
            if (Math.pow(lados[0], 2) + Math.pow(lados[1], 2) == Math.pow(lados[2], 2)) {
                System.out.println("É um triângulo retângulo!");
            } else {
                System.out.println("Não é um triângulo retângulo.");
            }
        }
    }

    public void verificar345() {
        System.out.println("/************************/");
        System.out.println("/* Verificar 3,4,5      */");
        System.out.println("/************************/");
        if (validarTriangulo()) {
            double[] lados = {base, lado1, lado2};
            Arrays.sort(lados);
            if (lados[0] == 3 && lados[1] == 4 && lados[2] == 5) {
                System.out.println("É um triângulo 3, 4, 5!");
            } else {
                System.out.println("Não é um triângulo 3, 4, 5.");
            }
        }
    }

    // Exibir Informações
    public void exibirInformacoes() {
        System.out.println("/*************************/");
        System.out.println("/* Informações Triângulo */");
        System.out.println("/*************************/");
        System.out.println("/* Nome: " + nome);
        System.out.println("/* Base: " + base);
        System.out.println("/* Lado 1: " + lado1);
        System.out.println("/* Lado 2: " + lado2);
        System.out.println("/* Altura: " + altura); // Adicionado
        System.out.println("/* Area: " + area);
        System.out.println("/* Perimetro: " + perimetro);
        System.out.println("/**************************/");
    }
}