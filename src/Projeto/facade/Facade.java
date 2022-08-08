package Projeto.facade;

import Projeto.Subsistema1.CrmService;
import Projeto.Subsistema2.CepApi;

public class Facade {
    public void migrarCliente (String nome,String cep ) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
