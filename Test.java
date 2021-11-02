public class Test {

  public static void main(String[] args) {
    double[] inputs = {1.2, 5.1, 2.1};
    double[] weights = {3.1, 2.1, 8.7};
    double bias = 3;

    System.out.println(dotProduct(inputs, weights) + bias);
  }

  public static double dotProduct(double[] arr1, double[] arr2) {
    if (arr1.length != arr2.length) {
      throw new IllegalArgumentException("Arrays must have the same length.");
    }  

    double result = 0;

    for (int i = 0; i < arr1.length; i++) {
      result += arr1[i] * arr2[i];
    }

    return result;    
  }

}
