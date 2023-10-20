package org.example.My_Way_To_Solve_LeetCode_Problems;

public class Can_place_flowers {

        public static boolean canPlaceFlowers(int[] flowerbed, int n) {

            int counter=0;
            if(flowerbed.length==1 && flowerbed[0]==0){
                counter++;
            }
            for (int i = 0; i < flowerbed.length - 1; i++) {

                if(i==0 && flowerbed[i]==0){
                    if (flowerbed[i + 1] == 0) {
                        counter++;
                        flowerbed[i] = 1;
                    }
                }
                if (i>=1 && flowerbed[i] == 0) {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        counter++;
                        flowerbed[i] = 1;
                    }
                    if(i+1 ==flowerbed.length-1 && flowerbed[i]==0 && flowerbed[i+1]==0 )
                    {
                        counter++;
                    }
                }
            }
            //System.out.println(counter);
            return counter >= n ? true : false;
        }

    public static void main(String[] args) {
        int[] flowerbed ={1,0,0,0,1};

       Boolean t = canPlaceFlowers(flowerbed,2);
        System.out.println(t);
    }
}


