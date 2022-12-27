public class Main {
    /*Realiza un programa que simule el juego de dados conocido como "craps", de
forma que se cumplan las siguientes reglas:
• Un jugador tira dos dados, cada uno tiene 6 caras, cada cara contiene
un número del 1 al 6 (simula las tiradas utilizando números
aleatorios)
• Una vez se hayan lanzado los dados se calcula la suma de los puntos
obtenidos.
• Si en la primera tirada, la suma es 7 u 11 el jugador gana
• Si en la primera tirada la suma es 2, 3 o 12 el jugador pierda
• Si en la primera tirada la suma es 4, 5, 6, 8, 9, ó 10, entonces esta suma
se convierte en la "tirada"
• Para ganar, el jugador deberá continuar tirando los dados hasta que
consiga la misma suma que en la "tirada"
• El jugador perderá si antes de conseguir la misma suma que la tirada
sale un 7*/
    public static void main(String[] args) {

        int dado1 = tirarDado();
        System.out.println(dado1);
        int dado2 = tirarDado();
        System.out.println(dado2);

        int sumaDados = dado1 + dado2;

        if (sumaDados == 7 || sumaDados == 11) {
            System.out.println("La suma es: "+sumaDados+". Felicidades, has ganado!");
        } else if (sumaDados == 2 || sumaDados == 3 || sumaDados == 12) {
            System.out.println("La suma es: "+sumaDados+". Lo siento, has pedido.");
        } else {
            int tirada = 0;
            tirada = sumaDados;
            int lanzamiento;
            System.out.println("Ahora tu tirada es: "+tirada+", necesitas sacar este número otra vez para ganar! Si sacas un 7 perderás.");
            do {
                lanzamiento = tirarDado() + tirarDado();
                System.out.println("Has sacado: "+lanzamiento);
                if (lanzamiento == 7){
                    System.out.println("Lo siento, has perdido.");
                    return;
                }
            } while (lanzamiento != tirada);
            System.out.println("Felicidades, has ganado!");


        }
    }


    private static int tirarDado(){
        int tirada = (int) (Math.floor(Math.random() * (6) + 1));
        return tirada;
    }
    /*
    private static int tirarDado(){
        int r1 = new Random().nextInt(6) + 1;
        return r1;
    }
    */

}