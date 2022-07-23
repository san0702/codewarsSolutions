package codewars8kyu;

/**
 * You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
 * If it is a square, return its area. If it is a rectangle, return its perimeter.
 *
 * Example(Input1, Input2 --> Output):
 *
 * 6, 10 --> 32
 * 3, 3 --> 9
 *
 * Note: for the purposes of this kata you will assume that it is a square if its length and width are equal, otherwise it is a rectangle.
 * https://www.codewars.com/kata/5ab6538b379d20ad880000ab/train/java
 */

public class AreaOrPerimeter {
    public static int areaOrPerimeter2(int width, int length) {
        if(width==length){
            return width * length;
        }
        return (width+length) * 2;
    }

    public static int areaOrPerimeter(int width, int length) {
      return width==length ? width*length : (width+length) * 2;
    }
}
