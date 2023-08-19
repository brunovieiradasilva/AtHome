/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Bruno
 */

public class FirebaseInitialize {

    public Firestore iniciarConexao() throws FileNotFoundException, IOException {
  
            FileInputStream serviceAccount = new FileInputStream("src\\main\\java\\connection/trabalholp-a4cc2-firebase-adminsdk-lg0k9-c0acc1c243.json");

            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://trabalholp-a4cc2-default-rtdb.firebaseio.com")
                    .build();

        if(FirebaseApp.getApps().isEmpty()) { //<------- Here
            FirebaseApp.initializeApp(options);
        }

        
        return FirestoreClient.getFirestore();
    }
}
