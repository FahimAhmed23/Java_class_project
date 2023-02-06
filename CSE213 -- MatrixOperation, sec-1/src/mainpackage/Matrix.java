package mainpackage;

import java.util.Random;

public class Matrix {
    //fields
    private int noOfRows,noOfCols;
    private int[][] vals;
    //methods
    
    public void generateMatrixWithRandomValues(int r, int c){
        int i,j;
        this.noOfRows=r; this.noOfCols=c;
        this.vals = new int[noOfRows][noOfCols];
        Random rnd = new Random();
        for(i=0;i<this.noOfRows;i++){
            for(j=0;j<this.noOfCols;j++){
                this.vals[i][j] = rnd.nextInt(100);
            }
        }  
    }
    
    public Matrix addMatrix(Matrix m){
        Matrix temp = new Matrix();
        temp.noOfRows = noOfRows;
        temp.noOfCols = noOfCols;
        temp.vals = new int[temp.noOfRows][temp.noOfCols];
        int i,j;
        for(i=0;i<temp.noOfRows;i++){
            for(j=0;j<noOfCols;j++){
                temp.vals[i][j] =
                    this.vals[i][j] +
                    m.vals[i][j];
            }
        }       
        return temp;
    }
    public void showMatrix(){
        int i,j;
        for(i=0;i<noOfRows;i++){
            for(j=0;j<noOfCols;j++){
                System.out.print(vals[i][j]+" ");
            }
            System.out.println();
        }
    }
    public String getStringValueOfMatrix(){
        int i,j; String str="";
        for(i=0;i<noOfRows;i++){
            for(j=0;j<noOfCols;j++){
                str += (vals[i][j]+" ");
            }
            str += "\n";
        }
        return str;
    }
}
//Matrix m1,m2,m3;    m1.showMatrix();
//  m3.addMatrix(m1,m2);
//  m3 = m1.addMatrix(m2);