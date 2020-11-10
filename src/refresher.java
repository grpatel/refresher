public class refresher{
        public static void main(String[] args) {
            System.out.println("Fix me!");
            for (int i = 0; i < args.length; i++) {
                String integer = args[i];
                try {
                    int n = Integer.parseInt(integer);
                    System.out.println(n);
                    String s = "Hello ";
                    for (int k = 1; k <= n; k++) {
                        System.out.println(s + args[k]);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Character " + args[0] + " entered was not an integer");
                    System.exit(1);
                } catch (ArrayIndexOutOfBoundsException f) {
                    System.err.println("Need " + args[0] + " names");
                    System.exit(1);

                }
            }
        }
    }

