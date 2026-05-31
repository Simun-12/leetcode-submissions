package leetcodeDaily;

import java.util.Arrays;

public class DestroyAsteroids {
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {

        Arrays.sort(asteroids);
        for (int asteroid : asteroids) {
            if (mass < asteroid) {
                return false;
            }
            mass += asteroid;
        }
        return true;
    }
    public static void main(String[] args){
        int mass = 10;
        int[] asteroids = {3,9,19,5,21};
        System.out.println(asteroidsDestroyed(mass,asteroids));
    }

}
