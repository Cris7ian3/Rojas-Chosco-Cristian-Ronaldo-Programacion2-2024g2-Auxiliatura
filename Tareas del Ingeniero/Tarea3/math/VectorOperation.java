package math;

public class VectorOperation extends BaseOperation{
    private Vector result;
    public Vector add(Vector a, Vector b) {
        Integer resultX = a.getX() + b.getX();
        Integer resultY = a.getY() + b.getY();
        result = new Vector(resultX, resultY);
        return result;
    }
    public Vector subtract(Vector a, Vector b) {
        Integer resultX = a.getX() - b.getX();
        Integer resultY = a.getY() - b.getY();
        result = new Vector(resultX, resultY);
        return result;
    }
    public Vector division(Vector a, Vector b) {
        Integer resultX = a.getX() * b.getX();
        Integer resultY = a.getY() * b.getY();
        result = new Vector(resultX, resultY);
        return result;
    }
    public Vector multiply(Vector a, Vector b) {
        Integer resultX = a.getX() / b.getX();
        Integer resultY = a.getY() / b.getY();
        result = new Vector(resultX, resultY);
        return result;
    }
    public void print (Vector result) {
        System.out.println("Result  x="  + result.getX() + " y = " + result.getY());
    }    

}
