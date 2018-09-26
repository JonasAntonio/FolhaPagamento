/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhapagamento;

import controller.CampoController;
import controller.DepartamentoController;
import controller.FolhaPagamentoController;
import controller.FuncionarioController;
import interfaces.Cargo;
import interfaces.FabricaCargos;
import model.Campo;
import model.Departamento;
import model.Funcionario;
import model.FolhaPagamento;
import model.fabrica.FabricaAdministrativo;
import model.fabrica.FabricaAnalista;
import model.fabrica.FabricaGerente;
import model.fabrica.FabricaSuporte;
import single.Singleton;
import view.CampoView;
import view.DepartamentoView;
import view.FolhaPagamentoView;
import view.FuncionarioView;

/**
 *
 * @author douglas, jonas, juan e lucas
 */
public class XPTOPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Chamando a Instancia
        Singleton singleton = Singleton.getInstance();

        // Models Campos
        Campo salario = new Campo(1, "salário", 1, 0, 0);
        Campo inss = new Campo(2, "INSS", 0.08f, 0, 0);
        Campo valeTransporte = new Campo(3, "Vale Transporte", 0.06f, 0, 0);
        Campo planoSaude = new Campo(4, "Plano de Saúde", 0.04f, 0, 0);

        //Inserindo na instancia do singleton
        singleton.campos.add(salario);
        singleton.campos.add(inss);
        singleton.campos.add(valeTransporte);
        singleton.campos.add(planoSaude);

        //Models Cargo
        Cargo cargoAdministrativo;
        Cargo cargoAnalista;
        Cargo cargoGerente;
        Cargo cargoSuporte;

        FabricaCargos cargo1 = new FabricaAdministrativo();
        cargoAdministrativo = cargo1.criarCargo();

        FabricaCargos cargo2 = new FabricaAnalista();
        cargoAnalista = cargo2.criarCargo();

        FabricaCargos cargo3 = new FabricaGerente();
        cargoGerente = cargo3.criarCargo();

        FabricaCargos cargo4 = new FabricaSuporte();
        cargoSuporte = cargo4.criarCargo();

        //Models Departamento
        Departamento departamento1 = new Departamento("Operações", "Informática");
        Departamento departamento2 = new Departamento("Suporte", "Informática");
        Departamento departamento3 = new Departamento("Administração", "RH");

        //Models Funcionarios
        Funcionario funcionario1 = new Funcionario("Douglas", "111.111.111-11", "MG-1.111.111", "1991:01:01", "1", "Rua 1", "(32)1111-1111", departamento1, cargoGerente, 4, 5000.0f);
        Funcionario funcionario2 = new Funcionario("Jonas", "222.222.222-22", "MG-2.222.222", "1991:02:02", "2", "Rua 1", "(32)1111-1111", departamento2, cargoGerente, 4, 5000.0f);
        Funcionario funcionario3 = new Funcionario("Juan", "333.333.333-33", "MG-3.333.333", "1991:03:03", "3", "Rua 1", "(32)1111-1111", departamento1, cargoAnalista, 2, 2500.0f);
        Funcionario funcionario4 = new Funcionario("Lucas", "444.444.444-44", "MG-4.444.444", "1991:04:04", "4", "Rua 1", "(32)1111-1111", departamento3, cargoGerente, 2, 4000.0f);
        Funcionario funcionario5 = new Funcionario("José", "555.555.555-55", "MG-5.555.555", "1991:05:05", "5", "Rua 1", "(32)1111-1111", departamento3, cargoAdministrativo, 4, 2500.0f);
        Funcionario funcionario6 = new Funcionario("Alen", "666.666.666-66", "MG-6.666.666", "1991:06:06", "6", "Rua 1", "(32)1111-1111", departamento2, cargoSuporte, 2, 2000.0f);

        //Instanciando os gerentes
        departamento1.setGerente(funcionario1);
        departamento2.setGerente(funcionario2);
        departamento3.setGerente(funcionario4);

        //Inserindo na instancia do singleton
        singleton.departamentos.add(departamento1);
        singleton.departamentos.add(departamento2);
        singleton.departamentos.add(departamento3);

        //Inserindo na instancia do singleton
        singleton.funcionarios.add(funcionario1);
        singleton.funcionarios.add(funcionario2);
        singleton.funcionarios.add(funcionario3);
        singleton.funcionarios.add(funcionario4);
        singleton.funcionarios.add(funcionario5);
        singleton.funcionarios.add(funcionario6);

        //Models Folhas de Pagamento
        FolhaPagamento folhaPagamento1 = new FolhaPagamento(singleton.campos, funcionario1, "2018:09:05");
        FolhaPagamento folhaPagamento2 = new FolhaPagamento(singleton.campos, funcionario2, "2018:09:05");
        FolhaPagamento folhaPagamento3 = new FolhaPagamento(singleton.campos, funcionario3, "2018:09:05");
        FolhaPagamento folhaPagamento4 = new FolhaPagamento(singleton.campos, funcionario4, "2018:09:05");
        FolhaPagamento folhaPagamento5 = new FolhaPagamento(singleton.campos, funcionario5, "2018:09:05");
        FolhaPagamento folhaPagamento6 = new FolhaPagamento(singleton.campos, funcionario6, "2018:09:05");

        //Inserindo na instancia do singleton
        singleton.folhasPagamentos.add(folhaPagamento1);
        singleton.folhasPagamentos.add(folhaPagamento2);
        singleton.folhasPagamentos.add(folhaPagamento3);
        singleton.folhasPagamentos.add(folhaPagamento4);
        singleton.folhasPagamentos.add(folhaPagamento5);
        singleton.folhasPagamentos.add(folhaPagamento6);

        //Views
        CampoView campoView = new CampoView();
        DepartamentoView departamentoView = new DepartamentoView();
        FolhaPagamentoView folhaPagamentoView = new FolhaPagamentoView();
        FuncionarioView funcionarioView = new FuncionarioView();

        //Controllers
        CampoController campoController;
        for (Campo campo : singleton.campos) {
            campoController = new CampoController(campo, campoView);
            campoController.atualizaView();
        }

        DepartamentoController departamentoController;
        for (Departamento departamento : singleton.departamentos) {
            departamentoController = new DepartamentoController(departamento, departamentoView);
            departamentoController.atualizaView();
        }

        FuncionarioController funcionarioController;
        for (Funcionario funcionario : singleton.funcionarios) {
            funcionarioController = new FuncionarioController(funcionario, funcionarioView);
            funcionarioController.atualizaView();
        }

        FolhaPagamentoController folhaPagamentoController;
        for (FolhaPagamento folhaPagamento : singleton.folhasPagamentos) {
            folhaPagamentoController = new FolhaPagamentoController(folhaPagamento, folhaPagamentoView);
            folhaPagamentoController.atualizaView();
        }

    }

}
