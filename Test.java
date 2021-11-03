import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    double[] inputs = {1, 2, 3, 2.5};
    double[][] weights = {{0.2, 0.8, -0.5, 1.0},
                          {0.5, -0.91, 0.26, -0.5},
                          {-0.26, -0.27, 0.17, 0.87}};

    double bias[] = {2, 3, 0.5};

    System.out.println(Arrays.toString(sum(dot(weights, inputs), bias)));
  }

  public static double[] dot(double[][] arr1, double[] arr2) {
    if (arr1.length != arr2.length) {
      throw new IllegalArgumentException("Arrays must have the same length.");
    }  

    double[] result = new double[arr1.length];

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        result[i] += arr1[i][j] * arr2[j];
      }
    }

    return result;    
  }

  public static double[] sum(double[] arr1, double[] arr2) {
    if (arr1.length != arr2.length) {
      throw new IllegalArgumentException("Arrays must have the same length.");
    }  

    double[] result = new double[arr1.length];

    for (int i = 0; i < arr2.length; i++) {
      result[i] = arr1[i] + arr2[i];
    }

    return result;
  }

}
