public class CC2_Lab3 {
  public static void main(String[] args) {
    char n = 'N', i = 'I', c = 'C', o = 'O', l = 'L', e = 'E', exclamation = '!';
    long nn = n, ii = i, cc = c, oo = o, ll = l, ee = e, exclam = exclamation;
  
    System.out.println(n + " - " + nn);
    System.out.println(i + " - " + ii);
    System.out.println(c + " - " + cc);
    System.out.println(o + " - " + oo);
    System.out.println(l + " - " + ll);
    System.out.println(e + " - " + ee);
    System.out.println(exclamation + " - " + exclam);
  
        System.out.println(n + "" + i + "" + c + "" + o + "" + l + "" + e + "" + exclamation);
      
  
  long sum = (nn + ii + cc + oo + ll + ee + exclam);
  long product = (nn * ii * cc * oo * ll * ee * exclam);
  long avg = (sum/7);
  long remainder = product%avg;
  
      System.out.println("Sum: " + sum);
      System.out.println("Product: " + product);
      System.out.println("Average: " + avg);
      System.out.println("Remainder: " + remainder);
    }
  }