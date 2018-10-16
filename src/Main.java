
import com.sun.org.apache.xpath.internal.SourceTree;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello OpenCV!");

        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        Mat M = new Mat(3,2, CvType.CV_8UC3, new Scalar(0,0,255));
        System.out.println("M: " + M);
        System.out.println("M: " + M.dump());

        System.out.println("Anzahl Zeilen: " + M.rows());
        System.out.println("Anzahl Spalten: " + M.cols());
        System.out.println("Anzahl Kanäle: " + M.channels());

        //Hinweis: Ordnung der Farbe: BGR und nicht RGB

        double[] data = {0, 255, 255};

        M.put(1, 1, data);
        M.put(0,0,255, 255, 20);

        System.out.println("M: " + M.dump());
        System.out.println("");

        double[] getData = M.get(0,0);
        System.out.println("Retreived data: " + Arrays.toString(getData));
        System.out.println("");

        //Matrix operations
        double[] data1 = {3, 4, 2,
                        5, 6, 2,
                        1, 8, 9};

        Mat A = new Mat (3,3, CvType.CV_64F);
        A.put(0,0,data1);
        System.out.println("A: " + A.dump());
        System.out.println("");

       //Transpose

        Mat AT = new Mat();
        AT = A.t();
        System.out.println("AT: " + AT.dump());
        System.out.println("");
/*
        // Compute Determinante

        System.out.println("det(A) = " + Core.determinant(A));

        //Inverse
        Mat B = A.inv();
        System.out.println("Inverse of A: " + B.dump());
        System.out.println("");

        //Multiplication (Elementweise)
        Mat C = B.mul(A);
        System.out.println("C: "+ C.dump());
        System.out.println("");

        // generalized matrix multiolication
        Mat E = new Mat();
        Core.gemm(A, B, 1, B, 0, E);
        System.out.println("E: " + E.dump());
        System.out.println("");

        //Mat F = new Mat();
        //F = A;
        //A.copyTo(F);
        Mat F = A.clone();

        System.out.println("A: " + A.dump());
        System.out.println("F: " + F.dump());
        F.put(2,2,88);
        System.out.println("Data put!");
        System.out.println("A: " + A.dump());
        System.out.println("F: " + F.dump());


*/



    }
}
