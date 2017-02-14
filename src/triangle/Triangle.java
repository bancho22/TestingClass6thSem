/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author Bancho
 */
public class Triangle {
    
    private int sideA;
    private int sideB;
    private int sideC;
    private int[] sides;
    
    public Triangle(int sideA, int sideB, int sideC) throws InvalidTriangleException{
        
        if(sideA + sideB < sideC){
            throw new InvalidTriangleException("Impossible triangle");
        }
        if(sideB + sideC < sideA){
            throw new InvalidTriangleException("Impossible triangle");
        }
        if(sideA + sideC < sideB){
            throw new InvalidTriangleException("Impossible triangle");
        }
        
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        sides = new int[3];
//        sides = new int[]{sideA, sideB, sideC};
        sides[0] = sideA;
        sides[1] = sideB;
        sides[2] = sideC;
        
        for (int side : sides) {
            if(side <= 0){
                throw new InvalidTriangleException("The size of the sides cannot be less than or equal to 0");
            }
        }
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }
    
    public TriangleType getTriangleType(){
        if(sideA == sideB && sideB == sideC){
            return TriangleType.EQUILATERAL;
        }
        if(sideA == sideB){
            return TriangleType.ISOSCELES;
        }
        if(sideB == sideC){
            return TriangleType.ISOSCELES;
        }
        if(sideC == sideA){
            return TriangleType.ISOSCELES;
        }
        return TriangleType.SCALENE;
    }
    
}
