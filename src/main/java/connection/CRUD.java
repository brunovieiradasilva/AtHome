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
import com.google.firebase.internal.NonNull;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import modelos.*;

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
            System.out.println("erro ao iniciar a conexão");
        }
    }

    private static Firestore db = null;

    public boolean add(Cliente cliente) {
        try {

            ApiFuture<WriteResult> future = db.collection("cliente").document(cliente.getCpf()).set(cliente);
            return true;
        } catch (Exception e) {

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

    public boolean add(Vendas venda) {
        try {
            venda.setActualTimestamp();
            ApiFuture<DocumentReference> addedDocRef = db.collection("venda").add(venda);
            System.out.println("enviou");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
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
                lista[i] = new Produto(document.getString("nome"), document.getString("preco"), document.getString("quantidade"), document.getId());

                i++;
            }
            System.out.println("try");

            return lista;
        } catch (Exception e) {
            Produto p = new Produto("erro ao carregar", "0", "0");
            Produto[] prod = {p};
            System.out.println("erro excesão");
            e.printStackTrace();
            return prod;
        }

    }

    public Cliente[] getTodosCliente() {
        int i = 0;

        try {
// asynchronously retrieve all documents
            ApiFuture<QuerySnapshot> tdCliente = db.collection("cliente").get();
// future.get() blocks on response
            List<QueryDocumentSnapshot> documentos = tdCliente.get().getDocuments();
            Cliente[] lista = new Cliente[documentos.size()];
            for (QueryDocumentSnapshot document : documentos) {
                lista[i] = new Cliente(document.getString("nome"), document.getString("cpf"), document.getString("email"), document.getString("rg"), document.getString("endereco"));

                i++;
            }
            System.out.println("try");

            return lista;
        } catch (Exception e) {
            Cliente p = new Cliente("erro ao carregar");
            Cliente[] cli = {p};
            System.out.println("erro excesão");
            e.printStackTrace();
            return cli;
        }

    }

    public Vendas[] getTodosVendas() {
        int i = 0;

        try {
// asynchronously retrieve all documents
            ApiFuture<QuerySnapshot> tdCliente = db.collection("venda").get();
// future.get() blocks on response
            List<QueryDocumentSnapshot> documentos = tdCliente.get().getDocuments();

            Vendas[] lista = new Vendas[documentos.size()];

            for (QueryDocumentSnapshot document : documentos) {
               // List produtos = document.get("produtos", List.class);
                // List quantidade = document.get("produtos", List.class);
               //   List valores = document.get("produtos", List.class);
                //lista[i] = new Vendas(document.getString("vendedor_id"), document.getString("cliente_id"), (List<String>)produtos,(List<String>) quantidade,(List<String>) valores, document.getTimestamp("timestamp"), document.getId());
lista[i] = document.toObject(Vendas.class);
lista[i].setId(document.getId());
                i++;
            }
            System.out.println("try");

            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public Produto[] getTodosProdutos(String nome) {
        int i = 0;

        try {
// asynchronously retrieve all documents
            ApiFuture<QuerySnapshot> tdCliente = db.collection("estoque").get();
// future.get() blocks on response
            List<QueryDocumentSnapshot> documentos = tdCliente.get().getDocuments();
            Produto[] lista = new Produto[documentos.size()];
            for (QueryDocumentSnapshot document : documentos) {
                if (document.getString("nome").toLowerCase().contains(nome.toLowerCase())) {
                    lista[i] = new Produto(document.getString("nome"), document.getString("preco"), document.getString("quantidade"), document.getId());
                }
                i++;
            }
            System.out.println("try");

            return lista;
        } catch (Exception e) {
            Produto p = new Produto("erro ao carregar", "0", "0");
            Produto[] prod = {p};
            System.out.println("erro excesão");
            e.printStackTrace();
            return prod;
        }

    }

    public Cliente[] getTodosCliente(String cpf) {
        int i = 0;

        try {
// asynchronously retrieve all documents
            ApiFuture<QuerySnapshot> tdCliente = db.collection("cliente").get();
// future.get() blocks on response
            List<QueryDocumentSnapshot> documentos = tdCliente.get().getDocuments();
            Cliente[] lista = new Cliente[documentos.size()];
            for (QueryDocumentSnapshot document : documentos) {
                if (document.getString("cpf").toLowerCase().contains(cpf.toLowerCase())) {
                    lista[i] = new Cliente(document.getString("nome"), document.getString("cpf"), document.getString("email"), document.getString("rg"), document.getString("endereco"));
                }
                i++;
            }
            System.out.println("try");

            return lista;
        } catch (Exception e) {
            Cliente p = new Cliente("erro ao carregar");
            Cliente[] cli = {p};
            System.out.println("erro excesão");
            e.printStackTrace();
            return cli;
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

    public Object getPorID(String colecao, String ID) {
        try {
            DocumentReference docRef = db.collection(colecao).document(ID);
// asynchronously retrieve the document
            ApiFuture<DocumentSnapshot> future = docRef.get();
// ...
// future.get() blocks on response
            DocumentSnapshot document = future.get();
            if (document.exists()) {
                switch (colecao) {
                    case "vendedor":
                        Vendedor vendedor = new Vendedor(document.getString("nome"), document.getString("cpf"), document.getString("usuario"), document.getString("email"), "");
                        return vendedor;
                    case "cliente":
                        Cliente cliente = new Cliente(document.getString("nome"), document.getString("cpf"), document.getString("email"), document.getString("rg"), document.getString("endereco"));
                        return cliente;
                    case "produto":
                        Produto produto = new Produto(document.getString("nome"), document.getString("preco"), document.getString("quantidade"), document.getId());
                        return produto;
                    default:
                        return null;
                }
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

    public boolean edit(String colecao , String ID, String field, String newValue) {
        try {

            // Update an existing document
            DocumentReference docRef = db.collection(colecao).document(ID);

// (async) Update one field
            ApiFuture<WriteResult> future = docRef.update(field, newValue);

// ...
            WriteResult result = future.get();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
