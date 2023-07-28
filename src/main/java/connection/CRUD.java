/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import modelos.Produto;

/**
 *
 * @author Bruno
 */
public class CRUD {

    public CRUD() {
        FirebaseInitialize conexao = new FirebaseInitialize();
        db = conexao.iniciarConexao();
    }

    private static Firestore db = null;

    public boolean addCliente(String cpf, String email, String endereco, String nome) {
        // Create a Map to store the data we want to set
        Map<String, String> docData = new HashMap<>();
        docData.put("cpf", cpf);
        docData.put("email", email);
        docData.put("endereco", endereco);
        docData.put("nome", nome);

// Add a new document (asynchronously) in collection "cities" with id "LA"
        try {

            ApiFuture<WriteResult> future = db.collection("cliente").document(cpf).set(docData);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
// ...
// future.get() blocks on response
    }

    public boolean deleteCliente(String cpf) {
        try {
            ApiFuture<WriteResult> writeResult = db.collection("cliente").document(cpf).delete();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean getCliente(String cpf) {
        try {
            ApiFuture<WriteResult> writeResult = db.collection("cliente").document(cpf).delete();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Produto[] getTodosProdutos() {
        int i = 0;

        try {
// asynchronously retrieve all documents
            ApiFuture<QuerySnapshot> tdCliente = db.collection("estoque").get();
// future.get() blocks on response
            List<QueryDocumentSnapshot> documentos = tdCliente.get().getDocuments();
            Produto[] lista = new Produto[documentos.size()];
            for (QueryDocumentSnapshot document : documentos) {
                lista[i] = new Produto(document.getString("nome"), document.getDouble("preco"), document.get("quantidade", int.class), document.getId());

                i++;
            }
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            return new Produto[0];
        }

    }
}
