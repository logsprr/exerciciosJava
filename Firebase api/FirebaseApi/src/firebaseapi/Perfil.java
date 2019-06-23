package firebaseapi;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
/**
 *
 * @author Gabriel
 */
public class  Perfil {
    @JsonProperty("idade")
    private Integer idade;
    @JsonProperty("nome")
    private String nome;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idade")
    public Integer getIdade() {
    return idade;
    }

    @JsonProperty("idade")
    public void setIdade(Integer idade) {
    this.idade = idade;
    }

    @JsonProperty("nome")
    public String getNome() {
    return nome;
    }

    @JsonProperty("nome")
    public void setNome(String nome) {
    this.nome = nome;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    }
    
    public String toString(){
        return "idade: "+getIdade()+" nome: "+getNome();
    }
}
