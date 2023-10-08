package br.com.postech.parkassist.controller.request;

import br.com.postech.parkassist.model.Estacionamento;
import br.com.postech.parkassist.model.TipoCobranca;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

public record TempoVariavelRequest(String idCondutor, String placa) {
    public Estacionamento toEntity() {
        return new Estacionamento(null, new ObjectId(this.idCondutor()), placa, TipoCobranca.TEMPO_VARIAVEL,
                null, LocalDateTime.now(), null, null);
    }

}