/*
Los resultados de las últimas elecciones a la alcaldía de Valledupar fueron las siguientes:
Comuna Candidato
A
Candidato
B
Candidato
C
Candidato
D
1 194 48 206 45
2 180 20 320 16
3 221 90 140 20
4 432 50 821 14
5 820 61 946 18
Escribe un programa en java que realice los siguientes cálculos: 
 Imprimir la tabla de votaciones, incluyendo sus cabeceras
 Calcular e imprimir el número total de votos recibidos por cada candidato y el porcentaje del total de votos
emitidos. Indicar cuál ha sido el candidato más votado.
 Si algún candidato recibe más del 50% de los votos, el programa imprimirá un mensaje declarándole
ganador.
 Cual fue la comuna que mayor porcentaje de votación tuvo.
 Imprima la lista de candidatos ordenada descendentemente por votación alcanzada.
 */
package Puntos;

public class Punto5 {
    public void Principal(){
        int[][] matriz = {
            {1, 194, 48, 206, 45},
            {2, 180, 20, 320, 16},
            {3, 221, 90, 140, 20},
            {4, 432, 50, 821, 14},
            {5, 820, 61, 946, 18}
        };
        String cabecera[] = {"Columna" , "candidato A" , "candidato B" , "candidato C" , "candidato D"}; 
        int votos[] = new int[5];
        double porcentajes[] = new double[5];
        int total=0;
        System.out.println("_______________________________________________________________________");
        for (int i = 0; i < cabecera.length; i++) {
            System.out.print("| "+cabecera[i]+ " |");
        }
        System.out.println("\n_______________________________________________________________________");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("|    "+matriz[i][j]);
                if (j==0) {
                    System.out.print("    ");
                }else if(j==2){
                    System.out.print("       ");
                }else if(j==1 || j==3){
                    System.out.print("      ");
                }else if(j==4){
                    System.out.print("       ");
                }
                System.out.print("|");
                
                
                votos[j] = votos[j] + matriz[i][j];
                
                
            }
            System.out.println("");
        }
        System.out.println("_______________________________________________________________________");
        for (int i = 1; i < votos.length; i++) {
            total = total + votos[i];
        }
        for (int k = 1; k < votos.length; k++) {
            porcentajes[k] = (double)votos[k]/total*100;
            System.out.println("total votos candidato " + cabecera[k] + " es " + votos[k] + " con un " + porcentajes[k] + "% de votos" );
        }
        System.out.println("total votos "+ total);
        double mayor = 0;
        int pos = 0;
        for (int i = 1; i < porcentajes.length; i++) {
            if (porcentajes[i]>mayor) {
                mayor = porcentajes[i];
                pos=i;
            }
            if (porcentajes[i]>50) {
                System.out.println("el ganador es "+ cabecera[i]);
            }
        }
        System.out.println("El candidato con mayor porcentaje de votos es "+cabecera[pos]);
    }
}
