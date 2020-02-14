
package prototipo;

import java.sql.Connection;

import java.sql.DriverManager;

public class conexionSQL{

        private static Connection cn;

        public static Connection getConnection(){
            try{
                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                cn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SiGCIF","grupo03", "123");


            } catch(Exception e){

                cn = null;

            }
            return cn;

        }
        public static void main(String[] args){
            Connection pruebaCn=conexionSQL.getConnection();
            if(pruebaCn!=null){
                System.out.println("Conectado exitasamente a la base de datos");
                System.out.println(pruebaCn);
            }else{
                System.out.println("Desconectado");
            }


        }
}