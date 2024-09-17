package math;
public class App {
    public static void main(String[] args) throws Exception {
        VectorOperation operation = new VectorOperation();
        Vector a = new Vector(34, 56);
        Vector b = new Vector(6, 34);
        Integer resultAdd = operation.add(34, 3);
        Integer resultSub = operation.subtract(34, 3);
        Integer resultDiv = operation.division(34, 3);
        Integer resultMul = operation.multiply(34, 3);

        operation.print(resultAdd);
        operation.print(resultSub);
        operation.print(resultMul);
        operation.print(resultDiv);
        
        Vector vectorResultAdd = operation.add(a, b);
        Vector vectorResultSub = operation.subtract(a, b);
        Vector vectorResultDiv = operation.division(a, b);
        Vector vectorResultMul = operation.multiply(a, b);

        operation.print(vectorResultAdd);
        operation.print(vectorResultSub);
        operation.print(vectorResultDiv);
        operation.print(vectorResultMul);
    }
}