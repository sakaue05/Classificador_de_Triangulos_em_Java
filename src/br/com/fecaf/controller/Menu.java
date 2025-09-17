package br.com.fecaf.controller;

import model.Circulo;
import model.Retangulo;
import model.Triangulo;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Retangulo retangulo = new Retangulo();
    Circulo circulo = new Circulo();
    Triangulo triangulo = new Triangulo();

    public void executarMenu() {

        boolean exit = false;

        while (!exit) {

            System.out.println("/******************************/");
            System.out.println("/*        Menu Principal      */");
            System.out.println("/******************************/");
            System.out.println("/* 1 - Retangulo              */");
            System.out.println("/* 2 - Circulo                */");
            System.out.println("/* 3 - Triangulo              */");
            System.out.println("/* 4 - Sair                   */");
            System.out.println("/******************************/");

            System.out.println("Informe uma opção: ");
            int userOption = scanner.nextInt();

            switch (userOption) {
                case 1:
                    boolean exitRetangulo = false;

                    while (!exitRetangulo) {
                        System.out.println("/*****************************/");
                        System.out.println("/*********   Menu   **********/");
                        System.out.println("/*****************************/");
                        System.out.println("1 - Cadastrar Retângulo");
                        System.out.println("2 - Calcular Area");
                        System.out.println("3 - Calcular Perimetro");
                        System.out.println("4 - Exibir Informações");
                        System.out.println("5 - Validar Quadrado");
                        System.out.println("6 - Sair");
                        System.out.println("/*****************************/");

                        int userOptionRetangulo = scanner.nextInt();
                        scanner.nextLine();


                        switch (userOptionRetangulo) {
                            case 1:
                                retangulo.cadastrarRetangulo();
                                break;
                            case 2:
                                retangulo.calcularArea();
                                break;
                            case 3:
                                retangulo.calcularPerimetro();
                                break;
                            case 4:
                                retangulo.exibirInformacoes();
                                break;
                            case 5:
                                retangulo.validarQuadrado();
                                break;
                            case 6:
                                System.out.println("Retornando ao Menu Principal...");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida !");
                        }
                    }



                    break;
                case 2:

                    boolean exitCirculo = false;

                    while (!exitCirculo) {

                        System.out.println("/****************************/");
                        System.out.println("/*       Menu Circulo       */");
                        System.out.println("/****************************/");
                        System.out.println("/* 1 - Cadastrar Circulo    */");
                        System.out.println("/* 2 - Calcular Area        */");
                        System.out.println("/* 3 - Calcular Perimetro   */");
                        System.out.println("/* 4 - Exibir Circulo       */");
                        System.out.println("/* 5 - Sair                 */");
                        System.out.println("/****************************/");

                        System.out.println("Informe uma opção: ");
                        int userOptionCirculo = scanner.nextInt();

                        switch (userOptionCirculo){
                            case 1:
                                circulo.cadastrarCirculo();
                                break;
                            case 2:
                                circulo.calcularArea();
                                break;
                            case 3:
                                circulo.calcularPerimetro();
                                break;
                            case 4:
                                circulo.exibirInformacoes();
                                break;
                            case 5:
                                System.out.println("Retornando ao Menu Principal...");
                                exitCirculo = true;
                                break;
                        }
                    }
                    break;
                case 3:
                    boolean exitTriangulo = false;

                    while (!exitTriangulo) {
                        System.out.println("/****************************/");
                        System.out.println("/*      Menu Triangulo      */");
                        System.out.println("/****************************/");
                        System.out.println("/* 1 - Cadastrar Triângulo  */");
                        System.out.println("/* 2 - Verificar Válido     */");
                        System.out.println("/* 3 - Tipo (Equilátero/...)*/");
                        System.out.println("/* 4 - Verificar Retângulo  */");
                        System.out.println("/* 5 - Verificar 3,4,5      */");
                        System.out.println("/* 6 - Exibir Informações   */");
                        System.out.println("/* 7 - Voltar               */");
                        System.out.println("/****************************/");

                        System.out.println("Informe uma opção: ");
                        int userOptionTriangulo = scanner.nextInt();

                        switch (userOptionTriangulo) {
                            case 1:
                                triangulo.cadastrarTriangulo();
                                break;
                            case 2:
                                triangulo.validarTriangulo();
                                break;
                            case 3:
                                triangulo.tipoTriangulo();
                                break;
                            case 4:
                                triangulo.verificarRetangulo();
                                break;
                            case 5:
                                triangulo.verificar345();
                                break;
                            case 6:
                                triangulo.exibirInformacoes();
                                break;
                            case 7:
                                System.out.println("Retornando ao Menu Principal...");
                                exitTriangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo ...");
                    exit = true;
                    break;
            }














        }
    }
}
