/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 *
 * @author Fernando
 */
public class Funciones {
    
    ArrayList<Planilla> arrayPlanilla = new ArrayList();
    String ruta = "src/org/reguardar.txt";
    
    public void guarda(Planilla clase) {
        arrayPlanilla.add(clase);
        for (int i=0;i<arrayPlanilla.size();i++) {
            System.out.println(arrayPlanilla.get(i));
        }
    }
    
    public void guardaArchivo(Planilla clase) throws IOException {
        try{
            arrayPlanilla.add(clase);
            
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(ruta,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print("|"+clase.getId_planilla());
            pw.print("|"+clase.getAnho());
            pw.print("|"+clase.getMes());
            pw.print("|"+clase.getEmpresa_id_empresa());
            pw.print("\n");
            pw.close();
        }catch(Exception e){
            System.out.println("Esto sale en pantalla\n"+e);
        }
    }
    
    public void leer() throws IOException {
        
        try{
            Planilla plan = new Planilla();
            Vector lectorVector= new Vector();
            /*
            FileReader fr = new  FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            String d;
           
            while((d = br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer(d,"|");
                //System.out.println("--- "+dato.);
                
                while(dato.hasMoreTokens()){
                    lectorVector.addElement(dato.nextToken());
                    //System.out.println("Esto sale en "+dato.nextToken());
                }
            }
            
            System.out.print(lectorVector.elementAt(2)+"\t");
            for(int i=0; i<lectorVector.size(); i++){
                //System.out.print(lectorVector.elementAt(i)+"\t");
            }
            
             */
            File archivo = new File(ruta);
            Scanner leer = new Scanner(archivo);
             String datosguardar = "";
            while (leer.hasNextLine()){
                String datos = leer.nextLine();   
                String[] datosParseados = datos.split("\n");
                for(int x=0; x<datosParseados.length; x++){
                     //String[] mayores = datosParseados[x].split(";");
                     //for(int z=0; z<mayores.length; z++){
                     //    System.out.println(mayores[z]);
                     //}
                     String[] lineaTxt = datosParseados[x].split(";");
                     //System.out.println(lineaTxt[0]);
                     Planilla unaPlanilla = new Planilla(Integer.parseInt(lineaTxt[0]),Integer.parseInt(lineaTxt[1]),lineaTxt[2],Integer.parseInt(lineaTxt[3]));
                     System.out.println(unaPlanilla);
//plan.setId_planilla( Integer.parseInt(lineaTxt[0]));
                }
                //System.out.println("Esto sale en "+datosParseados[0]);
            };
           
        }catch(Exception e){
            System.out.println("Esto sale en pantalla\n"+e);
        }
    }

}


