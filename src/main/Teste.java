package main;

import controller.CategoriaController;
import controller.CidadeController;
import controller.ClienteController;
import controller.EnderecoController;
import controller.EstadoController;
import model.Categoria;
import model.Cidade;
import model.Cliente;
import model.Endereco;
import model.Estado;

public class Teste {
    public static void main(String[] args) {
    	
        // Inserir todos os estados
        EstadoController estadoController = new EstadoController();
        Estado[] estados = {
            new Estado(1, "Acre", "AC"),
            new Estado(2, "Alagoas", "AL"),
            new Estado(3, "Amapá", "AP"),
            new Estado(4, "Amazonas", "AM"),
            new Estado(5, "Bahia", "BA"),
            new Estado(6, "Ceará", "CE"),
            new Estado(7, "Distrito Federal", "DF"),
            new Estado(8, "Espírito Santo", "ES"),
            new Estado(9, "Goiás", "GO"),
            new Estado(10, "Maranhão", "MA"),
            new Estado(11, "Mato Grosso", "MT"),
            new Estado(12, "Mato Grosso do Sul", "MS"),
            new Estado(13, "Minas Gerais", "MG"),
            new Estado(14, "Pará", "PA"),
            new Estado(15, "Paraíba", "PB"),
            new Estado(16, "Paraná", "PR"),
            new Estado(17, "Pernambuco", "PE"),
            new Estado(18, "Piauí", "PI"),
            new Estado(19, "Rio de Janeiro", "RJ"),
            new Estado(20, "Rio Grande do Norte", "RN"),
            new Estado(21, "Rio Grande do Sul", "RS"),
            new Estado(22, "Rondônia", "RO"),
            new Estado(23, "Roraima", "RR"),
            new Estado(24, "Santa Catarina", "SC"),
            new Estado(25, "São Paulo", "SP"),
            new Estado(26, "Sergipe", "SE"),
            new Estado(27, "Tocantins", "TO")
        };

        estadoController.inserirTodosEstados(estados);

        // Inserir todas as capitais
        CidadeController cidadeController = new CidadeController();
        Cidade[] capitais = {
            new Cidade(1, "Rio Branco", estados[0]),
            new Cidade(2, "Maceió", estados[1]),
            new Cidade(3, "Macapá", estados[2]),
            new Cidade(4, "Manaus", estados[3]),
            new Cidade(5, "Salvador", estados[4]),
            new Cidade(6, "Fortaleza", estados[5]),
            new Cidade(7, "Brasília", estados[6]),
            new Cidade(8, "Vitória", estados[7]),
            new Cidade(9, "Goiânia", estados[8]),
            new Cidade(10, "São Luís", estados[9]),
            new Cidade(11, "Cuiabá", estados[10]),
            new Cidade(12, "Campo Grande", estados[11]),
            new Cidade(13, "Belo Horizonte", estados[12]),
            new Cidade(14, "Belém", estados[13]),
            new Cidade(15, "João Pessoa", estados[14]),
            new Cidade(16, "Curitiba", estados[15]),
            new Cidade(17, "Recife", estados[16]),
            new Cidade(18, "Teresina", estados[17]),
            new Cidade(19, "Rio de Janeiro", estados[18]),
            new Cidade(20, "Natal", estados[19]),
            new Cidade(21, "Porto Alegre", estados[20]),
            new Cidade(22, "Porto Velho", estados[21]),
            new Cidade(23, "Boa Vista", estados[22]),
            new Cidade(24, "Florianópolis", estados[23]),
            new Cidade(25, "São Paulo", estados[24]),
            new Cidade(26, "Aracaju", estados[25]),
            new Cidade(27, "Palmas", estados[26])
        };
        cidadeController.inserirTodasCapitais(capitais);

        // Inserir um endereço
        EnderecoController enderecoController = new EnderecoController();
        Cidade goiania = new Cidade(3, "Goiânia", estados[8]);
        Endereco endereco = new Endereco(1, "Lago Azul", 202, "Casa verde com marrom", "Parque Tremendão", 74394230, goiania);
        enderecoController.inserirEndereco(endereco);

        // Inserir uma categoria
        Categoria categoria = new Categoria(1, "Tecnologia", "Ativo", "url_da_imagem");
        CategoriaController categoriaController = new CategoriaController();
        categoriaController.inserirCategoria(categoria);

        // Inserir um cliente
        Cliente cliente = new Cliente(1, "José Santos", "000.000.000-00", "Masculino", "Ativo");
        ClienteController clienteController = new ClienteController();
        clienteController.inserirCliente(cliente);
    }
}
