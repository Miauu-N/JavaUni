package ar.unlu.edu.poo.passwords;

import java.util.Random;

public class Password {
    private int longitud = 8;
    private String pass;

    public Password(){
        this.pass = passGenerator(longitud);
    }

    public Password(int longitud){
        this.longitud = longitud;
        this.pass = passGenerator(longitud);
    }

    public String getPass() {
        return this.pass;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.pass = passGenerator(longitud);
    }

    public void regeneratePass(){
        this.pass = passGenerator(longitud);
    }

    public boolean isStrong(){
        char[] a = pass.toCharArray();
        int[] contadores = new int[3];
        for (char c : a) {
            if (c > 65 && c < 90){ // mayus
                contadores[0]++;
            } else if (c > 97 && c < 122) {// minus
                contadores[1]++;
            } else if (c > 48 && c < 57) {// num
                contadores[2]++;
            }
        }
        return contadores[0] > 2 && contadores[1] > 1 && contadores[2] >= 2;
    }

    private static String passGenerator(int longitud){
        StringBuilder n = new StringBuilder();  // 65-90 mayus (25) / 97-122 minus (25) // 48-57 numeros
        char c;
        Random r = new Random();
        for(int i = 0;i < longitud;i++){
            int rand = r.nextInt(60);
            if (rand < 10){ // 48-57 numeros
                c = (char) (48 + rand);
            } else if (rand < 35) { // 65-90 mayus 10-34 rand
                c = (char) (rand + 55);
            }
            else{ // 97-122 minus (25) 35-59 rand
                c = (char) (rand + 62);
            }
            n.append(c);
        }
        return n.toString();
    }
}
