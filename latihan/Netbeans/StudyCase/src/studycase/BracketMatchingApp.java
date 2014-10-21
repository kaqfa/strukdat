package studycase;

public class BracketMatchingApp {

    // implementasikan algoritma bracket matching di sini
    public void bracketMatching(String text){
        
    }
    
    public static void main(String[] args) {
        BracketMatchingApp app = new BracketMatchingApp();
        
        String text1 = 
                "{" +
                "    \"app_name\": \"aplikasi baru\"," +
                "    \"database\": {" +
                "        \"db_name\": \"database_lokal\"," +
                "        \"tables\": [" +
                "            {" +
                "                \"tb_name\": \"tabel1\"," +
                "                \"cols\": [" +
                "                    \"id\"," +
                "                    \"nama\"," +
                "                    \"alamat\"," +
                "                    \"telepon\"" +
                "                ]" +
                "            }," +
                "            {" +
                "                \"tb_name\": \"tabel2\"," +
                "                \"cols\": [" +
                "                    \"id\"," +
                "                    \"matkul\"," +
                "                    \"dosen\"," +
                "                    \"nilai\"" +
                "                ]" +
                "            }" +
                "        ]" +
                "    }" +
                "}";
        
        String text2 = 
                "{" +
                "    \"app_name\": \"aplikasi baru\"," +
                "    \"database\": {" +
                "        \"db_name\": \"database_lokal\"," +
                "        \"tables\": [" +
                "            {" +
                "                \"tb_name\": \"tabel1\"," +
                "                \"cols\": [" +
                "                    \"id\"," +
                "                    \"nama\"," +
                "                    \"alamat\"," +
                "                    \"telepon\"" +
                "                ]" +
                "            }," +
                "            {" +
                "                \"tb_name\": \"tabel2\"," +
                "                \"cols\": [" +
                "                    \"id\"," +
                "                    \"matkul\"," +
                "                    \"dosen\"," +
                "                    \"nilai\"" +
                "                ]" +
                "            }" +
                "        ]" +
                "    }" +
                ""; // kurung tutup kurang 1
        
        String text3 = 
                "{" +
                "    \"app_name\": \"aplikasi baru\"," +
                "    \"database\": {" +
                "        \"db_name\": \"database_lokal\"," +
                "        \"tables\": [" +
                "            {" +
                "                \"tb_name\": \"tabel1\"," +
                "                \"cols\": [" +
                "                    \"id\"," +
                "                    \"nama\"," +
                "                    \"alamat\"," +
                "                    \"telepon\"" +
                "                ]" +
                "            }," +
                "            {" +
                "                \"tb_name\": \"tabel2\"," +
                "                \"cols\": [" +
                "                    \"id\"," +
                "                    \"matkul\"," +
                "                    \"dosen\"," +
                "                    \"nilai\"" +
                "                " + // ada kurung tutup kotak yang hilang
                "            }" +
                "        ]" +
                "    }" +
                "}";
        app.bracketMatching(text1);
        app.bracketMatching(text2);
        app.bracketMatching(text3);
        
    }
    
}
