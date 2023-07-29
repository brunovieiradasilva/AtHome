/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import modelos.Cliente;
import modelos.Produto;
import modelos.Vendedor;

/**
 *
 * @author Bruno
 */
public class CRUD {

    public CRUD() throws IOException {
        try {
            FirebaseInitialize conexao = new FirebaseInitialize();
            db = conexao.iniciarConexao();
        } catch (IOException e) {
            System.out.println("ja deu merda");
        }
    }

    private static Firestore db = null;

    public boolean add(Cliente cliente) {
        try {

            ApiFuture<WriteResult> future = db.collection("cliente").document(cliente.getCpf()).set(cliente);
            return true;
        } catch (Exception e) {
            System.out.println("merda no CRUD");
            return false;
        }
    }

    public boolean add(Vendedor vendedor) {
        try {
            ApiFuture<WriteResult> future = db.collection("vendedor").document(vendedor.getUsuario()).set(vendedor);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean add(Produto produto) {
        try {
            ApiFuture<DocumentReference> addedDocRef = db.collection("estoque").add(produto);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(String colecao, String ID) {
        try {

            ApiFuture<WriteResult> writeResult = db.collection(colecao).document(ID).delete();

            return true;
        } catch (Exception e) {
            return false;

        }
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
            return new Produto[0];
        }

    }

    public boolean loginVendedor(String usuario, String senha) throws InterruptedException, ExecutionException {
        try {
            CollectionReference vend = db.collection("vendedor");
            Query query = vend.whereEqualTo("usuario", usuario);
            ApiFuture<QuerySnapshot> querySnapshot = query.get();

            if (querySnapshot.get().getDocuments().get(0).get("senha").equals(senha)) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkIfExist(String colecao, String ID) {
        try {
            DocumentReference docRef = db.collection(colecao).document(ID);
            ApiFuture<DocumentSnapshot> future = docRef.get();

            DocumentSnapshot document = future.get();
            return document.exists();
        } catch (Exception e) {
            return true;

        }
    }
}
