public class Areat {
   public static void main(String[] args) {
      
      double s1, s2, s3;
      double area, resArea;
     
      s1 = 35.0;
      s2 = 8.0;
      s3 = 38.0;
      area = (s1+s2+s3)/2.0d;
      resArea = Math.sqrt(area* (area - s1) * (area - s2) * (area - s3));
      System.out.println("Area of Triangle = " + resArea);
   }
}