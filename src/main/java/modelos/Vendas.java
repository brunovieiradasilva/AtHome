/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Bruno
 */
import com.google.cloud.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Vendas {

    private String vendedor_id, cliente_id, id;
    List<String> produtos, quantidades, valores;
    private Timestamp timestamp = null;

    public Vendas(){
        
    }
    
    public Vendas(String vendedor_id, String cliente_id, List<String> produtos, List<String> quantidades, List<String> valores) {
        this.vendedor_id = vendedor_id;
        this.cliente_id = cliente_id;
        this.produtos = produtos;
        this.quantidades = quantidades;
        this.valores = valores;
    }

    public Vendas(String vendedor_id, String cliente_id, List<String> produtos, List<String> quantidades, List<String> valores, Timestamp timestamp, String id) {
        this.vendedor_id = vendedor_id;
        this.cliente_id = cliente_id;
        this.produtos = produtos;
        this.quantidades = quantidades;
        this.valores = valores;
        this.timestamp = timestamp;
        this.id = id;
    }

   

    public void setActualTimestamp() {
        //  Calendar calendar = Calendar.getInstance(Locale.getDefault());
        //   Date data = calendar.getTime();
        //   this.timestamp = Timestamp.of(data);
        this.timestamp = Timestamp.now();
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public String getVendedor_id() {
        return vendedor_id;
    }

    public void setVendedor_id(String vendedor_id) {
        this.vendedor_id = vendedor_id;
    }

    public String getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }

    public List<String> getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(List<String> quantidades) {
        this.quantidades = quantidades;
    }

    public List<String> getValores() {
        return valores;
    }

    public void setValores(List<String> valores) {
        this.valores = valores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString(){
      
        Date data = timestamp.toDate();
        Locale brasil = Locale.getDefault();
        DateFormat f2 = DateFormat.getDateInstance(DateFormat.LONG, brasil);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return f2.format(data) + " as " + sdf.format(data);
         
    }
   

   

}
