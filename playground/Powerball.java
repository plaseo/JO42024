package playground;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class trash{
public static void main(String[] args) {
    
    
    
}
public static void getNumbers() {
    var a=[];   //  array to return
    for(i=1;5>=i;i++){  //  for loop to get first 5 numbers
        var b = Math.floor(Math.random()*59)+1; //  set #
        while (a.indexOf(b) > -1) { b = Math.floor(Math.random()*59)+1; }   //  reset # if already used
        a.push(b);  //  add number to array
    }
    a.push(Math.floor(35*Math.random())+1); //  add ball 6 number
    return a;   //  0 index array will have a length of 6, [0-4] being whiteball numbers, [5] being the red ball
}



// public int[] powerBalls() {
//   // create array with all numbers
//   List<Integer> balls = new ArrayList<Integer>(69);
//   for (int i = 1; i <= 69; i++)
//     balls.add(i);

//   // shuffle
//   Collections.shuffle(balls);

//   // take first 5
//   int[] result = new int[5];
//   for (int i = 0; i < 5; i++)
//     result[i] = balls.get(i);

//   return result;
// }




}

